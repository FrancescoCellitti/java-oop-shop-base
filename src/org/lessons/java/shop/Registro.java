package org.lessons.java.shop;

public class Registro {
    private Studente[] studenti;
    private int numeroStudenti;

    
    public Registro() {
        this.studenti = new Studente[100]; 
    }

    public void aggiungiStudente(Studente studente) {
        if (numeroStudenti < studenti.length) {
            studenti[numeroStudenti] = studente;
            numeroStudenti++;
            System.out.println("Studente aggiunto al registro");
        } else {
            System.out.println("Registro pieno, impossibile aggiungere altri studenti");
        }
    }

    
    public void stampaStudenti() {
        System.out.println("=== REGISTRO STUDENTI ===");
        if (numeroStudenti == 0) {
            System.out.println("Il registro è vuoto");
        } else {
            for (int i = 0; i < numeroStudenti; i++) {
                System.out.println((i + 1) + ". " + studenti[i].getinfo());
            }
        }
    }
}