
package modelo;


public class Homicidios extends Casos {
    
    private int segundoDetective;

    public Homicidios(int segundoDetective, String TipoCaso, String DetectiveCapacitado, String SospechosoCaso) {
        super(TipoCaso, DetectiveCapacitado, SospechosoCaso);
        this.segundoDetective = segundoDetective;
    }



    public int getSegundoDetective() {
        return segundoDetective;
    }

    public void setSegundoDetective(int segundoDetective) {
        this.segundoDetective = segundoDetective;
    }
    
    public String AnalisisdePruebas(){
        return 
    }
    
    public String Interrogatorios(){
        return 
    }
    
}
