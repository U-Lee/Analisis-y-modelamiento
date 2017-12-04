package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.mHorario;
import vista.JFvHorario;
/**
    * Controlador que genera el horario de asesorias y horario de trbajo del
    * candidato
    * @author - Quality Developers and Software
    * @version - Segundo Sprint
    * @param - model atributo que recibe el modelo del horario
    * @param - view  atributo que recibe la vista del horario
    */

public class cHorario implements  ActionListener{
    private mHorario model;
    private JFvHorario view;

    ArrayList<mHorario> lista = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    public cHorario(mHorario model, JFvHorario view) {
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
                    verificaHora());
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
        JOptionPane.WARNING_MESSAGE, 
        null, 
        diasSemana, 
        diasSemana[0]);
        if(diaJO == dia || diaJO == null){return verificaDia();}
        return diaJO;
    }
    
    private String verificaHora(){
        String stringInicio = (String)view.cbHraInicio.getSelectedItem();
        String[] horaInicio = stringInicio.split(":");
        int intInicio = Integer.parseInt(horaInicio[0]);
        String stringFin = (String)view.cbHraFin.getSelectedItem();
        String[] horaFin = stringInicio.split(":");
        int intFin = Integer.parseInt(horaFin[0]);
        //Si esta bien la seleccion de hora final
        if(intInicio < intFin){return stringFin;}
        String[] horasDia={"07","08","09","10","11","12","13","14","15","16",
                            "17","18","19","20","21","22"};  
        JFrame frame = new JFrame("Input Dialog Example 3");
        String horaJO = (String) JOptionPane.showInputDialog(frame, 
            "Elige final diferente: ",
            "Horas del dia",
            JOptionPane.WARNING_MESSAGE, 
            null, 
            horasDia, 
            horasDia[0]);
        System.out.println(Integer.parseInt(horaJO));
        if(Integer.parseInt(horaJO) <= intInicio|| horaJO == null){
            return verificaHora();}
        return horaJO + ":00";
    }
}
