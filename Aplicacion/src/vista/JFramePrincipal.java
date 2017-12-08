package vista;

import controlador.ControladorLogin;
import java.awt.BorderLayout;

public class JFramePrincipal extends javax.swing.JFrame {

    JPanelCreateCandidato pc;
    JPanelCreateAsesor pa;
    JPanelFuncionAdministrador pf;
    ControladorLogin cl;
    Ayuda ayuda;
    Directorio directorio;

    public JFramePrincipal() {
        initComponents();
        pc = new JPanelCreateCandidato();
        pa = new JPanelCreateAsesor();
        pf = new JPanelFuncionAdministrador();
        cl = new ControladorLogin();
        ayuda = new Ayuda();
        directorio = new Directorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuarios = new javax.swing.JPanel();
        jbttnAcademico = new javax.swing.JButton();
        jbttnEstudiante = new javax.swing.JButton();
        jbttnAdministrador = new javax.swing.JButton();
        jPanelAyuda = new javax.swing.JPanel();
        jbttnAyuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelForm = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUsuarios.setBackground(new java.awt.Color(51, 102, 0));
        jPanelUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));

        jbttnAcademico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/academico1.png"))); // NOI18N
        jbttnAcademico.setBorder(null);
        jbttnAcademico.setBorderPainted(false);
        jbttnAcademico.setContentAreaFilled(false);
        jbttnAcademico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnAcademico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/academico2.png"))); // NOI18N
        jbttnAcademico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/academico3.png"))); // NOI18N
        jbttnAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnAcademicoActionPerformed(evt);
            }
        });

        jbttnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/estudiante1.png"))); // NOI18N
        jbttnEstudiante.setBorder(null);
        jbttnEstudiante.setBorderPainted(false);
        jbttnEstudiante.setContentAreaFilled(false);
        jbttnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnEstudiante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/estudiante2.png"))); // NOI18N
        jbttnEstudiante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/estudiante3.png"))); // NOI18N
        jbttnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnEstudianteActionPerformed(evt);
            }
        });

        jbttnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Administrador1.png"))); // NOI18N
        jbttnAdministrador.setBorder(null);
        jbttnAdministrador.setBorderPainted(false);
        jbttnAdministrador.setContentAreaFilled(false);
        jbttnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnAdministrador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Administrador2.png"))); // NOI18N
        jbttnAdministrador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Administrador3.png"))); // NOI18N
        jbttnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbttnAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbttnEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbttnAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbttnAcademico)
                .addGap(46, 46, 46)
                .addComponent(jbttnEstudiante)
                .addGap(40, 40, 40)
                .addComponent(jbttnAdministrador)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jPanelAyuda.setBackground(new java.awt.Color(51, 102, 0));
        jPanelAyuda.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema de Apoyo a la Titilacion"));

        jbttnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/AYUDA1.png"))); // NOI18N
        jbttnAyuda.setBorder(null);
        jbttnAyuda.setBorderPainted(false);
        jbttnAyuda.setContentAreaFilled(false);
        jbttnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnAyuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/AYUDA2.png"))); // NOI18N
        jbttnAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/AYUDA3.png"))); // NOI18N
        jbttnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnAyudaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/uacmlogo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de Apoyo a la Titulación");

        jButton1.setText("Directorio Asesores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAyudaLayout = new javax.swing.GroupLayout(jPanelAyuda);
        jPanelAyuda.setLayout(jPanelAyudaLayout);
        jPanelAyudaLayout.setHorizontalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAyudaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbttnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        jPanelAyudaLayout.setVerticalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelAyudaLayout.createSequentialGroup()
                .addGroup(jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAyudaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jbttnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelForm.setPreferredSize(new java.awt.Dimension(430, 580));

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
            .addComponent(jPanelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)))
        );

        jPanelAyuda.getAccessibleContext().setAccessibleName("Sistema de Apoyo a la Titulación");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbttnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnEstudianteActionPerformed
        pc.setVisible(true);
        pc.setSize(426, 578);
        jPanelForm.removeAll();
        jPanelForm.add(pc, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();

    }//GEN-LAST:event_jbttnEstudianteActionPerformed

    private void jbttnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnAdministradorActionPerformed
        cl.pedirLoginAdmin();
        pf.setVisible(true);
        pf.setSize(381, 413);
        jPanelForm.removeAll();
        jPanelForm.add(pf, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();

    }//GEN-LAST:event_jbttnAdministradorActionPerformed

    private void jbttnAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnAcademicoActionPerformed
        pa.setVisible(true);
        pa.setSize(400, 480);
        jPanelForm.removeAll();
        jPanelForm.add(pa, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();
    }//GEN-LAST:event_jbttnAcademicoActionPerformed

    private void jbttnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnAyudaActionPerformed
        ayuda.setVisible(true);
        ayuda.setSize(400, 480);
        jPanelForm.removeAll();
        jPanelForm.add(ayuda, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();
    }//GEN-LAST:event_jbttnAyudaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        directorio.desplegarCatalogo();
        directorio.setVisible(true);
        directorio.setSize(500, 280);
        jPanelForm.removeAll();
        jPanelForm.add(directorio, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelAyuda;
    public static javax.swing.JPanel jPanelForm;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JButton jbttnAcademico;
    private javax.swing.JButton jbttnAdministrador;
    private javax.swing.JButton jbttnAyuda;
    private javax.swing.JButton jbttnEstudiante;
    // End of variables declaration//GEN-END:variables
}
