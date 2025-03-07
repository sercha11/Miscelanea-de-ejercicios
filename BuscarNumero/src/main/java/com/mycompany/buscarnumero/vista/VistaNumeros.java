package com.mycompany.buscarnumero.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VistaNumeros extends javax.swing.JFrame {
    List<Integer> lista = new ArrayList<>();

    public VistaNumeros() {
        initComponents();
        setLocationRelativeTo(null);
        ingresarNumeros();
        buscarNumeros();
        mostrarLista();
    }

    private void ingresarNumeros(){
        
        for(int i=0; i <10; i++) {
            String titulo ="Numero en posición: "+(i+1);
            String entrada = JOptionPane.showInputDialog(null, "Ingrese un numero: ", titulo, JOptionPane.INFORMATION_MESSAGE);
            if(!entrada.matches("\\d+") || entrada == null) {
                JOptionPane.showMessageDialog(null,"El numero ingresado no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
             i--;
            } 
            else {
                int numero = Integer.parseInt(entrada);
                lista.add(numero);
            }
        }  
    }
    
    private void buscarNumeros(){
        String entrada = JOptionPane.showInputDialog(null, "Ingrese el numero que desea buscar", "Buscando...", JOptionPane.INFORMATION_MESSAGE);
        int numero = Integer.parseInt(entrada);
        boolean encontrado = false;
        StringBuilder posicion = new StringBuilder();
        
        for(int i=0; i<lista.size(); i++) {
           if(lista.get(i).equals(numero)) {
               encontrado = true;
               posicion.append("Numero encontrado en posicion: ").append(i+1).append("\n");      
           } 
        }
        if(encontrado) {    
               JOptionPane.showMessageDialog(null, posicion.toString());
        } else{
               JOptionPane.showMessageDialog(null, "Numero no encontrado");
        }
    }
    
    private void mostrarLista(){
        txtArea.setText("");
        for(Integer n: lista){
            
            txtArea.append(n+"\n");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setText("NUMEROS QUE FUERON INGRESADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
