/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author U-Lee
 */
public class EliminarAsesor {

    private String controladorBD;
    private String host;
    private String puerto;
    private String baseDatos;
    private String url;
    private String usuario;
    private String contraseña;
    DefaultTableModel modelo = new DefaultTableModel();

    public void eliminaRegistroBD(int asesorSeleccionado, String fila) {
        controladorBD = "org.postgresql.Driver";
        host = "127.0.0.1";
        puerto = "5432";
        baseDatos = "bd17";/*nombre de la base de datos */

        url = "jdbc:postgresql://" + host + ":" + puerto + "/" + baseDatos;
        usuario = "postgres";
        contraseña = "p057gr35";

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
}
