/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrosbct;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ELECTRONICA
 */
public class REGISTRO extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    public REGISTRO() {
        //Elementos de la tabla checador
        
        
        initComponents();
        model.addColumn("Apellido paterno");
        model.addColumn("Apellido materno");
        model.addColumn("Nombre(s)");
        model.addColumn("NSS");
        model.addColumn("Sexo");
        this.tablachecador.setModel(model);
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ApellidoP = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        ApellidoM = new javax.swing.JTextField();
        NSS = new javax.swing.JTextField();
        Sexo = new javax.swing.JComboBox<>();
        Agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonNue = new javax.swing.JButton();
        BotonEli = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablachecador = new javax.swing.JTable();
        Modificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre(s):");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(224, 152, 54, 14);

        jLabel2.setText("Apellido paterno:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(224, 190, 82, 14);

        jLabel4.setText("Apellido materno:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(224, 228, 84, 14);

        jLabel5.setText("NSS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(224, 266, 23, 14);

        jLabel6.setText("Sexo: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(224, 304, 31, 14);

        ApellidoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ApellidoP);
        ApellidoP.setBounds(316, 187, 172, 18);

        Nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre);
        Nombre.setBounds(288, 149, 200, 18);

        ApellidoM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ApellidoM);
        ApellidoM.setBounds(318, 225, 170, 18);

        NSS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSSActionPerformed(evt);
            }
        });
        getContentPane().add(NSS);
        NSS.setBounds(257, 263, 231, 18);

        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Otro"}));
        Sexo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Sexo);
        Sexo.setBounds(265, 301, 28, 20);

        Agregar.setText("Agregar");
        Agregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar);
        Agregar.setBounds(230, 330, 80, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Bison Truck Control ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 10, 241, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Registro/Modificar/Eliminar");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 50, 159, 17);

        BotonNue.setText("Nuevo");
        BotonNue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNueActionPerformed(evt);
            }
        });
        getContentPane().add(BotonNue);
        BotonNue.setBounds(320, 330, 70, 19);

        BotonEli.setText("Eliminar");
        BotonEli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEli);
        BotonEli.setBounds(1070, 520, 41, 19);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Registro");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1070, 130, 60, 17);

        tablachecador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablachecador);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(516, 149, 620, 360);

        Modificar.setText("Modificicar");
        Modificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar);
        Modificar.setBounds(400, 330, 100, 19);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELECTRONICA.DESKTOP-AT5D5SS\\Desktop\\LOGO2.0.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 70, 1200, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NSSActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String[] agregar = new String [5];
        agregar[0]=ApellidoP.getText();
        agregar[1]=ApellidoM.getText();
        agregar[2]=Nombre.getText();
        agregar[3]=NSS.getText();
        agregar[4]=(String)Sexo.getSelectedItem();
        model.addRow(agregar);
    }//GEN-LAST:event_AgregarActionPerformed

    private void BotonNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNueActionPerformed
       Nombre.setText(" ");
       ApellidoP.setText(" ");
       ApellidoM.setText(" ");
       NSS.setText(" ");
       
    }//GEN-LAST:event_BotonNueActionPerformed

    private void BotonEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliActionPerformed
       int FilaSe = tablachecador.getSelectedRow();
       if(FilaSe>=0){
           model.removeRow(FilaSe);
       }
       else{
           JOptionPane.showMessageDialog(this, "No a seleccionado a ningun empleado");
       }
    }//GEN-LAST:event_BotonEliActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      int Fila = tablachecador.getSelectedRow();
      if(Fila>=0){
          Nombre.setText(tablachecador.getValueAt(Fila, 0).toString());
           ApellidoP.setText(tablachecador.getValueAt(Fila, 1).toString());
            ApellidoM.setText(tablachecador.getValueAt(Fila, 2).toString());
             NSS.setText(tablachecador.getValueAt(Fila, 4).toString());
             model.removeRow(Fila);
      }
      else{
          JOptionPane.showMessageDialog(this, "No ha seleccionado a ningun empleado");
      }
    }//GEN-LAST:event_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField ApellidoM;
    private javax.swing.JTextField ApellidoP;
    private javax.swing.JButton BotonEli;
    private javax.swing.JButton BotonNue;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NSS;
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablachecador;
    // End of variables declaration//GEN-END:variables
}