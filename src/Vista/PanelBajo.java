/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Manejador;

/**
 *
 * @author Luis Enrique
 */
public class PanelBajo extends javax.swing.JPanel {

    /**
     * Creates new form PanelBajo
     */
    public PanelBajo() {
        initComponents();
    }
    public String retornarExp()
    {
        return jtExp.getText();
    }
    public void establecerMetodos(Manejador manejador)
    {
        jbCalcular.addActionListener(manejador);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlExp = new javax.swing.JLabel();
        jtExp = new javax.swing.JTextField();
        jbCalcular = new javax.swing.JButton();

        jlExp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlExp.setText("Exp:");

        jtExp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jbCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCalcular.setText("Calcular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlExp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlExp)
                    .addComponent(jtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCalcular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCalcular;
    private javax.swing.JLabel jlExp;
    private javax.swing.JTextField jtExp;
    // End of variables declaration//GEN-END:variables
}
