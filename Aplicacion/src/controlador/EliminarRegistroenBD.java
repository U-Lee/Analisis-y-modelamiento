package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author U-Lee
 */
public class EliminarRegistroenBD {

    private String controladorBD;
    private String host;
    private String puerto;
    private String baseDatos;
    private String url;
    private String usuario;
    private String contraseña;
    DefaultTableModel modelo = new DefaultTableModel();

    public EliminarRegistroenBD() {
        controladorBD = "org.postgresql.Driver";
        host = "127.0.0.1";
        puerto = "5432";
        baseDatos = "bd17";/*nombre de la base de datos */

        url = "jdbc:postgresql://" + host + ":" + puerto + "/" + baseDatos;
        usuario = "postgres";
        contraseña = "p057gr35";
    }

    public void eliminaAsesor(int asesorSeleccionado, String fila) {
        try {
            //modelo.removeRow(asesorSeleccionado);
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(url, usuario, contraseña);
            java.sql.Statement st = conex.createStatement();
            String sql = "DELETE FROM asesores WHERE correo_electronico='" + fila + "'";
            ResultSet result = st.executeQuery(sql);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Selecciona un asesor de la lista", "Error", JOptionPane.WARNING_MESSAGE);   //Mensaje en caso que no se haya seleccionado alguna fila.
        }        // TODO a

    }

    public void eliminaCandidato(int asesorSeleccionado, String fila) {
        try {
            //modelo.removeRow(asesorSeleccionado);
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(url, usuario, contraseña);
            java.sql.Statement st = conex.createStatement();
            String sql = "DELETE FROM candidatos WHERE correo_electronico='" + fila + "'";
            ResultSet result = st.executeQuery(sql);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Selecciona un asesor de la lista", "Error", JOptionPane.WARNING_MESSAGE);   //Mensaje en caso que no se haya seleccionado alguna fila.
        }        // TODO a

    }
}   
