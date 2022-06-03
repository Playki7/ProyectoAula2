
package modelo;


public class Cibercrimen extends Casos {
    
    private int CrimenAsocidas;

    public Cibercrimen(int CrimenAsocidas, String TipoCaso, String DetectiveCapacitado, String SospechosoCaso) {
        super(TipoCaso, DetectiveCapacitado, SospechosoCaso);
        this.CrimenAsocidas = CrimenAsocidas;
    }



    public int getCrimenAsocidas() {
        return CrimenAsocidas;
    }

    public void setCrimenAsocidas(int CrimenAsocidas) {
        this.CrimenAsocidas = CrimenAsocidas;
    }
    
    public String RodoIdentidad(){
        return 
    }
    
    public String RoboInformacion(){
        return 
    }
    
    public String FraudeInternet(){
        return 
    }
}
