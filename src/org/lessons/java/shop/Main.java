package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto pc = new Prodotto(100, 22, "computer");

        System.out.println("=== INFORMAZIONI PRODOTTO ===");
        
        // Chiama le funzioni direttamente (non dentro println!)
        pc.completeName();    // Stampa: codice-nome
        pc.basePrice();       // Stampa: prezzo base
        pc.ivaPrice();        // Stampa: prezzo con IVA
        
        System.out.println("\n=== ACCESSO DIRETTO AI CAMPI ===");
        System.out.println("Codice: " + pc.code);
        System.out.println("Nome: " + pc.name);
        System.out.println("Prezzo: " + pc.price);
        System.out.println("IVA: " + pc.iva + "%");
    }
}
