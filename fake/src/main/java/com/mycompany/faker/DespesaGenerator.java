package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class DespesaGenerator extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;
    private int qtdPessoa;
    private int qtdCatDespesa;
    private int qtdFormaPag;

    public DespesaGenerator(FileWriter fw, int qtdInsert, int qtdLinhasPorVez, int qtdPessoa, int qtdCatDespesa, int qtdFormaPag) {
        this.fw = fw;
        this.qtdInsert = qtdInsert;
        this.qtdLinhasPorVez = qtdLinhasPorVez;
        this.qtdPessoa = qtdPessoa;
        this.qtdCatDespesa = qtdCatDespesa;
        this.qtdFormaPag = qtdFormaPag;
    }

    @Override
    public void run() {
        try {
            generate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generate() throws IOException {
        Faker faker = new Faker(new Locale("pt-BR"));

        for (int i = 0; i < qtdInsert; i++) {
            String sql = "INSERT INTO despesa (valor,data_compra, fixo,nome, fk_pessoa_usuario, fk_categoria_despesa, fk_forma_pag) VALUES ";
            fw.write(sql);

            for (int j = 0; j < qtdLinhasPorVez; j++) {
                double valor = faker.number().randomDouble(2, 1, 10000);
                Date dataCompra = faker.date().birthday(0, 1);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(dataCompra);
                calendar.add(Calendar.DATE, faker.random().nextInt(1, 15));

                boolean fixo = faker.bool().bool();
                String nome = faker.commerce().productName();
                int fkPessoa = faker.random().nextInt(1, qtdPessoa);
                int fkCatDespesa = faker.random().nextInt(1, qtdCatDespesa);
                int fkFormaPag = faker.random().nextInt(1, qtdFormaPag);

                sql = String.format(Locale.US,"(%.2f,'%s',%b,'%s',%d,%d,%d)", 
                        valor, FakerBd.getDataString(dataCompra),
                        fixo, nome, fkPessoa, fkCatDespesa, fkFormaPag);

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
            }

            System.out.println("Pacote de Despesa nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Despesas Geradas''''''''''\n\n");
    }
}