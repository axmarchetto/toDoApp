/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoApp.gui;

import it.java858.todoApp.service.CategoriaService;

import it.java858.todoApp.entity.Categoria;
import it.java858.todoApp.service.CategoriaService;
import it.java858.todoApp.service.event.CategoriaEventListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Main extends javax.swing.JFrame implements CategoriaEventListener{

   //private ToDo selectedTodo;
 
    /**
     * Creates new form Main
     */
    public Main() {
         CategoriaService.addCategoriaEventListener(this);
        
        initComponents();
        
        this.setTitle("Gestione to do");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize(width/2, height/2);
        //centra il frame sullo schermo 
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuEsci = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCreaCategoria = new javax.swing.JMenuItem();
        mnuGestCategorie = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        mnuEsci.setText("esci");
        mnuEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEsciActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEsci);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Categorie");

        mnuCreaCategoria.setText("Crea categoria");
        mnuCreaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreaCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCreaCategoria);

        mnuGestCategorie.setText("Gestione categorie");
        mnuGestCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGestCategorieActionPerformed(evt);
            }
        });
        jMenu2.add(mnuGestCategorie);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEsciActionPerformed

        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_mnuEsciActionPerformed

    private void mnuCreaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreaCategoriaActionPerformed
       Categoria c = new Categoria();
        CategoriaEdit edit = new CategoriaEdit(c,this, true);
        edit.setLocationRelativeTo(this);
        edit.setVisible(true);

    }//GEN-LAST:event_mnuCreaCategoriaActionPerformed

    private void mnuGestCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestCategorieActionPerformed
        CategoriaCRUD crud = new CategoriaCRUD(this, true);
        crud.setLocationRelativeTo(this);
        crud.setVisible(true);
    }//GEN-LAST:event_mnuGestCategorieActionPerformed

    /**
     * @param args the command line arguments
     */
    //messo il commento perchè almeno parte solo dal App
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mnuCreaCategoria;
    private javax.swing.JMenuItem mnuEsci;
    private javax.swing.JMenuItem mnuGestCategorie;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCreate(Categoria c) {
        JOptionPane.showMessageDialog(this, "hai creato una categoria ");
    }

    @Override
    public void onUpdate(Categoria c) {
        JOptionPane.showMessageDialog(this, "hai aggiornato una categoria ");
    }

    @Override
    public void onDelete(Categoria c) {
        JOptionPane.showMessageDialog(this, "hai cancellato una categoria ");
    }
}
