package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class PessoasGenerator extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;

    public PessoasGenerator(FileWriter fw, int qtdInsert, int qtdLinhasPorVez) {
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

        for (int i = 0; i < qtdInsert; i++) {
            String sql = "INSERT INTO pessoa_usuario (nome,cpf,login,senha,data_nasc) VALUES ";

            fw.write(sql);
            for (int j = 0; j < qtdLinhasPorVez; j++) {
                String nome = faker.name().fullName();
                String cpf = GeradorCPF.geraCPF();
                String login = faker.internet().emailAddress();
                String senha = faker.internet().password(128, 129);
                Date dataNasc = faker.date().birthday();

                sql = String.format("('%s','%s','%s','%s','%s')", nome, cpf, login, senha,
                        FakerBd.getDataString(dataNasc));

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
            }

            System.out.println("Pacote de Pessoa nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Pessoas Geradas''''''''''\n\n");
    }
}