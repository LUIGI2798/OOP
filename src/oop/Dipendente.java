package oop;

public class Dipendente {


    public class Dipendente {
        private String matricola;
        private double stipendio;
        private String dipartimento;

        public static final String PRODUZIONE = "PRODUZIONE";
        public static final String AMMINISTRAZIONE = "AMMINISTRAZIONE";
        public static final String VENDITE = "VENDITE";

        public Dipendente(String matricola, double stipendio, String dipartimento) {
            this.matricola = matricola;
            this.stipendio = stipendio;
            setDipartimento(dipartimento);
        }

        public String getMatricola() {
            return matricola;
        }

        public double getStipendio() {
            return stipendio;
        }

        public String getDipartimento() {
            return dipartimento;
        }

        public void setDipartimento(String dipartimento) {
            if (dipartimento.equals(PRODUZIONE) || dipartimento.equals(AMMINISTRAZIONE) || dipartimento.equals(VENDITE)) {
                this.dipartimento = dipartimento;
            } else {
                throw new IllegalArgumentException("Dipartimento non valido");
 }
}
    }

}
