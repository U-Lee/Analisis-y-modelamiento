/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jhon Nash
 */
public class Trabajo {
    private String nombreEntidad;
    private Horario horario;

    public Trabajo() {
        nombreEntidad= null;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }
    
     public void    setHorario(Horario horario) {
        this.horario = horario;
    }
    public Horario getHorario() {
        return horario;
    }
}
