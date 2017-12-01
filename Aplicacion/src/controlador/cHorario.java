
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    public void actionPerformed(ActionEvent ae){
        if(view.tablaHorario.getRowCount() < 5){
            try {
            mHorario horario = new mHorario(
                    verificaDia(),
                    String.valueOf(view.cbHraInicio.getSelectedItem()), 
                    String.valueOf(view.cbHraFin.getSelectedItem()));
            lista.add(horario);
            construyeHorario();
            } catch (Exception e){
            }   
        }
        else{
            view.btnAgregar.setEnabled(false);
        }
    }
    public void construyeHorario(){
        String matriz[][] = new String[lista.size()][3];
        
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = lista.get(i).getDia();
            matriz[i][1] = lista.get(i).getHoraInicio();
            matriz[i][2] = lista.get(i).getHoraFin();
        }
        view.tablaHorario.setModel(new javax.swing.table.DefaultTableModel
        (matriz,new String[] {"Dia","Hora inicio","Hora fin"}));
    }
    private String verificaDia(){
        String dia = String.valueOf(view.cbDia.getSelectedItem());
        int i = 0;
        boolean bandera = true;
        
        for(i = 0; i< view.tablaHorario.getRowCount(); i++){
            if(dia.equals(view.tablaHorario.getValueAt(i, 0).toString())){
                bandera = false;
            }       
        }
        
        System.out.println(dia);
        if(bandera){return dia;}
        
        String[] diasSemana={"Lunes","Martes","Miercoles","Jueves","Viernes" };
        JFrame frame = new JFrame("Input Dialog Example 3");
        String diaJO = (String) JOptionPane.showInputDialog(frame, 
        "Elige otro día: ",
        "Días de la semana",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        diasSemana, 
        diasSemana[0]);
        if(diaJO == dia || diaJO == null){return verificaDia();}
        return diaJO;
    }
    
}
