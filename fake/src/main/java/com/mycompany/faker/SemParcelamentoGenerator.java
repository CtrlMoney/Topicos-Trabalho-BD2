package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class SemParcelamentoGenerator extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;
    private int fkDespesaInicial;

    public SemParcelamentoGenerator(FileWriter fw, int qtdInsert, int qtdLinhasPorVez,  int fkDespesaInicial) {
        this.fw = fw;
        this.qtdInsert = qtdInsert;
        this.qtdLinhasPorVez = qtdLinhasPorVez;
        this.fkDespesaInicial = fkDespesaInicial;
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
            String sql = "INSERT INTO sem_parcelamento (data_pag, fk_despesa) VALUES ";
            fw.write(sql);

            for (int j = 0; j < qtdLinhasPorVez; j++) {
                Date dataPag = faker.date().birthday(0, 1);

                sql = String.format("('%s',%d)", FakerBd.getDataString(dataPag), fkDespesaInicial);
                fkDespesaInicial++;

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
            }

            System.out.println("Pacote de Sem Parcelamento nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Sem Parcelamentos Geradas''''''''''\n\n");
    }
}