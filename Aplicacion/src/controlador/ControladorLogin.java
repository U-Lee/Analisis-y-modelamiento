package controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author U-Lee
 */
public class ControladorLogin {

    public String pedirLoginAdmin() {
        String login;
        int clave, p;
        clave = 123;
        do {
            login = JOptionPane.showInputDialog(null,
                    "Escribe el login de Administrador:",
                    "Administrador",
                    JOptionPane.QUESTION_MESSAGE
            );
            p = Integer.parseInt(login);
            if (p != clave) {
                JOptionPane.showMessageDialog(null,
                        "Login incorrecto",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            if (p == 2) {
                System.exit(0);
            }
        } while (p != clave);
        return login;
    }
}
