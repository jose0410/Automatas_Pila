/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Automata.Validacion;
import javax.swing.JFrame;


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
        this.Estados.setEnabledAt(0, false);
        this.Estados.setEnabledAt(1, false);
        this.Estados.setEnabledAt(2, false);
        this.estado1.getTableHeader().setReorderingAllowed(false); 
        this.estado2.getTableHeader().setReorderingAllowed(false); 
        this.estado3.getTableHeader().setReorderingAllowed(false); 
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
        Estados = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        estado1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        estado2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        estado3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        seleccionEstados = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creacion de automatas de pila");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Símbolos de Entrada (Ej: s,e,3,5,...)");
        jLabel1.setToolTipText("");

        jLabel2.setText("Símbolos en la pila (Ej:e,3,4,...)");
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

        estado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(estado1);

        Estados.addTab("Estado1", jScrollPane1);

        estado2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        estado2.setEnabled(false);
        jScrollPane2.setViewportView(estado2);

        Estados.addTab("Estado2", jScrollPane2);

        estado3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        estado3.setEnabled(false);
        jScrollPane3.setViewportView(estado3);

        Estados.addTab("Estado3", jScrollPane3);

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

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel5.setText("Tabla de transiciones");

        jButton2.setText("Crear fuente.java");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Compilar codigo fuente");

        jButton4.setText("Ayuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Conf_Stack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stackSymbols, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputSymbols, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(seleccionEstados, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(Estados, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Estados, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                        .addContainerGap())
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
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Conf_Stack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(32, 32, 32))))
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
        Estados.getAccessibleContext().setAccessibleName("Estados");
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
        Validacion.validarEstados(seleccionEstados, Estados);
        TablaTransicion.modificarTablar(h, h1, estado1);
        TablaTransicion.modificarTablar(h, h1, estado2);
        TablaTransicion.modificarTablar(h, h1, estado3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputSymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSymbolsActionPerformed
        
    }//GEN-LAST:event_inputSymbolsActionPerformed

    private void inputSymbolsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSymbolsKeyTyped
        
        
    }//GEN-LAST:event_inputSymbolsKeyTyped

    private void seleccionEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionEstadosActionPerformed
        /*int x = seleccionEstados.getSelectedIndex();
        
        }*/
    }//GEN-LAST:event_seleccionEstadosActionPerformed

    private void stackSymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackSymbolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stackSymbolsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JTabbedPane Estados;
    private javax.swing.JTable estado1;
    private javax.swing.JTable estado2;
    private javax.swing.JTable estado3;
    private java.awt.TextField inputSymbols;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> seleccionEstados;
    private java.awt.TextField stackSymbols;
    // End of variables declaration//GEN-END:variables
}
