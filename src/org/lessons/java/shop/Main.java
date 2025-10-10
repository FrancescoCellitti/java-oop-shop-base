package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
         Prodotto pc = new Prodotto(100, 22, "computer");        /* Prodotto pc = new Prodotto(); */

        System.out.println("=== INFORMAZIONI PRODOTTO ===");
        pc.setName("ciao");
        // Chiama le funzioni direttamente (non dentro println!)
        pc.completeName();    // Stampa: codice-nome
        /* pc.basePrice();   */     // Stampa: prezzo base
        pc.ivaPrice();        // Stampa: prezzo con IVA
        
        System.out.println("\n=== ACCESSO DIRETTO AI CAMPI ===");
        System.out.println("Codice: " + pc.getCode());
        System.out.println("Nome: " + pc.getName());
        System.out.println("Prezzo: " + pc.getPrice());
        System.out.println("IVA: " + pc.getIva() + "%");
        
    }
}
