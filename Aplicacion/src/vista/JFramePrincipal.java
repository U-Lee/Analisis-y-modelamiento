package vista;

import java.awt.BorderLayout;
public class JFramePrincipal extends javax.swing.JFrame {

    JPanelCreateCandidato pc;
    JPanelCreateAsesor pa;
    JPanelFuncionAdministrador pf;
    JPanelLoginCandidato jpc;

    public JFramePrincipal() {
        initComponents();
        pc = new JPanelCreateCandidato();
        pa = new JPanelCreateAsesor();
        pf = new JPanelFuncionAdministrador();
        jpc = new JPanelLoginCandidato();
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
        jPanelForm = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUsuarios.setBackground(new java.awt.Color(64, 141, 42));
        jPanelUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));

        jbttnAcademico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/academico1.png"))); // NOI18N
        jbttnAcademico.setBorder(null);
        jbttnAcademico.setBorderPainted(false);
        jbttnAcademico.setContentAreaFilled(false);
        jbttnAcademico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbttnAcademico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/academico2.png"))); // NOI18N
        jbttnAcademico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Administrador3.png"))); // NOI18N
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
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jPanelAyuda.setBackground(new java.awt.Color(172, 24, 24));
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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oswaldo UACM\\Downloads\\Captura.PNG")); // NOI18N

        javax.swing.GroupLayout jPanelAyudaLayout = new javax.swing.GroupLayout(jPanelAyuda);
        jPanelAyuda.setLayout(jPanelAyudaLayout);
        jPanelAyudaLayout.setHorizontalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbttnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAyudaLayout.setVerticalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAyudaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelAyudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbttnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelForm.setPreferredSize(new java.awt.Dimension(430, 580));

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 185, Short.MAX_VALUE))
            .addComponent(jPanelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)))
        );

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
        pf.setVisible(true);
        pf.setSize(381, 413);
        jPanelForm.removeAll();
        jPanelForm.add(pf, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();

    }//GEN-LAST:event_jbttnAdministradorActionPerformed

    private void jbttnAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnAcademicoActionPerformed
        pa.setVisible(true);
        pa.setSize(400, 438);
        jPanelForm.removeAll();
        jPanelForm.add(pa, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();
    }//GEN-LAST:event_jbttnAcademicoActionPerformed

    private void jbttnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnAyudaActionPerformed
        JPanelMostrarListaAsesores jpMostrar;
        jpMostrar = new JPanelMostrarListaAsesores();
        jpMostrar.desplegarCatalogo();
        jpMostrar.setVisible(true);
        jpMostrar.setSize(400, 438);
        jPanelForm.removeAll();
        jPanelForm.add(jpMostrar, BorderLayout.CENTER);
        jPanelForm.revalidate();
        jPanelForm.repaint();
    }//GEN-LAST:event_jbttnAyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelAyuda;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JButton jbttnAcademico;
    private javax.swing.JButton jbttnAdministrador;
    private javax.swing.JButton jbttnAyuda;
    private javax.swing.JButton jbttnEstudiante;
    // End of variables declaration//GEN-END:variables
}
