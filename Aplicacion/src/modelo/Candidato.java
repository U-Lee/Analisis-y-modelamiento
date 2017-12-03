package modelo;
public class Candidato extends Persona{
    private byte[]     foto;
    private String  matricula;
    private String generacion;
    private Carrera carrera;
    private String  creditos;
    private Tesis   tesis;
    private Trabajo trabajo;
    private boolean cartaCompromiso;
    private boolean cartaExp;
    private String  nombreEntidad;

    public Candidato(){
        super();
        this.matricula = null;
        this.generacion = null;
        this.carrera = null;
        this.creditos = null;
        this.tesis = null;
        this.cartaCompromiso = false;
        this.cartaExp = false;
        this.nombreEntidad = null;  
        this.trabajo= null;
        this.foto = null;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public boolean isCartaCompromiso() {
        return cartaCompromiso;
    }
    public void    setCartaCompromiso(boolean cartaCompromiso) {
        this.cartaCompromiso = cartaCompromiso;
    }
    public void    setCartaExp(boolean cartaExp) {
        this.cartaExp = cartaExp;
    }
    public boolean isCartaExp() {
        return cartaExp;
    }
   
    public void    setGeneracion(String generacion) {
        this.generacion = generacion;
    }
    public void    setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public void    setCreditos(String creditos) {
        this.creditos = creditos;
    }
    public void    setTesis(Tesis tesis) {
        this.tesis = tesis;
    }
    public String  getMatricula() {
        return matricula;
    }
    
    public String  getGeneracion() {
        return generacion;
    }
    public Carrera getCarrera() {
        return carrera;
    }
    public String  getCreditos() {
        return creditos;
    }
    public Tesis   getTesis() {
        return tesis;
    }
    public void    setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }
    public String  getNombreEntidad() {
        return nombreEntidad;
    }
      public Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
}