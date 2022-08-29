package projetointegradoreleicao2022;
public class Candidato {
    //Atributos
    private String Candidato,Partido;
    private boolean FichaLimpa;
    //Construtores
    public Candidato(String Candidato, String Partido, boolean FichaLimpa) {
        this.Candidato = Candidato;
        this.Partido = Partido;
        this.FichaLimpa = true;
    }
    
    //SETs e GETs

    public String getCandidato() {
        return Candidato;
    }

    public void setCandidato(String Candidato) {
        this.Candidato = Candidato;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }

    public boolean getFichaLimpa() {
        return FichaLimpa;
    }

    public void setFichaLimpa(boolean FichaLimpa) {
        this.FichaLimpa = FichaLimpa;
    }
    
    
    
}
