package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto pc = new Prodotto(100, 22, "computer");
        Studente studente = new Studente("francesco", "Cellitti", 24);
        ContoBancario conto = new ContoBancario();
        System.out.println("=== INFORMAZIONI PRODOTTO ===");
        pc.setName("ciao");

        pc.completeName();

        pc.ivaPrice();

        System.out.println("\n=== ACCESSO DIRETTO AI CAMPI ===");
        System.out.println("Codice: " + pc.getCode());
        System.out.println("Nome: " + pc.getName());
        System.out.println("Prezzo: " + pc.getPrice());
        System.out.println("IVA: " + pc.getIva() + "%");

        System.out.println("info studenti: " + studente.getinfo() + " anni");
        System.out.println("numero conto: " + conto.getConto());

        conto.setSaldo(new BigDecimal("100002.50"));
        System.out.println("Saldo conto: " + conto.getSaldo());

    }
}
