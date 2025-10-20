package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto pc = new Prodotto(100, 22, "computer");
        Studente studente1 = new Studente("francesco", "Cellitti", 24);
        Studente studente2 = new Studente("Marco", "Rossi", 22);
        Studente studente3 = new Studente("Anna", "Bianchi", 23);
        ContoBancario conto = new ContoBancario();
        Registro registro = new Registro();
        System.out.println("=== INFORMAZIONI PRODOTTO ===");
        pc.setName("ciao");

        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);
        registro.stampaStudenti();

        pc.completeName();

        pc.ivaPrice();

        System.out.println("\n=== ACCESSO DIRETTO AI CAMPI ===");
        System.out.println("Codice: " + pc.getCode());
        System.out.println("Nome: " + pc.getName());
        System.out.println("Prezzo: " + pc.getPrice());
        System.out.println("IVA: " + pc.getIva() + "%");

        System.out.println("info studenti: " + studente1.getinfo() + " anni");
        System.out.println("numero conto: " + conto.getConto());

        conto.setSaldo(new BigDecimal("100002.50"));
        System.out.println("Saldo conto: " + conto.getSaldo());

    }
}
