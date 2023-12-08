public class Universita {
    private Docente[] docenti;

    public Universita(Docente[] docenti) {
        this.docenti = docenti;
    }

    public Docente[] getDocenti() {
        return docenti;
    }

    public void setDocenti(Docente[] docenti) {
        this.docenti = docenti;
    }

    public void etaMinima(){
        Docente min = docenti[0];
        for (Docente docente : docenti) {
            if (docente.getEta() < min.getEta()) {
                min = docente;
            }
        }
        System.out.println("età minima = " + min.getEta() + " | Docente : " + min.getNome() + " " + min.getCognome());
    }
}
