package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;

public class CatDespesaGenerator extends Thread {
    private FileWriter fw;
    private String[] categorias;

    public CatDespesaGenerator(FileWriter fw, String[] categorias) {
        this.fw = fw;
        this.categorias = categorias;
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

        String sql = "INSERT INTO categoria_despesa (nome_categ) VALUES ";
        fw.write(sql);

        for (int i = 0; i < categorias.length - 1; i++) {
            fw.write("('" + categorias[i] + "'),");
        }

        fw.write("('" + categorias[categorias.length - 1] + "');");

        fw.flush();

        System.out.println("\n\n''''''''''''Categorias de Despesa Geradas''''''''''\n\n");
    }
}