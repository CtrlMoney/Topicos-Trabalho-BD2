package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import com.github.javafaker.Faker;

public class PessoaCartaoGeneretor extends Thread {
    private FileWriter fw;
    private int qtdInsert;
    private int qtdLinhasPorVez;
    private int qtdPessoas;
    private int qtdCartoes;

    public PessoaCartaoGeneretor(FileWriter fw, int qtdInsert, int qtdLinhasPorVez, int qtdPessoas, int qtdCartoes) {
        this.fw = fw;
        this.qtdInsert = qtdInsert;
        this.qtdLinhasPorVez = qtdLinhasPorVez;
        this.qtdPessoas = qtdPessoas;
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

        for (int i = 0; i < qtdInsert; i++) {
            String sql = "INSERT INTO pessoa_cartao (fk_pessoa_usuario, fk_cartao) VALUES ";
            fw.write(sql);

            for (int j = 0; j < qtdLinhasPorVez; j++) {
                int fkPessoa = faker.random().nextInt(1,qtdPessoas);
                int fkCartao = faker.random().nextInt(1, qtdCartoes);
                
                sql = String.format("(%d,%d)", fkPessoa, fkCartao);

                fw.write(sql);
                if (j != qtdLinhasPorVez - 1) {
                    fw.write(",\n");
                } else {
                    fw.write(";");
                }

                fw.flush();
            }

            System.out.println("Pacote de Pessoa-Cartão nº " + (i + 1) + " com " + qtdLinhasPorVez + " linhas");
        }

        System.out.println("\n\n''''''''''''Pessoa-Cartão Geradas''''''''''\n\n");
    }
}