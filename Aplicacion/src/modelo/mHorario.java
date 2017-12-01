package modelo;
import java.util.Date;
public class mHorario {
    private String dia;
    private String horaInicio;
    private String horaFin;

    public mHorario(String dia, String horaInicio, String horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
    @Override
    public String toString() {
        return "Horario{" + "dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }
}
