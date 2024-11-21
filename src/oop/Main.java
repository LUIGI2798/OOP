package oop;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new Dipendente("001", 1500.0, Dipendente.PRODUZIONE);
        dipendenti[1] = new Dipendente("002", 1800.0, Dipendente.AMMINISTRAZIONE);
        dipendenti[2] = new Dipendente("003", 2000.0, Dipendente.VENDITE);

        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola() + ", Stipendio: " + d.getStipendio() + ", Dipartimento: " + d.getDipartimento());
 }
}
}

