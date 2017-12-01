package modelo;
import java.util.Date;
public class Horario {
    private String dia;
    private Date horaInicio;
    private Date horaFin;
    public String getDia() {
        return dia;
    }
    public Date getHoraInicio() {
        return horaInicio;
    }
    public Date getHoraFin() {
        return horaFin;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    @Override
    public String toString() {
        return "Horario{" + "dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }
}
