/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prycalculadorac;

/**
 *
 * @author USUARIO
 */
public class WinConjuntos extends javax.swing.JFrame {

    /**
     * Creates new form WinConjuntos
     */
    public WinConjuntos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnDatosA = new javax.swing.JButton();
        TxtPantallaB = new javax.swing.JTextField();
        TxtPantallaA = new javax.swing.JTextField();
        BtnDatos2 = new javax.swing.JButton();
        BtnDatos = new javax.swing.JButton();
        BtnDatosB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnUnion = new javax.swing.JButton();
        BtnInterseccion = new javax.swing.JButton();
        BtnDifS = new javax.swing.JButton();
        BtnDif = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxtPantallaRes = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));

        jLabel1.setText("Conjunto A");

        jLabel2.setText("Conjunto B");

        BtnDatosA.setText("N.-Datos A");

        TxtPantallaB.setBackground(new java.awt.Color(102, 255, 102));
        TxtPantallaB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPantallaB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtPantallaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPantallaBActionPerformed(evt);
            }
        });

        TxtPantallaA.setBackground(new java.awt.Color(153, 255, 153));
        TxtPantallaA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPantallaA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtPantallaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPantallaAActionPerformed(evt);
            }
        });

        BtnDatos2.setText("Datos:");

        BtnDatos.setText("Datos:");

        BtnDatosB.setText("N.-Datos B");

        jLabel3.setText("OPERACIONES");

        BtnUnion.setText("Union");

        BtnInterseccion.setText("Interseccion");

        BtnDifS.setText("Dif.Simetrica");

        BtnDif.setText("Diferencia");

        jLabel4.setText("RESULTADO");

        TxtPantallaRes.setBackground(new java.awt.Color(255, 153, 153));
        TxtPantallaRes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPantallaRes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BtnLimpiar.setBackground(new java.awt.Color(255, 255, 0));
        BtnLimpiar.setText("LIMPIAR");

        BtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        BtnSalir.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtPantallaB, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPantallaA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnDatosA)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnDatos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnDatosB)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnDatos2))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnLimpiar)
                            .addGap(26, 26, 26)
                            .addComponent(BtnSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnDifS)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnUnion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnInterseccion, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(BtnDif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(131, 131, 131)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(TxtPantallaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnDatosA)
                        .addComponent(BtnDatos))
                    .addComponent(TxtPantallaA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPantallaB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDatosB)
                    .addComponent(BtnDatos2))
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUnion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnInterseccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDif))
                    .addComponent(TxtPantallaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDifS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar)
                    .addComponent(BtnSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPantallaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPantallaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPantallaAActionPerformed

    private void TxtPantallaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPantallaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPantallaBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinConjuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDatos;
    private javax.swing.JButton BtnDatos2;
    private javax.swing.JButton BtnDatosA;
    private javax.swing.JButton BtnDatosB;
    private javax.swing.JButton BtnDif;
    private javax.swing.JButton BtnDifS;
    private javax.swing.JButton BtnInterseccion;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnUnion;
    private javax.swing.JTextField TxtPantallaA;
    private javax.swing.JTextField TxtPantallaB;
    private javax.swing.JTextField TxtPantallaRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
