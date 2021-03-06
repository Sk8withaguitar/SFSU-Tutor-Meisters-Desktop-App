/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * firstWindow.java
 *
 * Created on Jan 7, 2014, 3:40:00 PM
 */

package guiapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;

/**
 * 
 *
 * @author sk8withaguitar
 */
public class firstWindow extends javax.swing.JFrame
{
    SearchWindow searchW = new SearchWindow();
    ArrayList<String> finalString = new ArrayList<String>();
    sqlStuff sql = new sqlStuff();
    ArrayList<Tutors> tutors = new ArrayList<Tutors>();
    /** Creates new form firstWindow */
    public firstWindow()
           
    {
   
        setLocation(300, 134);
        setVisible(true);
    
        initComponents();
        PayRate.setVisible(false);
        IDL.setVisible(false);
        NameLabel.setVisible(false);
        BioLabel.setVisible(false);
        FileIO fRead = new FileIO();
       
            
            try {
                fRead.ReadFile("Data.txt", finalString);
                } catch (IOException ex) {
                Logger.getLogger(firstWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
         tutors = sql.doSql();
    }
    
     
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeNameButton = new javax.swing.JButton();
        SeeAllButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        IDSearchButton = new javax.swing.JButton();
        EmployeeAddButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ShowAllPane = new javax.swing.JList();
        DeleteButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        PayRate = new javax.swing.JLabel();
        BioLabel = new javax.swing.JLabel();
        IDL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchEmployeeTextField = new javax.swing.JTextField();
        SearchEmployeeIDTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Application");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(760, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Myriad Web Pro", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Employee Database");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 250, 56);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Search Employee By Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 260, 200, 17);

        employeeNameButton.setBackground(new java.awt.Color(102, 0, 102));
        employeeNameButton.setForeground(new java.awt.Color(255, 204, 0));
        employeeNameButton.setText("GO!");
        employeeNameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(employeeNameButton);
        employeeNameButton.setBounds(380, 250, 79, 47);

        SeeAllButton.setBackground(new java.awt.Color(102, 0, 102));
        SeeAllButton.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        SeeAllButton.setForeground(new java.awt.Color(255, 204, 0));
        SeeAllButton.setText("See All Employee's");
        SeeAllButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SeeAllButton);
        SeeAllButton.setBounds(559, 377, 94, 51);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Search By Employee ID: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 330, 180, 17);

