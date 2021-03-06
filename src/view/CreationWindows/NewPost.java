/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.CreationWindows;

import control.App;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import model.Post;
import java.awt.Image;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import model.User;
import view.Photos.PhotosView;

/**
 *
 * @author Usuario
 */
public class NewPost extends javax.swing.JFrame {

    private ImageIcon image;
    private User user;
            
    public NewPost() {
        initComponents();
        
        this.user = App.getNetwork().getCurrentUser();
//        GridBagLayout layout = new GridBagLayout();
//        panelP.setLayout(layout);
        
    }
    
    public NewPost(User user) {
        initComponents();
        this.user = user;
        
//        GridBagLayout layout = new GridBagLayout();
//        panelP.setLayout(layout);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPhotoButton = new javax.swing.JButton();
        publishButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        addPhotoButton.setText("Adicionar Fotos");
        addPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoButtonActionPerformed(evt);
            }
        });

        publishButton.setText("Publicar");
        publishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Fotos adicionadas:");

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(addPhotoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(publishButton)))
                        .addGap(4, 4, 4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addPhotoButton)
                    .addComponent(publishButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void publishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishButtonActionPerformed
        Date datePosted = new Date();
        
        Post p1 = new Post(App.getNetwork().getCurrentUser(), this.text.getText(), datePosted, this.image); 
        this.user.addPost(p1);
        
        if(user == App.getNetwork().getCurrentUser()){
            App.showFeed();
        }else{
            App.showProfile(this.user);
        }
        
        this.dispose();
        
    }//GEN-LAST:event_publishButtonActionPerformed

    private void addPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoButtonActionPerformed
        JFileChooser photo = new JFileChooser();
        photo.setDialogTitle("Selecione uma foto");
        photo.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opc = photo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION){
        image = new ImageIcon(photo.getSelectedFile().getPath());
        lblfoto.setIcon(new ImageIcon(image.getImage().getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT)));
        
    } 	   

//            GridBagConstraints c = new GridBagConstraints();
//            photoView = new PhotosView(image);
//            c.insets = new Insets(0, 0, 10, 0);
//            c.gridx = 0;
//            c.gridy = 0;
//            panelP.add(photoView, c);
//            panelP.setVisible(false);
//            panelP.setVisible(true);
        

    }//GEN-LAST:event_addPhotoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhotoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JButton publishButton;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
