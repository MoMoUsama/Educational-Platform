/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import jaco.mp3.player.MP3Player;
import java.awt.Desktop;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali
 */
public class AssignmentSubFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form AssignmentSubFrame
     */
    public static final String Songe = "wah-wah-sad-trombone-6347.mp3";
    public static final String Songhe = "crowd-cheer-ii-6263.mp3";
    MP3Player mp3playere = new MP3Player(new File(Songe));
    MP3Player mp3playerhe = new MP3Player(new File(Songhe));
    public AssignmentSubFrame2() {
        initComponents();
    }
   protected void DeadlineCheck() throws ParseException {
Date CurrentDate= new Date(); // Current System Date and time is assigned to objDate
  String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
  //System.out.println(objSDF.format(CurrentDate)); //Date formatting is applied to the current date
 Date deadline= objSDF.parse(jLabel3.getText());
 FileWrite("MohamedHassanDeadline2.txt",objSDF.format(CurrentDate));

  //System.out.println("Deadline time: " + objSDF.format(deadline));
  //System.out.println("Time you submitted at : " + objSDF.format(CurrentDate));

  if (CurrentDate.compareTo(deadline) > 0) { 
   mp3playere.play();
   JOptionPane.showMessageDialog(this,"For Sorry, you're late"+"\n"+"Deadline time: " + objSDF.format(deadline)+"\n"+"Time you submitted at : " + objSDF.format(CurrentDate),"Submit Time",JOptionPane.INFORMATION_MESSAGE);
  
  } // compareTo method returns the value greater than 0 if this Date is after the Date argument.
  else if (CurrentDate.compareTo(deadline) < 0) {
   mp3playerhe.play();
   JOptionPane.showMessageDialog(this,"Well Done!!"+"\n"+"Deadline time: " + objSDF.format(deadline)+"\n"+"Time you submitted at : " + objSDF.format(CurrentDate),"Submit Time",JOptionPane.INFORMATION_MESSAGE);
  
  } // compareTo method returns the value less than 0 if this Date is before the Date argument;
  else if (CurrentDate.compareTo(deadline) == 0) {
   mp3playerhe.play();
   JOptionPane.showMessageDialog(this,"Exactly On Time!!"+"\n"+"Deadline time: " + objSDF.format(deadline)+"\n"+"Time you submitted at : " + objSDF.format(CurrentDate),"Submit Time",JOptionPane.INFORMATION_MESSAGE);
  } // compareTo method returns the value 0 if the argument Date is equal to the second Date;
  
 }
   protected void FileWrite(String n,String m){
           PrintWriter outputStream = null;
try
{
outputStream =new PrintWriter(new FileWriter(n));



}
catch(FileNotFoundException e)
{
    JOptionPane.showMessageDialog(this,"Error Submitting the file please contact software team","Submit Error",JOptionPane.WARNING_MESSAGE);


}       catch (IOException ex) {
            Logger.getLogger(AssignmentSubFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
outputStream.println(m);
outputStream.close();
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonh3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("File Path : ");

        btn1.setBackground(new java.awt.Color(36, 47, 65));
        btn1.setText("Upload");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deadline is :");

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonh3.setBackground(new java.awt.Color(36, 47, 65));
        jButtonh3.setText("Submit");
        jButtonh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonh3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("7:23:39 PM 20-Jun-2022");

        jButton2.setBackground(new java.awt.Color(36, 47, 65));
        jButton2.setText("Assignment File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn1)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButtonh3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton2)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btn1))
                .addGap(18, 18, 18)
                .addComponent(jButtonh3)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String path;
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
           //Upload Button
           JFileChooser file_upload = new JFileChooser();
      int res = file_upload.showOpenDialog(null);
      if(res == JFileChooser.APPROVE_OPTION){
          File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
          path = (String)file_upload.getSelectedFile().toString();
          jTextField1.setText(path);}
          
      
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Open Button
        try{
            File file_path = new File(path);
            if(file_path.exists()){
            if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file_path);
            }
            
            else{
            JOptionPane.showMessageDialog(this,"File Not Supported");
            }
            
            }
            else{
            JOptionPane.showMessageDialog(this,"File Not Exist");
            }
        }
            catch(Exception e){
            e.printStackTrace();
            }
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonh3ActionPerformed
        FileWrite("MohamedHassanAssignmentPath2.txt",path);
        try {
            DeadlineCheck();
        } catch (ParseException ex) {
            Logger.getLogger(AssignmentSubFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonh3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            File file_path = new File("Assignment Discrete 4.pdf");
            if(file_path.exists()){
            if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file_path);
            }
            
            else{
            JOptionPane.showMessageDialog(this,"File Not Supported");
            }
            
            }
            else{
            JOptionPane.showMessageDialog(this,"File Not Exist");
            }
        }
            catch(Exception e){
            e.printStackTrace();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(AssignmentSubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentSubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentSubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentSubFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentSubFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btn1;
    protected javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonh3;
    private javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
