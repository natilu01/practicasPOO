
package WinVentana;

import conjuntos.ClsConjuntos;

public class WinVentana extends javax.swing.JFrame {

    public WinVentana() {
        initComponents();
    }
    int card;
    int ne, codigo ;
    ClsConjuntos a,b;
    String dato [];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPantalla = new javax.swing.JTextField();
        BtnCardinalidad = new javax.swing.JButton();
        BtnElemento = new javax.swing.JButton();
        BtnUnion = new javax.swing.JButton();
        BtnInterseccion = new javax.swing.JButton();
        BtnPrdCartesiano = new javax.swing.JButton();
        BtnDifSimetrica = new javax.swing.JButton();
        BtnDiferencia = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnCardinalidad.setText("Cardinalidad");
        BtnCardinalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCardinalidadActionPerformed(evt);
            }
        });

        BtnElemento.setText("Elemento [ i ]");
        BtnElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElementoActionPerformed(evt);
            }
        });

        BtnUnion.setText("UNION");
        BtnUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnionActionPerformed(evt);
            }
        });

        BtnInterseccion.setText("INTERSECCION");
        BtnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInterseccionActionPerformed(evt);
            }
        });

        BtnPrdCartesiano.setText("PRD.CARTESIANO");
        BtnPrdCartesiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrdCartesianoActionPerformed(evt);
            }
        });

        BtnDifSimetrica.setText("DIF.SIMETRICA");
        BtnDifSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDifSimetricaActionPerformed(evt);
            }
        });

        BtnDiferencia.setText("DIFERENCIA");
        BtnDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiferenciaActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnPrdCartesiano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnDiferencia)
                            .addComponent(BtnInterseccion)
                            .addComponent(BtnUnion)
                            .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(BtnCardinalidad))
                                    .addComponent(BtnDifSimetrica))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnIgual)
                                    .addComponent(BtnElemento))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCardinalidad)
                    .addComponent(BtnElemento))
                .addGap(18, 18, 18)
                .addComponent(BtnUnion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnInterseccion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnIgual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSalir)
                            .addComponent(BtnLimpiar))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnDiferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnDifSimetrica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnPrdCartesiano)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElementoActionPerformed
        dato[ne-1]=TxtPantalla.getText();
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        ne++;
        BtnElemento.setText("ELEMENTO ["+ne+"]");
        if(ne>=card){
            b= new  ClsConjuntos (card,dato);
            BtnElemento.setText("ELEMENTO [i]");
            BtnCardinalidad.setEnabled(true);
        }
    }//GEN-LAST:event_BtnElementoActionPerformed

    private void BtnCardinalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCardinalidadActionPerformed
        card=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);
        ne=1;
        b=new ClsConjuntos (card);
        BtnElemento.setText("ELEMENTO ["+(ne)+"]");
        BtnCardinalidad.setEnabled(false);
        dato=new String [card];
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnCardinalidadActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnionActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a=new ClsConjuntos (b);//clona el objeto todo lo q esta en b
        codigo=1;
    }//GEN-LAST:event_BtnUnionActionPerformed

    private void BtnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInterseccionActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a=new ClsConjuntos (b);//clona le objeto todo lo que esta en b
        codigo=2;
    }//GEN-LAST:event_BtnInterseccionActionPerformed

    private void BtnDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiferenciaActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a=new ClsConjuntos (b);
        codigo=3;
    }//GEN-LAST:event_BtnDiferenciaActionPerformed

    private void BtnDifSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDifSimetricaActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a=new ClsConjuntos (b);
        codigo=4;
    }//GEN-LAST:event_BtnDifSimetricaActionPerformed

    private void BtnPrdCartesianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrdCartesianoActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        a=new ClsConjuntos (b);
        codigo=5;
    }//GEN-LAST:event_BtnPrdCartesianoActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        switch(codigo){
            case 1:
                b=new ClsConjuntos (a.union(b));
                break;
            case 2:
                b=new ClsConjuntos (a.interseccion(b));
                break;
            case 3:
                b=new ClsConjuntos (a.diferencia(b));
                break;
            case 4:
                b=new ClsConjuntos(a.difSimetrica(b));
                break;
            case 5:
                b=new ClsConjuntos (a.prodCartesiano(b));
                break;
            default:
        }
        TxtPantalla.setText(b.Ver());
    }//GEN-LAST:event_BtnIgualActionPerformed

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
            java.util.logging.Logger.getLogger(WinVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCardinalidad;
    private javax.swing.JButton BtnDifSimetrica;
    private javax.swing.JButton BtnDiferencia;
    private javax.swing.JButton BtnElemento;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnInterseccion;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPrdCartesiano;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnUnion;
    private javax.swing.JTextField TxtPantalla;
    // End of variables declaration//GEN-END:variables
}
