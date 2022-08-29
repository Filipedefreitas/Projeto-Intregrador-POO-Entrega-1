package projetointegradoreleicao2022;

import java.time.LocalDate;

public class Pesquisa {
    private String Instituto,Local,Tipo,Formato;
    private LocalDate Data;
    private float Media_idade;

    public Pesquisa(String instituto, String local, String tipo, String formato, localDate Data, float media_idade) {
        this.Instituto = instituto;
        this.Local = local;
        this.Tipo = tipo;
        this.Formato = formato;
        this.Data = data;
        this.Media_idade = media_idade;
    }

    public String getInstituto() {
        return Instituto;
    }

    public void setInstituto(String Instituto) {
        this.Instituto = Instituto;
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
