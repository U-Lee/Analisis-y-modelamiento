/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.AdminBD;
import modelo.Asesor;
import modelo.Horario;
import vista.JPanelCreateAsesor;

/**
 *
 * @author Jhon Nash
 */
public class ControladorGuardaAsesor implements ActionListener{
    private Asesor asesor;
    private Horario horario;
    private AdminBD adminBD;
    private JPanelCreateAsesor jPanelCreateAsesor;

    public ControladorGuardaAsesor(JPanelCreateAsesor jPanelCreateAsesor) {
        horario = new Horario();
        adminBD = new AdminBD();
        asesor = new Asesor();
        
        this.jPanelCreateAsesor = jPanelCreateAsesor;
        jPanelCreateAsesor.jbttnGuardar.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        asesor.setNombre(jPanelCreateAsesor.jtxtNombreAsesor.getText());
        asesor.setApellidoPaterno(jPanelCreateAsesor.jtxtApellidoPaterno.getText());
        asesor.setApellidoMaterno(jPanelCreateAsesor.jtxtApellidoMaterno.getText());
        asesor.setCorreoElectronico(jPanelCreateAsesor.jtxtCorrEleAsesor.getText());
        asesor.setTelefono(jPanelCreateAsesor.jtxtTelefono.getText());
        asesor.setCubiculo(jPanelCreateAsesor.jtxtCubiculo.getText());
        /*guardamos en la bd17*/
        adminBD.insertarAsesor(asesor);       
    }
  
}
