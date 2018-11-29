
package pryfraccionu;

public class WinFraccionU extends javax.swing.JFrame {

    /**
     * Creates new form WinFraccionU
     */
    public WinFraccionU() {
        initComponents();
    }
    int n,d;
    ClsFraccionU p,q;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnNumerador = new javax.swing.JButton();
        BtnDenominador = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtPantalla.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        TxtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPantallaActionPerformed(evt);
            }
        });

        BtnNumerador.setText("Numerador");
        BtnNumerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumeradorActionPerformed(evt);
            }
        });

        BtnDenominador.setText("Denominador");
        BtnDenominador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenominadorActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNumerador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDenominador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNumerador)
                    .addComponent(BtnDenominador)
                    .addComponent(BtnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void TxtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPantallaActionPerformed

    private void BtnNumeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNumeradorActionPerformed
       n=Integer.parseInt(TxtPantalla.getText());
       TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnNumeradorActionPerformed

    private void BtnDenominadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenominadorActionPerformed
       d=Integer.parseInt(TxtPantalla.getText());
       p=new ClsFraccionU (n,d);
       TxtPantalla.setText(p.toString());
       TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnDenominadorActionPerformed

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
            java.util.logging.Logger.getLogger(WinFraccionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinFraccionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinFraccionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinFraccionU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinFraccionU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDenominador;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnNumerador;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
