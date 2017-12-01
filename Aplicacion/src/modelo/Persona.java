package modelo;
public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correoElectronico;
    private int telefono;
    public Persona() {
        this.nombre = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.correoElectronico = null;
        this.telefono = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public int getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return "Personsa{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + '}';
    } 
}
