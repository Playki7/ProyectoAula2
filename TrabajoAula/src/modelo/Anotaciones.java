
package modelo;


public class Anotaciones {
    private String Observacion;
    private int Fecha;

    public Anotaciones(String Observacion, int Fecha) {
        this.Observacion = Observacion;
        this.Fecha = Fecha;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
