/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Automata.Validacion;


/**
 *
 * @author Nando
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.jTabbedPane1.setEnabledAt(0, false);
        this.jTabbedPane1.setEnabledAt(1, false);
        this.jTabbedPane1.setEnabledAt(2, false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputSymbols = new java.awt.TextField();
        stackSymbols = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        Conf_Stack = new java.awt.TextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        estado1Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        estado2Panel = new javax.swing.JPanel();
        estado3Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        seleccionEstados = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Símbolos de Entrada (Ej: s,e,3,5,...)");
        jLabel1.setToolTipText("");

        jLabel2.setText("Símbolos en la pila (Ej: simbolo inicial pila,e,3,4,...)");
        jLabel2.setToolTipText("");

        jLabel3.setText("Cantidad de Estados");

        inputSymbols.setName("inputSymbols"); // NOI18N
        inputSymbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSymbolsActionPerformed(evt);
            }
        });
        inputSymbols.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputSymbolsKeyTyped(evt);
            }
        });

        stackSymbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackSymbolsActionPerformed(evt);
            }
        });

        jLabel4.setText("Configuracion inicial Pila");

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout estado1PanelLayout = new javax.swing.GroupLayout(estado1Panel);
        estado1Panel.setLayout(estado1PanelLayout);
        estado1PanelLayout.setHorizontalGroup(
            estado1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estado1PanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        estado1PanelLayout.setVerticalGroup(
            estado1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estado1PanelLayout.createSequentialGroup()
                .addGap(0, 191, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Estado 1", estado1Panel);

        javax.swing.GroupLayout estado2PanelLayout = new javax.swing.GroupLayout(estado2Panel);
        estado2Panel.setLayout(estado2PanelLayout);
        estado2PanelLayout.setHorizontalGroup(
            estado2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        estado2PanelLayout.setVerticalGroup(
            estado2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estado 2", estado2Panel);

        javax.swing.GroupLayout estado3PanelLayout = new javax.swing.GroupLayout(estado3Panel);
        estado3Panel.setLayout(estado3PanelLayout);
        estado3PanelLayout.setHorizontalGroup(
            estado3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        estado3PanelLayout.setVerticalGroup(
            estado3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estado 3", estado3Panel);

        jButton1.setText("Crear Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        seleccionEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3" }));
        seleccionEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionEstadosActionPerformed(evt);
            }
        });

        jLabel5.setText("Tabla de transiciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Conf_Stack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(stackSymbols, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputSymbols, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(seleccionEstados, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSymbols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(stackSymbols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(seleccionEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Conf_Stack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        jLabel1.getAccessibleContext().setAccessibleName("jlabel1");
        jLabel2.getAccessibleContext().setAccessibleName("jlabel2");
        jLabel3.getAccessibleContext().setAccessibleName("jlabel3");
        jLabel3.getAccessibleContext().setAccessibleDescription("");
        inputSymbols.getAccessibleContext().setAccessibleName("inputSymbols");
        stackSymbols.getAccessibleContext().setAccessibleName("stackSymbols");
        jLabel4.getAccessibleContext().setAccessibleName("jlabel4");
        jLabel4.getAccessibleContext().setAccessibleDescription("");
        Conf_Stack.getAccessibleContext().setAccessibleName("Conf_Stack");
        jTabbedPane1.getAccessibleContext().setAccessibleName("Estados");
        jButton1.getAccessibleContext().setAccessibleName("createTable");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String h = this.inputSymbols.getText();
        Validacion.validarSimbolosEntrada(h);
        String h1 = this.stackSymbols.getText();        
        Validacion.validarSimbolosPila(h1);
        String h2 = this.Conf_Stack.getText();
        Validacion.validarConfPila(h2);
        Validacion.validarRepetidosEntrada(h);
        Validacion.validarRepetidosPila(h1);
        Validacion.validarRepetidosConfPila(h2);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputSymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSymbolsActionPerformed
        
    }//GEN-LAST:event_inputSymbolsActionPerformed

    private void inputSymbolsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSymbolsKeyTyped
        
        
    }//GEN-LAST:event_inputSymbolsKeyTyped

    private void seleccionEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionEstadosActionPerformed
        int x = seleccionEstados.getSelectedIndex();
        switch (x) {
            case 3:
                this.jTabbedPane1.setEnabledAt(2, true);
            case 2:
                this.jTabbedPane1.setEnabledAt(1, true);
            case 1:
                this.jTabbedPane1.setEnabledAt(0, true);
        }
    }//GEN-LAST:event_seleccionEstadosActionPerformed

    private void stackSymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackSymbolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stackSymbolsActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Conf_Stack;
    private javax.swing.JPanel estado1Panel;
    private javax.swing.JPanel estado2Panel;
    private javax.swing.JPanel estado3Panel;
    private java.awt.TextField inputSymbols;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> seleccionEstados;
    private java.awt.TextField stackSymbols;
    // End of variables declaration//GEN-END:variables
}
