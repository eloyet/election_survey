
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
public class FelicityFrame extends javax.swing.JFrame {

    /**
     * Creates new form FelicityFrame
     */
      PartySelection b = new PartySelection();

      ArrayList Felicity = b.getFelicity();
    public FelicityFrame() {
        initComponents();
        b.FelicityCandidates();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("flagicon.png")));

        ui.setBorder(new EmptyBorder(30,30,30,30));
        setContentPane(ui);
        boxes = new JCheckBox[Felicity.size()];

        for (int i = 0; i < Felicity.size(); i++) {
            createrCheckBox(i);
        }
        JButton votebutton=new JButton("VOTE");  
        votebutton.setBounds(50,100,95,30);  
        ui.add(votebutton);  
  votebutton.addActionListener(new ActionListener() {
         
   public void actionPerformed(java.awt.event.ActionEvent e) {
      
        try {
           FileWriter file = new FileWriter("Felicityvote.txt",true);
         for(int i = 0 ; i< Felicity.size();i++){
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
                      FelicityFrame newframe = new FelicityFrame();
                     newframe.setVisible(true);
                }
            file.close();
        } 
    catch (IOException evt) {
        evt.printStackTrace();
    }
    
   } });
        setTitle("Felicity Party");
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
     FileWriter f = new FileWriter("felicitycand.txt",true);
     Writer  output = new BufferedWriter(f);
     int sz = Felicity.size();
     for(int i=0 ; i<sz ; i++){
         output.write(Felicity.get(i).toString()+"\n");
         
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
        boxes[i] = new JCheckBox((String) Felicity.get(i));
        boxes[i].setBorder(new EmptyBorder(0,28,0,0));
        ui.add(boxes[i]);
    }
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
            java.util.logging.Logger.getLogger(FelicityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FelicityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FelicityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FelicityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

          Runnable r = () -> {
            JFrame frame = new FelicityFrame();
        };
        SwingUtilities.invokeLater(r);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
