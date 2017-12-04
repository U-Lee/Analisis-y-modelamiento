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
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
            candidato.setTelefono(jPanelCreateCandidato.jtxtTelefono.getText());
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
            try{
                candidato.setFoto(extractBytes(jPanelCreateCandidato.fichero));
            }catch (IOException ex) {
                Logger.getLogger(ControladorGuardaCandidato.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            /*En este bloque capturo los archivos pero no los guardo en la base de datos por que son archivos de texto y no de imagen 
            try{
                candidato.setCartaCompromiso(extractBytes(jPanelCreateCandidato.ficheroCartaCompromiso));
            }catch (IOException ex) {
                Logger.getLogger(ControladorGuardaCandidato.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                candidato.setCartaExp(extractBytes(jPanelCreateCandidato.ficheroCartaExposicion));
            }catch (IOException ex) {
                Logger.getLogger(ControladorGuardaCandidato.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            
            
            
            
            /*captura de horarios y subir carreras desde postgresql*/
            
            /*agregamos a la base de datos*/
            adminBD.insertarCandidato(candidato);
            //adminBD.insertarCartasCandidato(candidato);/*Aun no implementado para archivos de texto*/
       
    }
        /*bloque para convertir imagen a bytea*/
    public byte[] extractBytes (File imgPath) throws IOException {
    // open image
        BufferedImage bufferedImage = ImageIO.read(imgPath);

    // get DataBufferBytes from Raster
        WritableRaster raster = bufferedImage .getRaster();
        DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();

        return ( data.getData() );
    }
    
    
}