        IDSearchButton.setBackground(new java.awt.Color(102, 0, 102));
        IDSearchButton.setForeground(new java.awt.Color(255, 204, 0));
        IDSearchButton.setText("GO!");
        IDSearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IDSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IDSearchButton);
        IDSearchButton.setBounds(380, 320, 79, 46);

        EmployeeAddButton.setBackground(new java.awt.Color(102, 0, 102));
        EmployeeAddButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EmployeeAddButton.setForeground(new java.awt.Color(255, 204, 0));
        EmployeeAddButton.setText("Add Employee");
        EmployeeAddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmployeeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeAddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmployeeAddButton);
        EmployeeAddButton.setBounds(40, 410, 129, 51);

        ShowAllPane.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "All Students Will Be Displayed Here" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ShowAllPane.setToolTipText("");
        ShowAllPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowAllPaneMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ShowAllPane);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(503, 0, 220, 359);

        DeleteButton.setBackground(new java.awt.Color(102, 0, 102));
        DeleteButton.setForeground(new java.awt.Color(255, 204, 0));
        DeleteButton.setText("Delete Employee");
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(220, 410, 130, 50);

        NameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("jLabel4");
        getContentPane().add(NameLabel);
        NameLabel.setBounds(240, 80, 180, 27);

        PayRate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        PayRate.setForeground(new java.awt.Color(255, 255, 255));
        PayRate.setText("jLabel4");
        getContentPane().add(PayRate);
        PayRate.setBounds(240, 120, 180, 17);

        BioLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        BioLabel.setForeground(new java.awt.Color(255, 255, 255));
        BioLabel.setText("jLabel4");
        getContentPane().add(BioLabel);
        BioLabel.setBounds(240, 190, 190, 17);

        IDL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        IDL.setForeground(new java.awt.Color(255, 255, 255));
        IDL.setText("jLabel4");
        getContentPane().add(IDL);
        IDL.setBounds(240, 150, 190, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiapp/temp-logoResize.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 11, 211, 95);
        getContentPane().add(SearchEmployeeTextField);
        SearchEmployeeTextField.setBounds(220, 260, 135, 27);

        SearchEmployeeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchEmployeeIDTextField);
        SearchEmployeeIDTextField.setBounds(220, 330, 135, 27);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiapp/SecondBackground.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 740, 490);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(380, 100, 70, 6);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(320, 100, 140, 80);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(530, 120, 140, 6);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(350, 80, 120, 6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameButtonActionPerformed
        // TODO add your handling code here:
         boolean found = false;
        if(SearchEmployeeTextField.isValid())
        {
           // System.out.println("NOW");
            String temp = SearchEmployeeTextField.getText();
           //Contractor cont = new Contractor();
            ArrayList<String> lines = new ArrayList<String>();
            FileIO fRead = new FileIO();
            
            try {
                fRead.ReadFile("Data.txt", lines);
                fRead.ReadFile("Data.txt", finalString);
                } catch (IOException ex) {
                Logger.getLogger(firstWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            Iterator it = lines.iterator();
            while(it.hasNext())
            {
            String tempLine = (String) it.next();
            Pattern pat = Pattern.compile("[,]"); 
	    String strs[] = pat.split(tempLine);
            
            if(strs[1].equalsIgnoreCase(temp))
            { 
           // System.out.println("Found A Match!");
                if(strs[0].equalsIgnoreCase("Marketer"))
                {
                   found = true;
                   Marketers tempM = new Marketers(strs[0],strs[1],strs[2],strs[3]);
                   
                   FoundName fn = new FoundName();
                   fn.setEmailLabel(tempM.getEmail());
                   fn.setNameLabel(tempM.getName());
                   fn.setTypeLabel("Marketer");
                   fn.setVisible(true);
                   
                  // System.out.println(tempM.getBio());
                   //cont.marketers.add(tempM);
                }
                
                if(strs[0].equalsIgnoreCase("Tutor"))
                {
                    found = true;
                    Tutors tempT = new Tutors(strs[0],strs[1],strs[2],strs[3],strs[4],strs[5]);
                    
                   FoundName fn = new FoundName();
                   fn.setEmailLabel(tempT.getEmail());
                   fn.setNameLabel(tempT.getName());
                   fn.setTypeLabel("Tutor");
                   fn.setVisible(true);
                   
                   System.out.println(tempT.getSubject());
                   //cont.tutors.add(tempT);
                }
                
                if(strs[0].equalsIgnoreCase("Developer"))
                {
                    found = true;
                  developers tempD = new developers(strs[0],strs[1],strs[2],strs[3]);
                  
                   FoundName fn = new FoundName();
                   fn.setEmailLabel(tempD.getEmail());
                   fn.setNameLabel(tempD.getName());
                   fn.setTypeLabel("Developer");
                   fn.setVisible(true);
                   
                 // System.out.println(tempD.getBio());
                  // cont.devs.add(tempD);
                }
                
                if(strs[0].equalsIgnoreCase("Accountant"))
                {
                   found = true;
                   Accountants tempA = new Accountants(strs[0],strs[1],strs[2]);
                   
                   FoundName fn = new FoundName();
                   fn.setEmailLabel(tempA.getAemail());
                   fn.setNameLabel(tempA.getAname());
                   fn.setTypeLabel("Accountant");
                   fn.setVisible(true);
                   
                  // System.out.println(tempA.getAemail());
                  // cont.accountants.add(tempA);
                }
                
            }//End If
            }// End While
            
           // new fram2().setVisible(true);
            if(found == false)
            {
            CannotFindWindow cF = new CannotFindWindow();
            cF.setVisible(true);
            
            }
    }//GEN-LAST:event_employeeNameButtonActionPerformed
    }
    private void SeeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeAllButtonActionPerformed
                DefaultListModel listModel = new DefaultListModel();
                
                Iterator it = tutors.iterator();
                
                while(it.hasNext())
                {
                 Tutors temp = (Tutors)it.next();
                 System.out.println(temp.getName());
                 listModel.addElement(temp.getName());
                }
                ShowAllPane.setModel(listModel);
       
    }//GEN-LAST:event_SeeAllButtonActionPerformed

    private void IDSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDSearchButtonActionPerformed

    private void EmployeeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeAddButtonActionPerformed
        // TODO add your handling code here:
        AddAnEmployeeFrame aaF = new AddAnEmployeeFrame();
        aaF.setVisible(true);
    }//GEN-LAST:event_EmployeeAddButtonActionPerformed

    private void ShowAllPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAllPaneMouseClicked
        // TODO add your handling code here:
        SearchNameAlgo search = new SearchNameAlgo();
       // readf();
        System.out.println("Mouse Was Clicked Here!");
         DefaultListModel temp = new DefaultListModel();
         temp.add(0, ShowAllPane.getSelectedValuesList());
         
         String str = temp.elementAt(0).toString();
         String allData = search.searchNameTutors(str, tutors);
         System.out.println(str);
       
         Pattern pat = Pattern.compile("[,]"); 
         String strs[] = pat.split(allData);
         NameLabel.setText("Name: " + strs[0]);
         PayRate.setText("PayRate: $" +  strs[2]);
         IDL.setText("ID: " + strs[1]);
         
         NameLabel.setVisible(true);
         PayRate.setVisible(true);
         IDL.setVisible(true);
    }//GEN-LAST:event_ShowAllPaneMouseClicked

    private void SearchEmployeeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchEmployeeIDTextFieldActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BioLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EmployeeAddButton;
    private javax.swing.JLabel IDL;
    private javax.swing.JButton IDSearchButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PayRate;
    private javax.swing.JTextField SearchEmployeeIDTextField;
    private javax.swing.JTextField SearchEmployeeTextField;
    private javax.swing.JButton SeeAllButton;
    private javax.swing.JList ShowAllPane;
    private javax.swing.JButton employeeNameButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables


}
