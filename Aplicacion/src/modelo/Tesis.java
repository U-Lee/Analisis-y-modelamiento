package modelo;
public class Tesis {
    private String Tema;
    private String director;

    public Tesis() {
        this.Tema = null;
        this.director = null;
    }
    
    public String getTema() {
        return Tema;
    }
    public void setTema(String Tema) {
        this.Tema = Tema;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public String toString() {
        return "Carrera{"+"tema="+Tema+ "director=" + director+'}';
    }
}
