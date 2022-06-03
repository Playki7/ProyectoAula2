
package modelo;


public class Sospechoso {
    
    private String Nombre;
    private String Apellido;
    private String Alias;
    private String NoIdentificacion;
    private int Edad;
    private String Direcion;
    private String Fisico;

    public Sospechoso(String Nombre, String Apellido, String Alias, String NoIdentificacion, int Edad, String Direcion, String Fisico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Alias = Alias;
        this.NoIdentificacion = NoIdentificacion;
        this.Edad = Edad;
        this.Direcion = Direcion;
        this.Fisico = Fisico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getNoIdentificacion() {
        return NoIdentificacion;
    }

    public void setNoIdentificacion(String NoIdentificacion) {
        this.NoIdentificacion = NoIdentificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDirecion() {
        return Direcion;
    }

    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public String getFisico() {
        return Fisico;
    }

    public void setFisico(String Fisico) {
        this.Fisico = Fisico;
    }
    
    public String tieneAlias(){
        return
    }
    public String recidenciaActual(){
        return
    }
    public String casosImplicado(){
        return
    }
    
}
