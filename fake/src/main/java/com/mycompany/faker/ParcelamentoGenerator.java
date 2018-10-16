package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import com.github.javafaker.Faker;

public class ParcelamentoGenerator extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;
    private int qtdCartoes;

    public ParcelamentoGenerator(FileWriter fw, int qtdInsert, int qtdLinhasPorVez, int qtdCartoes) {
        this.fw = fw;
        this.qtdInsert = qtdInsert;
        this.qtdLinhasPorVez = qtdLinhasPorVez;
        this.qtdCartoes = qtdCartoes;
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

        int fkDespesa = 1; 
        for (int i = 0; i < qtdInsert; i++) {
            String sql = "INSERT INTO parcelamento (num_parcelas, fk_despesa, fk_cartao) VALUES ";
            fw.write(sql);

            for (int j = 0; j < qtdLinhasPorVez; j++) {
                int numParcelas = faker.random().nextInt(1, 10);

                int fkCartao = faker.random().nextInt(1, qtdCartoes);

                sql = String.format("(%d,%d,%d)", numParcelas, fkDespesa, fkCartao);

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
                fkDespesa++;
            }

            System.out.println("Pacote de Parcelamento nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Parcelamentos Geradas''''''''''\n\n");
    }
}