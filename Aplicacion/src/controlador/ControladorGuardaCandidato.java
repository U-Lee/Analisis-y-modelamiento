/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.AdminBD;
import modelo.Candidato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Carrera;
import modelo.Grupo;
import modelo.Tesis;
import modelo.Trabajo;
import vista.JPanelCreateCandidato;

/**
 *
 * @author Jhon Nash
 */
public class ControladorGuardaCandidato implements ActionListener{
    private Grupo grupo;
    private Candidato candidato;
    private Tesis tesis;
    private Carrera carrera;
    private Trabajo trabajo;
    private AdminBD adminBD;
    private JPanelCreateCandidato jPanelCreateCandidato;

    public ControladorGuardaCandidato(JPanelCreateCandidato jPanelCreateCandidato) {
        candidato = new Candidato();
        tesis = new Tesis();
        adminBD = new AdminBD();
        
        
        this.jPanelCreateCandidato = jPanelCreateCandidato;
        jPanelCreateCandidato.jbttnGuardar.addActionListener(this); 
    }
    
    
    public void actionPerformed(ActionEvent e){
        String matriculaEst;
        
        candidato.setNombre(jPanelCreateCandidato.jtxtNombre.getText());
        candidato.setApellidoPaterno(jPanelCreateCandidato.jtxtApellidoPaterno.getText());
        candidato.setApellidoMaterno(jPanelCreateCandidato.jtxtApellidoMaterno.getText());
        candidato.setCorreoElectronico(jPanelCreateCandidato.jtxtCorrElectronico.getText());
        candidato.setTelefono(Integer.parseInt(jPanelCreateCandidato.jtxtTelefono.getText()));
        /*la captura de matricula se hace por partes*/
        matriculaEst = jPanelCreateCandidato.jtxtAnioMatricula.getText() +
                "-"+jPanelCreateCandidato.jtxtPlantelMatricula.getText()+
                "-"+jPanelCreateCandidato.jtxtMatricula.getText();
        
        candidato.setMatricula(matriculaEst);
        candidato.setGeneracion(jPanelCreateCandidato.jtxtGeneracion.getText());
        candidato.setCreditos(jPanelCreateCandidato.jSpinnerCreditos.getToolTipText());/*anexado spinner credtidos 30/11/17*/
        /*acciones para carrera*/
        //carrera.setNombre(jPanelCreateCandidato.jComBoxCarrera.toString());/*aqui se carga la tabla carreras*/
        candidato.setCarrera(carrera);
        /*acciones para tesis*/
        tesis.setTema(jPanelCreateCandidato.jtxtNomTesis.getText());
        tesis.setDirector(jPanelCreateCandidato.jtxtDircTesis.getText());
        candidato.setTesis(tesis);
        /*acciones para trabajo*/
        //trabajo.setNombreEntidad(jPanelCreateCandidato.jtxtEntidad.getText());
        candidato.setTrabajo(trabajo);
        /*falta incorporar obtencion de carta compromiso
        *obtencion de carta de exposicion de motivos
        *obtencion de foto del candidato, tambien subir foto
        *captura de horarios y subir carreras desde postgresql*/
        
        /*agregamos a la base de datos*/
        //grupo.setCandidato(candidato);
        adminBD.insertarCandidato(this.candidato);
    }
    
}
