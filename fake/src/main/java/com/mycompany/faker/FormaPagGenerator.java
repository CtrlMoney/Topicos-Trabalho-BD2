package com.mycompany.faker;

import java.io.FileWriter;
import java.io.IOException;

public class FormaPagGenerator extends Thread{
    private FileWriter fw;
    private String[] formasPag;

    public FormaPagGenerator(FileWriter fw, String[] formasPag) {
        this.fw = fw;
        this.formasPag = formasPag;
    }

    @Override
    public void run() {
        try {
            generate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generate() throws IOException {
        String sql = "INSERT INTO forma_pag (tipo_pag) VALUES ";
        fw.write(sql);

        for (int i = 0; i < formasPag.length - 1 ; i++) {
            fw.write("('" + formasPag[i] + "'),");
        }

        fw.write("('" + formasPag[formasPag.length-1] + "');");

        fw.flush();

        System.out.println("\n\n''''''''''''Formas de Pagamento Geradas''''''''''\n\n");
    }
}