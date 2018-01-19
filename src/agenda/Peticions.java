package agenda;

public class Peticions {
    private String nomReuni;
    private String sala;
    private String dataInici;
    private String dataFinal;
    private String dia;
    private String hora;

    public Peticions(String nomReuni, String sala, String dataInici, String dataFinal, String dia, String hora) {
        this.nomReuni = nomReuni;
        this.sala = sala;
        this.dataInici = dataInici;
        this.dataFinal = dataFinal;
        this.dia = dia;
        this.hora = hora;
    }

    public String getNomReuni() {
        return nomReuni;
    }

    public void setNomReuni(String nomReuni) {
        this.nomReuni = nomReuni;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDataInici() {
        return dataInici;
    }

    public void setDataInici(String dataInici) {
        this.dataInici = dataInici;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    

    
}
