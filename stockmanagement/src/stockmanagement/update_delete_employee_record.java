/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockmanagement;

import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
/**
 *
 * @author Sahil
 */
public class update_delete_employee_record extends javax.swing.JInternalFrame implements myvariables
{
    JFileChooser fc;
    File myfile;
    String pic = "";

 String myimage1 = "";
    String myimage2 = "";
    /**
     * Creates new form update_delete_account
     */
    public update_delete_employee_record() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Update / Delete Employee Record");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Update / Delete Employee Record");

        jLabel2.setText("Employee Id");

        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Employee Name");

        jLabel5.setText("Father Name");

        jLabel6.setText("Mother Name");

        jLabel7.setText("Gender");

        jLabel8.setText("Department");

        jLabel9.setText("Address");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Phone");

        jButton4.setText("Upload");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Email");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("*   Mandatory Field");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("*");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Sales", "Purchase" }));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jLabel14.setText("Employee Status");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Working", "Retired", "Left" }));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Date Of Birth");

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Salary");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField4)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jFormattedTextField1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(78, 78, 78)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(13, 13, 13)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox2, 0, 220, Short.MAX_VALUE)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField10))))))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(149, 149, 149))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton4)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill Mandatory Field .");
        }
        else
        {
            try
            {
                Connection myconnection ; 
                myconnection=DriverManager.getConnection(path+place,username,password);
               try
               {
                String q =" UPDATE `emp_table` SET `emp_name`=?,`father_name`=?,`mother_name`=?,`gender`=?,dob = ?,`department`=?,`address`=?,`phone`=?,`email`=?,salary = ?,`status`=? , image_name = ? WHERE emp_id = ?";
                
                PreparedStatement mystatement  = myconnection.prepareStatement(q);
                
                
                mystatement.setString(1, jTextField2.getText().toUpperCase());
                mystatement.setString(2, jTextField4.getText().toUpperCase());
                mystatement.setString(3, jTextField5.getText().toUpperCase());
               
                
                if(jRadioButton1.isSelected())
                {
                    mystatement.setString(4, "Male");
                }
                else if(jRadioButton2.isSelected())
                {
                    mystatement.setString(4, "Female");
                }
                
                SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
                String dob = myformat.format(jDateChooser1.getDate());
                
                mystatement.setString(5, dob);
                mystatement.setString(6, jComboBox1.getSelectedItem().toString());
                mystatement.setString(7,jTextArea1.getText().toUpperCase());
                mystatement.setString(8,jFormattedTextField1.getText().toUpperCase());
                mystatement.setString(9,jTextField10.getText());
                mystatement.setString(10,jTextField11.getText());
                mystatement.setString(11,jComboBox2.getSelectedItem().toString());
                mystatement.setString(13,jTextField1.getText());
                
        if(!myimage1.equals(myfile))
       {
                String filename="";

                if(myfile!=null)
                {
                 filename = "customer_images\\"+new Date().getTime() + "_" + myfile.getName();//Date.getTime() added for unique file name.

                 int i;
                FileInputStream rd = null;
                FileOutputStream outs = null;

                try 
                {

                    rd = new FileInputStream(myfile);
                    outs = new FileOutputStream(filename);//writing the new file in 'Images' folder, in the project

                    byte[] b = new byte[2048];
                    while ((i = rd.read(b)) > 0) 
                    {
                        outs.write(b, 0, i);

                    }

                    JOptionPane.showMessageDialog(rootPane, "File saved");
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
                }
                finally 
                {
                    try 
                    {
                        rd.close();
                        outs.close();
                    }
                    catch (Exception e) 
                    {
                        JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
                    }
                }
              }
        else
        {
            filename=myimage1;
        
        }
        
                     mystatement.setString(12,filename);
        
       }  /*     else
       {
                     mystatement.setString(12,myimage);
       }*/
                
                
                
                mystatement.executeUpdate();
                
                JOptionPane.showMessageDialog(rootPane,"Employee Record Updated Successfully .");
                
                jTextField1.setText("");
                jTextField2.setText("");
                
                jTextField4.setText("");
                jTextField5.setText("");
                buttonGroup1.clearSelection();
                jComboBox1.setSelectedIndex(0);
                jTextArea1.setText("");
                jTextField11.setText("");
                jFormattedTextField1.setText(""); 
                jTextField10.setText(""); 
                jComboBox2.setSelectedIndex(0);
                jDateChooser1.setDate(null);
                jLabel4.setIcon(null);
               }
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(rootPane,"Error in Query , "+e.getMessage());
               }
               finally
               {
                   myconnection.close();
               }
                            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connection "+e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               
        fc = new JFileChooser();

        fc.setFileFilter(new FileFilter() 
        {

            @Override
            public boolean accept(File f) 
            {
                if (f.isDirectory()) 
                {
                    return true;
                }
                
                int pos = f.getName().lastIndexOf('.');
                
                if (pos == -1) 
                {
                    return false;
                }
                else
                {
                    String extention = f.getName().substring(pos + 1);//saving the extension
                    String str[] = {"gif", "png", "jpg", "jpeg"};//allowed extentions
                    for (String allwd : str) 
                    {

                        if (extention.equalsIgnoreCase(allwd)) 
                        {
                            return true;
                        }
                    }
                    return false;
                }

            }

            @Override
            public String getDescription() 
            {

                return "All Image Files";
            }
        });
        int result = fc.showOpenDialog(null);

         if (result == JFileChooser.APPROVE_OPTION) 
        {
            myfile = fc.getSelectedFile();
            
            myimage2 = myfile.getName();
           try 
            {
                jLabel4.setIcon(new ImageIcon(ImageIO.read(myfile)));
            }
            catch (IOException e) 
            {
                JOptionPane.showMessageDialog(rootPane, "Error");
               
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill Mandatory Field .");
        }
        else
        {
            try
            {
                Connection myconnection ; 
                myconnection=DriverManager.getConnection(path+place,username,password);
               try
               {
                String q="select * from emp_table where emp_id = ?";
                
                
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1,jTextField1.getText());
                ResultSet rs = mystatement.executeQuery();
                
                if(rs.next())
                {
         
                String c_name  = rs.getString("emp_name");
                String f_name  = rs.getString("father_name");
                String m_name  = rs.getString("mother_name");
                String gender  = rs.getString("gender");
                Date dob = rs.getDate("dob");
                String occ  = rs.getString("department");
                String address  = rs.getString("address");
                String ph  = rs.getString("phone");
                String email  = rs.getString("email");
                String sal  = rs.getString("salary");
                String status  = rs.getString("status");
                myimage1 = rs.getString("image_name");
               
                jLabel4.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("image_name")))));
               
                jTextField2.setText(c_name);
                jTextField4.setText(f_name);
                jTextField5.setText(m_name); 
                
                if(gender.equals("Male"))
                {
                    jRadioButton1.setSelected(true);
                }
                if(gender.equals("Female"))
                {
                    jRadioButton2.setSelected(true);
                }
                
                jDateChooser1.setDate(dob);
                jComboBox1.setSelectedItem(occ);
                jTextArea1.setText(address);
                jFormattedTextField1.setText(ph);
                jTextField10.setText(email); 
                jTextField11.setText(sal); 
                jComboBox2.setSelectedItem(status);
                }
               
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in Query "+e.getMessage());
                }
               finally
               {
                   myconnection.close();
               }
            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connection "+e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill Mandatory Field .");
        }
        else
        {
            try
            {
                Connection myconnection ; 
                myconnection=DriverManager.getConnection(path+place,username,password);
               try
               {
                String q =" UPDATE `emp_table` SET `status`=? WHERE emp_id = ?";
                
                PreparedStatement mystatement  = myconnection.prepareStatement(q);
                mystatement.setString(2,jTextField1.getText());
                
                mystatement.setString(1,"Left");
               
                int result = JOptionPane.showConfirmDialog(rootPane,"Do you really want to Delete ?","Are you sure ?",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
        
                if(result == JOptionPane.YES_OPTION)
                {
                
                    int a = mystatement.executeUpdate();
                
                    if(a>0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Employee Record Deactivated Successfully .");
                    }
                }
                jTextField1.setText("");
                jTextField2.setText("");
                
                jTextField4.setText("");
                jTextField5.setText("");
                buttonGroup1.clearSelection();
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextArea1.setText("");
                jTextField11.setText("");
                jFormattedTextField1.setText(""); 
                jTextField10.setText("");
                jDateChooser1.setDate(null);
                jLabel4.setIcon(null);
               }
               catch(Exception e)
               {
                   JOptionPane.showMessageDialog(rootPane,"Error in Query , "+e.getMessage());
               }
               finally
               {
                   myconnection.close();
               }
                            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connection "+e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}