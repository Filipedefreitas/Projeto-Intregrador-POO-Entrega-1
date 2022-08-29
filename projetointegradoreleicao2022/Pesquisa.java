package projetointegradoreleicao2022;

import java.time.LocalDate;

public class Pesquisa {
    private String instituto,Local,Tipo,Formato;
    private LocalDate Data;
    private float Media_idade;

    public Pesquisa(String instituto, String Local, String Tipo, String Formato, LocalDate Data, float Media_idade) {
        this.instituto = instituto;
        this.Local = Local;
        this.Tipo = Tipo;
        this.Formato = Formato;
        this.Data = Data;
        this.Media_idade = Media_idade;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate Data) {
        this.Data = Data;
    }

    public float getMedia_idade() {
        return Media_idade;
    }

    public void setMedia_idade(float Media_idade) {
        this.Media_idade = Media_idade;
    }
    
    
    
    
}
