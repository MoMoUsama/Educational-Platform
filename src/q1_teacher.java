/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ziad
 */
public class q1_teacher extends javax.swing.JFrame {

    /**
     * Creates new form q1
     */
    public q1_teacher() {
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

        jRadioButton1_q1z4 = new javax.swing.JRadioButton();
        buttonGroup1_q1 = new javax.swing.ButtonGroup();
        buttonGroup1_ans_q1 = new javax.swing.ButtonGroup();
        buttonGroup1_q2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1_q1z = new javax.swing.JTextField();
        b1z = new javax.swing.JRadioButton();
        b2z = new javax.swing.JRadioButton();
        b9z = new javax.swing.JRadioButton();
        b13z = new javax.swing.JRadioButton();
        b5z = new javax.swing.JRadioButton();
        b17z = new javax.swing.JRadioButton();
        b6z = new javax.swing.JRadioButton();
        b14z = new javax.swing.JRadioButton();
        b18z = new javax.swing.JRadioButton();
        b10z = new javax.swing.JRadioButton();
        jTextField1_q1z1 = new javax.swing.JTextField();
        jTextField1_q1z2 = new javax.swing.JTextField();
        jTextField1_q1z3 = new javax.swing.JTextField();
        jTextField1_q1z4 = new javax.swing.JTextField();
        jTextField1_q1z5 = new javax.swing.JTextField();
        jTextField1_q1z6 = new javax.swing.JTextField();
        jTextField1_q1z7 = new javax.swing.JTextField();
        jTextField1_q1z8 = new javax.swing.JTextField();
        jTextField1_q1z9 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jRadioButton1_q1z4.setBackground(new java.awt.Color(36, 47, 65));
        jRadioButton1_q1z4.setText("a");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1_q1z.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z.setText("q2");
        jTextField1_q1z.setBorder(null);
        jTextField1_q1z.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1zActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 520, -1));

        b1z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(b1z);
        b1z.setForeground(new java.awt.Color(255, 255, 255));
        b1z.setText("a ");
        jPanel1.add(b1z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 40, -1));

        b2z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(b2z);
        b2z.setForeground(new java.awt.Color(255, 255, 255));
        b2z.setText("b");
        jPanel1.add(b2z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 40, -1));

        b9z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_q1.add(b9z);
        b9z.setForeground(new java.awt.Color(255, 255, 255));
        b9z.setText("a");
        jPanel1.add(b9z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 40, -1));

        b13z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_q2.add(b13z);
        b13z.setForeground(new java.awt.Color(255, 255, 255));
        b13z.setText("a");
        jPanel1.add(b13z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 40, 20));

        b5z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_ans_q1.add(b5z);
        b5z.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(b5z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 40, -1));

        b17z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup4.add(b17z);
        b17z.setForeground(new java.awt.Color(255, 255, 255));
        b17z.setText("a");
        jPanel1.add(b17z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 40, -1));

        b6z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_ans_q1.add(b6z);
        b6z.setForeground(new java.awt.Color(255, 255, 255));
        b6z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6zActionPerformed(evt);
            }
        });
        jPanel1.add(b6z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 40, -1));

        b14z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_q2.add(b14z);
        b14z.setForeground(new java.awt.Color(255, 255, 255));
        b14z.setText("b");
        jPanel1.add(b14z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 40, -1));

        b18z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup4.add(b18z);
        b18z.setForeground(new java.awt.Color(255, 255, 255));
        b18z.setText("b");
        jPanel1.add(b18z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 40, -1));

        b10z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_q1.add(b10z);
        b10z.setForeground(new java.awt.Color(255, 255, 255));
        b10z.setText("b");
        jPanel1.add(b10z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 40, -1));

        jTextField1_q1z1.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z1.setText("q1 ");
        jTextField1_q1z1.setBorder(null);
        jTextField1_q1z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 520, -1));

        jTextField1_q1z2.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z2.setText("q4");
        jTextField1_q1z2.setBorder(null);
        jTextField1_q1z2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 540, -1));

        jTextField1_q1z3.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z3.setText("q5");
        jTextField1_q1z3.setBorder(null);
        jTextField1_q1z3.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 550, -1));

        jTextField1_q1z4.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z4.setText("q3");
        jTextField1_q1z4.setBorder(null);
        jTextField1_q1z4.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 530, -1));

        jTextField1_q1z5.setEditable(false);
        jTextField1_q1z5.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1_q1z5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z5.setText("correct answer:");
        jTextField1_q1z5.setBorder(null);
        jTextField1_q1z5.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jTextField1_q1z6.setEditable(false);
        jTextField1_q1z6.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1_q1z6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z6.setText("correct answer:");
        jTextField1_q1z6.setBorder(null);
        jTextField1_q1z6.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jTextField1_q1z7.setEditable(false);
        jTextField1_q1z7.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1_q1z7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z7.setText("correct answer:");
        jTextField1_q1z7.setBorder(null);
        jTextField1_q1z7.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jTextField1_q1z8.setEditable(false);
        jTextField1_q1z8.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1_q1z8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z8.setText("correct answer:");
        jTextField1_q1z8.setBorder(null);
        jTextField1_q1z8.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jTextField1_q1z9.setEditable(false);
        jTextField1_q1z9.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField1_q1z9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z9.setText("correct answer:");
        jTextField1_q1z9.setBorder(null);
        jTextField1_q1z9.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, -1, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 51));
        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText(" write choices");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, -1));

        jTextField6.setBackground(new java.awt.Color(0, 0, 51));
        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText(" write choices");
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 150, -1));

        jTextField8.setBackground(new java.awt.Color(0, 0, 51));
        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText(" write choices");
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 160, -1));

        jTextField10.setBackground(new java.awt.Color(0, 0, 51));
        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText(" write choices");
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 160, -1));

        jTextField11.setBackground(new java.awt.Color(0, 0, 51));
        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText(" write choices");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 170, 20));

        jTextField12.setBackground(new java.awt.Color(0, 0, 51));
        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText(" write choices");
        jTextField12.setBorder(null);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 20));

        jTextField14.setBackground(new java.awt.Color(0, 0, 51));
        jTextField14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setText(" write choices");
        jTextField14.setBorder(null);
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, -1));

        jTextField16.setBackground(new java.awt.Color(0, 0, 51));
        jTextField16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setText(" write choices");
        jTextField16.setBorder(null);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 140, -1));

        jTextField18.setBackground(new java.awt.Color(0, 0, 51));
        jTextField18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setText(" write choices");
        jTextField18.setBorder(null);
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 140, -1));

        jTextField20.setBackground(new java.awt.Color(0, 0, 51));
        jTextField20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jTextField20.setText(" write choices");
        jTextField20.setBorder(null);
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 140, -1));

        jTextField13.setBackground(new java.awt.Color(0, 0, 51));
        jTextField13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setText("(a) or (b)");
        jTextField13.setBorder(null);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 110, -1));

        jTextField15.setBackground(new java.awt.Color(0, 0, 51));
        jTextField15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setText("(a) or (b)");
        jTextField15.setBorder(null);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 110, -1));

        jTextField17.setBackground(new java.awt.Color(0, 0, 51));
        jTextField17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setText("(a) or (b)");
        jTextField17.setBorder(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 110, -1));

        jTextField19.setBackground(new java.awt.Color(0, 0, 51));
        jTextField19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setText("(a) or (b)");
        jTextField19.setBorder(null);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, -1));

        jTextField21.setBackground(new java.awt.Color(0, 0, 51));
        jTextField21.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 255, 255));
        jTextField21.setText("(a) or (b)");
        jTextField21.setBorder(null);
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 110, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("apply changes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 680, 140, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-40.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_q1zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1zActionPerformed

    private void b6zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6zActionPerformed

    private void jTextField1_q1z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z1ActionPerformed

    private void jTextField1_q1z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z2ActionPerformed

    private void jTextField1_q1z3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z3ActionPerformed

    private void jTextField1_q1z4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z4ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField1_q1z9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z9ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField1_q1z7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z7ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField1_q1z6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z6ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField1_q1z8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z8ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField1_q1z5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            PrintWriter s = new PrintWriter(new File("q1file.txt"));
            s.println(jTextField1_q1z1.getText());
            s.println(jTextField11.getText());
            s.println(jTextField12.getText());
            s.println(jTextField15.getText());

            s.println(jTextField1_q1z.getText());
            s.println(jTextField4.getText());
            s.println(jTextField14.getText());
            s.println(jTextField19.getText());

            s.println(jTextField1_q1z4.getText());
            s.println(jTextField6.getText());
            s.println(jTextField16.getText());
            s.println(jTextField17.getText());

            s.println(jTextField1_q1z2.getText());
            s.println(jTextField8.getText());
            s.println(jTextField18.getText());
            s.println(jTextField21.getText());

            s.println(jTextField1_q1z3.getText());
            s.println(jTextField10.getText());
            s.println(jTextField20.getText());
            s.println(jTextField13.getText());
            s.close();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
SignInl s1=new SignInl();
                    s1.show();
                    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

       
       
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
            java.util.logging.Logger.getLogger(q1_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(q1_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(q1_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(q1_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new q1_teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b10z;
    private javax.swing.JRadioButton b13z;
    private javax.swing.JRadioButton b14z;
    private javax.swing.JRadioButton b17z;
    private javax.swing.JRadioButton b18z;
    private javax.swing.JRadioButton b1z;
    private javax.swing.JRadioButton b2z;
    private javax.swing.JRadioButton b5z;
    private javax.swing.JRadioButton b6z;
    private javax.swing.JRadioButton b9z;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup1_ans_q1;
    private javax.swing.ButtonGroup buttonGroup1_q1;
    private javax.swing.ButtonGroup buttonGroup1_q2;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_q1z4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField1_q1z;
    public javax.swing.JTextField jTextField1_q1z1;
    private javax.swing.JTextField jTextField1_q1z2;
    private javax.swing.JTextField jTextField1_q1z3;
    private javax.swing.JTextField jTextField1_q1z4;
    private javax.swing.JTextField jTextField1_q1z5;
    private javax.swing.JTextField jTextField1_q1z6;
    private javax.swing.JTextField jTextField1_q1z7;
    private javax.swing.JTextField jTextField1_q1z8;
    private javax.swing.JTextField jTextField1_q1z9;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
