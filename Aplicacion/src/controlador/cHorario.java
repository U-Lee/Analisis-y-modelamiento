
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.mHorario;
import vista.vHorario;

public class cHorario implements  ActionListener{
    private mHorario model;
    private vHorario view;

    ArrayList<mHorario> lista = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    public cHorario(mHorario model, vHorario view) {
        this.model = model;
        this.view = view;
        this.view.btnAgregar.addActionListener(this);
    }
    
    
    public void iniciar(){
        view.setTitle("Horario");
        view.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            mHorario horario = new mHorario(
                    String.valueOf(view.cbDia.getSelectedItem()),
                    String.valueOf(view.cbHraInicio.getSelectedItem()), 
                    String.valueOf(view.cbHraFin.getSelectedItem()));
            lista.add(horario);
            construyeHorario();
        } catch (Exception e) {
        }
    }
    public void construyeHorario(){
        String matriz[][] = new String[lista.size()][3];
        
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = lista.get(i).getDia();
            matriz[i][1] = lista.get(i).getHoraInicio();
            matriz[i][2] = lista.get(i).getHoraFin();
        }
        view.tablaHorario.setModel(new javax.swing.table.DefaultTableModel(matriz,
                new String[] {"Dia","Hora inicio","Hora fin"}));
    }
    
}
