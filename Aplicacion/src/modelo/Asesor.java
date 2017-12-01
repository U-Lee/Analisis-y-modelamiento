package modelo;
public class Asesor extends Persona{
    
    private String cubiculo;
    private Horario horarioAsesorias;

    public Asesor() {
        super();
        this.cubiculo = null;
        this.horarioAsesorias = null;
    }
    
    public Horario getHorarioAsesorias() {
        return horarioAsesorias;
    }
    public void    setHorarioAsesorias(Horario horarioAsesorias) {
        this.horarioAsesorias = horarioAsesorias;
    }
    public String  getCubiculo() {
        return cubiculo;
    }
    public void    setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
    }
}
