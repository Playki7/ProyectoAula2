
package modelo;


public class Dirreccion {
    
    private int NoVivienda;
    private String Localidad;
    private String Ciudad;
    private String Departamento;
    private String Pais;

    public Dirreccion(int NoVivienda, String Localidad, String Ciudad, String Departamento, String Pais) {
        this.NoVivienda = NoVivienda;
        this.Localidad = Localidad;
        this.Ciudad = Ciudad;
        this.Departamento = Departamento;
        this.Pais = Pais;
    }

    public int getNoVivienda() {
        return NoVivienda;
    }

    public void setNoVivienda(int NoVivienda) {
        this.NoVivienda = NoVivienda;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
    
}
