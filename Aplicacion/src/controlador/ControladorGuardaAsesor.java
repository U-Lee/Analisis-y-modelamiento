package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.AdminBD;
import modelo.Asesor;
import modelo.Horario;
import vista.JPanelCreateAsesor;
    /**
    * Controlador que guarda datos del acesor en la base de datos.
    * @author - Quality Developers and Software
    * @version - Segundo Sprint
    * @see - Controlador guarda la en la base datos
    * @param - Asesor variable de tipo asesor
    * @param - Horario varible de tipo Horario, definira el horario de asesorias
    * @param - AdminBD que almacenara en la base de datos
    *
    */
public class ControladorGuardaAsesor implements ActionListener {
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
    /*
    *Evento del boton para obtener datos de la vista
    */
    public void actionPerformed(ActionEvent e) {
        asesor.setNombre(jPanelCreateAsesor.jtxtNombreAsesor.getText());
        asesor.setApellidoPaterno(
                jPanelCreateAsesor.jtxtApellidoPaterno.getText());
        asesor.setApellidoMaterno(
                jPanelCreateAsesor.jtxtApellidoMaterno.getText());
        asesor.setCorreoElectronico(
                jPanelCreateAsesor.jtxtCorrEleAsesor.getText());
        asesor.setTelefono(
                jPanelCreateAsesor.jtxtTelefono.getText());
        asesor.setCubiculo(
                jPanelCreateAsesor.jtxtCubiculo.getText());
        /*guardamos en la bd17*/
        adminBD.insertarAsesor(asesor);
    }
}