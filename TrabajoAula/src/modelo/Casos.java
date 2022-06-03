
package modelo;


public class Casos {
    
    private String TipoCaso;

    public Casos(String TipoCaso, String DetectiveCapacitado, String SospechosoCaso) {
        this.TipoCaso = TipoCaso;
        this.DetectiveCapacitado = DetectiveCapacitado;
        this.SospechosoCaso = SospechosoCaso;
    }
    private String DetectiveCapacitado;
    private String SospechosoCaso;

    public String getTipoCaso() {
        return TipoCaso;
    }

    public void setTipoCaso(String TipoCaso) {
        this.TipoCaso = TipoCaso;
    }

    public String getDetectiveCapacitado() {
        return DetectiveCapacitado;
    }

    public void setDetectiveCapacitado(String DetectiveCapacitado) {
        this.DetectiveCapacitado = DetectiveCapacitado;
    }

    public String getSospechosoCaso() {
        return SospechosoCaso;
    }

    public void setSospechosoCaso(String SospechosoCaso) {
        this.SospechosoCaso = SospechosoCaso;
    }
    

    
        
    
}
