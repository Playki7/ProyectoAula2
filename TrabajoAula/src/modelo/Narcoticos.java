
package modelo;


public class Narcoticos extends Casos{
    
    
    private String Federal;
    private String Local;
    private String Estatal;

    public Narcoticos(String Federal, String Local, String Estatal, String TipoCaso, String DetectiveCapacitado, String SospechosoCaso) {
        super(TipoCaso, DetectiveCapacitado, SospechosoCaso);
        this.Federal = Federal;
        this.Local = Local;
        this.Estatal = Estatal;
    }

    public String getFederal() {
        return Federal;
    }

    public void setFederal(String Federal) {
        this.Federal = Federal;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getEstatal() {
        return Estatal;
    }

    public void setEstatal(String Estatal) {
        this.Estatal = Estatal;
    }
    
    public String GuardarRegistro(){
        return 
    }
    
}
