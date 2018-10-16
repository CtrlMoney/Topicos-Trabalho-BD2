package com.mycompany.faker;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 20162BSI0511
 */
public class FakerBd {

    public static String getDataString(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter fw;

        final int TAM_BLOCO = 10000;

        final int QTD_PESSOAS = TAM_BLOCO;
        final int QTD_CAT_RECEITAS = 4;
        final int QTD_CAT_DESPESAS = 6;
        final int QTD_FORMA_PAG = 2;
        final int QTD_DESPESAS = TAM_BLOCO * 150;
        final int QTD_CARTOES = TAM_BLOCO * 15;

        /*fw = new FileWriter(new File("CatReceitas.sql"));
        new CatReceitasGenerator(fw, new String[] { "Salário", "Vendas", "Pensão", "Outros" }).start();

        fw = new FileWriter(new File("CatDespesa.sql"));
        new CatDespesaGenerator(fw, new String[] { "Moradia", "Alimentação", "Educação", "Transport", "Lazer", "Outros" }).start();

        fw = new FileWriter(new File("FormaPag.sql"));
        new FormaPagGenerator(fw, new String[] { "Dinheiro", "Cartão" }).start();

        fw = new FileWriter(new File("Pessoa.sql"));
        new PessoasGenerator(fw, 1, QTD_PESSOAS).start();

        fw = new FileWriter(new File("Receita.sql"));
        new ReceitaGenerator(fw, 150, TAM_BLOCO, QTD_PESSOAS, QTD_CAT_RECEITAS).start();

        fw = new FileWriter(new File("Despesa.sql"));
        new DespesaGenerator(fw, 150, TAM_BLOCO, QTD_PESSOAS, QTD_CAT_DESPESAS, QTD_FORMA_PAG).start();

        fw = new FileWriter(new File("Cartao.sql"));
        new CartaoGenerator(fw, 15, TAM_BLOCO).start();

        fw = new FileWriter(new File("Pessoa_Cartao.sql"));
        new PessoaCartaoGeneretor(fw, 5, TAM_BLOCO, QTD_PESSOAS, QTD_CARTOES).start();

        fw = new FileWriter(new File("Parcelamento.sql"));
        new ParcelamentoGenerator(fw, 20, TAM_BLOCO, QTD_DESPESAS, QTD_CARTOES).start();
*/



        //Criação do arquivo que contem todos os inserts
        fw = new FileWriter(new File("All.sql"));
        Thread t;

        t = new CatReceitasGenerator(fw, new String[] { "Salário", "Vendas", "Pensão", "Outros" });
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new CatDespesaGenerator(fw,new String[] { "Moradia", "Alimentação", "Educação", "Transport", "Lazer", "Outros" });
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new FormaPagGenerator(fw, new String[] { "Dinheiro", "Cartão" });
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new PessoasGenerator(fw, 1, QTD_PESSOAS);
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new ReceitaGenerator(fw, 150, TAM_BLOCO, QTD_PESSOAS, QTD_CAT_RECEITAS);
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new DespesaGenerator(fw, 150, TAM_BLOCO, QTD_PESSOAS, QTD_CAT_DESPESAS, QTD_FORMA_PAG);
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new CartaoGenerator(fw, 15, TAM_BLOCO);
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new PessoaCartaoGeneretor(fw, 5, TAM_BLOCO, QTD_PESSOAS, QTD_CARTOES);
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        t = new ParcelamentoGenerator(fw, 120, TAM_BLOCO, QTD_CARTOES);
        t.start();
        t.join();
        fw.write("\n");
        fw.flush();

        new SemParcelamentoGenerator(fw, 30, TAM_BLOCO, 1200001).start();
    }
}
