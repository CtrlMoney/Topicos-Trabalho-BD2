package com.mycompany.faker;

import com.github.javafaker.CreditCardType;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class CartaoGenerator extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;
    private String[] cartoes = new String[]{"Mastercard","Visa","Nubank","American"};

    public CartaoGenerator(FileWriter fw, int qtdInsert, int qtdLinhasPorVez) {
        this.fw = fw;
        this.qtdInsert = qtdInsert;
        this.qtdLinhasPorVez = qtdLinhasPorVez;
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

        int numeroCartao = 1;
        for (int i = 0; i < qtdInsert; i++) {
            String sql = "INSERT INTO cartao (nome, limite, dia_fechamento, dia_vencimento, numero) VALUES ";
            fw.write(sql);

            for (int j = 0; j < qtdLinhasPorVez; j++) {
                String nome = cartoes[faker.random().nextInt(0, 3)];
                double limite = faker.number().randomDouble(2, 300, 10000);

                int diaFechamento = faker.random().nextInt(1,28);
                int diaVenc = faker.random().nextInt(1,28);

                sql = String.format(Locale.US,"('%s',%.2f,%d, %d,'%d')", nome, limite, diaFechamento,diaVenc, numeroCartao);

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
                numeroCartao++;
            }

            System.out.println("Pacote de Cartão nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Cartões Gerados''''''''''\n\n");
    }
}