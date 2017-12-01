package modelo;
public class Carrera {
    private String nombre;
    private String colegio;
    public String getNombre() {
        return nombre;
    }
    public String getColegio() {
        return colegio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    @Override
    public String toString() {
        return "Carrera{"+"nombre="+nombre+"colegio="+colegio+'}';
    } 
}
