import java.awt.Toolkit;
import java.io.BufferedReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elify
 */
//https://stackoverflow.com/questions/36440723/reading-text-file-into-arraylist/36440783
public class GeneralStatistics extends javax.swing.JFrame{

    /**
     * Creates new form GeneralStatistics
     */
    private JLabel aequality, afelicity, afreedom, alabour,amodern,anational,ademoc,anature,apeople,arepublic,aworker,aleft;    
    private PartySelection b = new PartySelection();

      ArrayList Equality = b.getEquality();
      ArrayList Felicity = b.getFelicity();
      ArrayList Freedom = b.getFreedom();
      ArrayList Labour = b.getLabour();
      ArrayList ModernLiberation = b.getModernLiberation();
      ArrayList NationalPeople = b.getNationalPeople();
      ArrayList NewDemocratic = b.getNewDemocratic();
      ArrayList NewNature = b.getNewNature();
      ArrayList PeopleAction = b.getPeopleAction();
      ArrayList Republican = b.getRepublicanPeople();
      ArrayList Worker = b.getUnitedWorkers();
      ArrayList Left = b.getUniversalLeft();
      ArrayList list = b.getlist();
            int eq=0;
            int fe=0;
            int fre =0;
            int lab=0;
            int mod=0;
            int nat=0;
            int dem=0;
            int natu=0;
            int rep=0;
            int prev=0;
            int work=0;
            int left=0;
 
private void readFile(ArrayList candidates, String txt) throws FileNotFoundException {
        List candidateList = new ArrayList(1000);
        Scanner fileInput = new Scanner(new File(txt));
        while (fileInput.hasNextLine()) {
            candidateList.add(fileInput.nextLine());
        }
        candidates.addAll(candidateList);
     setTitle("General Statistics");

    }  
            
   
    public GeneralStatistics(){
        
               initComponents();
               setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("flagicon.png")));
        try {
            readFile(list,"numofvote.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneralStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
               System.out.println(list);
               
               for(int i= 0; i<list.size();i++){
               if(list.get(i).equals("eqvote")){
                   eq++;
               }
               if(list.get(i).equals("felvote")){
                   fe++;
               }if(list.get(i).equals("frevote")){
                   fre++;
               }if(list.get(i).equals("labvote")){
                   lab++;
               }if(list.get(i).equals("modvote")){
                   mod++;
               }if(list.get(i).equals("natvote")){
                   nat++;
               }if(list.get(i).equals("demvote")){
                   dem++;
               }if(list.get(i).equals("naturevote")){
                   natu++;
               }if(list.get(i).equals("repvote")){
                   rep++;
               }if(list.get(i).equals("pevote")){
                   prev++;
               }if(list.get(i).equals("workvote")){
                   work++;
               }if(list.get(i).equals("leftvote")){
                   left++;
               }
                   }
               int user=list.size();
               jLabel1.setText("Equality Party: %"+Float.toString((float)(eq*100)/user));
            jLabel2.setText("Felicity Party:%"+Float.toString((float)(fe*100)/user));
            jLabel3.setText("Freedom Party:%"+Float.toString((float)(fre*100)/user));
           jLabel4.setText("Labour Party:%"+Float.toString((float)(lab*100)/user));
            jLabel5.setText("Modern Liberation Party:%"+Float.toString((float)(mod*100)/user));
            jLabel6.setText("National Party:%"+Float.toString((float)(nat*100)/user));
            jLabel7.setText("New Democratic Party:%"+Float.toString((float)(dem*100)/user));
            jLabel8.setText("New Nature Party:%"+Float.toString((float)(natu*100)/user));
            jLabel9.setText("People Action Party:%"+Float.toString((float)(rep*100)/user));
            jLabel10.setText("Republican People Party:%"+Float.toString((float)(prev*100)/user));
            jLabel11.setText("United Workers Party:%"+Float.toString((float)(work*100)/user));
            jLabel12.setText("United Left Party:%"+Float.toString((float)(left*100)/user));

        setSize(900,800);  
        setLayout(null);  
        setVisible(true);  
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton11 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        backmain = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        continuebutton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();

        jRadioButton11.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("jLabel1");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("jLabel1");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("jLabel1");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("jLabel1");

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("jLabel1");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("jLabel1");

        backmain.setBackground(new java.awt.Color(0, 153, 255));
        backmain.setText("Back");
        backmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backmainActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("If you want to see more detailed select one of them:");

        continuebutton.setBackground(new java.awt.Color(0, 153, 255));
        continuebutton.setText("Continue");
        continuebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuebuttonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("GENERAL STATISTICS");

        combo.setBackground(new java.awt.Color(0, 153, 204));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equality Party", "Felicity Party", "Freedom Party", "Labour Party", "Modern Liberation Party", "National People Party", "New Democratic Party", "New Nature Party", "People Action Party", "Republican People Party", "United Workers Party", "United Left Party", " " }));
        combo.setToolTipText("");
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel13))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(backmain, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(continuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(405, 405, 405)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backmain, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(669, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backmainActionPerformed

       MainWindow newframe = new MainWindow();
        newframe.setVisible(true);
    }//GEN-LAST:event_backmainActionPerformed

    private void continuebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuebuttonActionPerformed
        // TODO add your handling code here:
        
     if (combo.getSelectedItem().toString().equals("Equality Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("Equality",Equality);
        newframe.setVisible(true);
     }
        if (combo.getSelectedItem().toString().equals("Felicity Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("Felicity",Felicity);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("Freedom Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("Freedom",Freedom);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("Labour Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("Labour",Labour);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("Modern Liberation Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("Modern Liberation",ModernLiberation);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("National Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("National",NationalPeople);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("New Democratic Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("New Democratic",NewDemocratic);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("New Nature Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("New Nature",NewNature);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("People Action Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("People Action",PeopleAction);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("Republican People Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("Republican People",Republican);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("United Worker Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("United Worker",Worker);
        newframe.setVisible(true);
     }   if (combo.getSelectedItem().toString().equals("United Left Party")){
         
        CandidateStatistics newframe = new CandidateStatistics("United Left",Left);
        newframe.setVisible(true);
     } 
        
    
    }//GEN-LAST:event_continuebuttonActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

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
            java.util.logging.Logger.getLogger(GeneralStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      Runnable r = () -> {
          JFrame frame = new GeneralStatistics();
        };
        SwingUtilities.invokeLater(r);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backmain;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton continuebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton11;
    // End of variables declaration//GEN-END:variables

  
}
