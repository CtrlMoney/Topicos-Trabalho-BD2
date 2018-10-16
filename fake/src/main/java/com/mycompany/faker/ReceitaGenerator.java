package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class ReceitaGenerator extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;
    private int qtdPessoa;
    private int qtdCatReceita;

    public ReceitaGenerator(FileWriter fw, int qtdInsert, int qtdLinhasPorVez, int qtdPessoa, int qtdCatReceita) {
        this.fw = fw;
        this.qtdInsert = qtdInsert;
        this.qtdLinhasPorVez = qtdLinhasPorVez;
        this.qtdPessoa = qtdPessoa;
        this.qtdCatReceita = qtdCatReceita;
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
            String sql = "INSERT INTO receita (valor,data_recebimento,fixo,nome, fk_pessoa_usuario, fk_categoria_receita) VALUES ";
            fw.write(sql);

            for (int j = 0; j < qtdLinhasPorVez; j++) {
                double valor = faker.number().randomDouble(2, 1, 10000);
                Date dataRecebimento = faker.date().birthday(0, 1);
                boolean fixo = faker.bool().bool();
                String nome = faker.commerce().productName();
                int fkPessoa = faker.random().nextInt(1, qtdPessoa);
                int fkCategoriaReceita = faker.random().nextInt(1, qtdCatReceita);

                sql = String.format(Locale.US,"(%.2f,'%s',%b,'%s',%d,%d)", 
                        valor, FakerBd.getDataString(dataRecebimento),
                        fixo, nome, fkPessoa, fkCategoriaReceita);

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
            }

            System.out.println("Pacote de Receita nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Receitas Geradas''''''''''\n\n");
    }
}