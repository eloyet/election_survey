
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elify
 */
public class ModernLiberationFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    PartySelection b = new PartySelection();

      ArrayList ModernLiberation = b.getModernLiberation();
    public ModernLiberationFrame() {
        initComponents();
        b.ModernLiberationCandidates();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("flagicon.png")));

        ui.setBorder(new EmptyBorder(30,30,30,30));
        setContentPane(ui);
        boxes = new JCheckBox[ModernLiberation.size()];

        for (int i = 0; i < ModernLiberation.size(); i++) {
            createrCheckBox(i);
        }
        JButton votebutton=new JButton("VOTE");  
        votebutton.setBounds(50,100,95,30);  
        ui.add(votebutton);  
  votebutton.addActionListener(new ActionListener() {
         
   public void actionPerformed(java.awt.event.ActionEvent e) {
      
   
        try {
           FileWriter file = new FileWriter("ModernLiberationvote.txt",true);
         for(int i = 0 ; i< ModernLiberation.size();i++){
               file.write(boxes[i].getText());
           }
                       int counttik=0;
            for (int i = 0; i <14; i++) {
                
                if(boxes[i].isSelected()){
                file.write(boxes[i].getText()+"\n");
                counttik++;
                }
                }
                if(counttik<14){
                            JOptionPane.showMessageDialog(rootPane,"Voted!");
                              MainWindow newframe = new MainWindow();
                               newframe.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "You can't vote more than 14!");
                      ModernLiberationFrame  newframe = new ModernLiberationFrame();
                     newframe.setVisible(true);
                }
            file.close();
        } 
    catch (IOException evt) {
        evt.printStackTrace();
    }
    
   } });
        setTitle("Modern Liberation Party");
        pack();
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                  try {
          WriteFile();
      } catch (IOException ex) {
          Logger.getLogger(EqualityFrame.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
 
  public void WriteFile() throws IOException{
     
     try{
     FileWriter f = new FileWriter("ModernLiberationcand.txt",true);
     Writer  output = new BufferedWriter(f);
     int sz = ModernLiberation.size();
     for(int i=0 ; i<sz ; i++){
         output.write(ModernLiberation.get(i).toString()+"\n");
         
     }
     output.close();
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"I cannot create that file.");
     }
     
 }
 JPanel ui= new JPanel(new GridLayout(0,2));

    private JCheckBox boxes[];


    public void createrCheckBox(int i) {
        boxes[i] = new JCheckBox((String) ModernLiberation.get(i));
        boxes[i].setBorder(new EmptyBorder(0,28,0,0));
        ui.add(boxes[i]);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(ModernLiberationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModernLiberationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModernLiberationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModernLiberationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          Runnable r = () -> {
            JFrame frame = new ModernLiberationFrame();
        };
        SwingUtilities.invokeLater(r);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
