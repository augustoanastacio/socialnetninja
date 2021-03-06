/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.App;
import javax.swing.JPanel;
import model.User;
import view.About.AboutEdit;
import view.About.AboutView;
import view.Feed.FeedView;
import view.SearchSolicitationBlock.PanelInfo;

/**
 *
 * @author Usuario
 */
public class UserView extends javax.swing.JPanel {
    
    private User user;
    private JPanel viewPanel;
    /**
     * Creates new form ProfileView
     */
    public UserView(User user) {
        initComponents();
        
        this.user = user;
        this.userNameLabel.setText(this.user.getName());
        
        if(App.getNetwork().getCurrentUser().getFriends().contains(user)){
            showFriendRequestsButton.setText("Desfazer Amizade");
        }
        
        showFeed();
    }
    
    public void showAboutView(){
        viewPanel = new AboutView(this.user);
        userViewPanel.setViewportView(viewPanel);
    }
    
    public void showFeed(){
        viewPanel = new FeedView(this.user);
        userViewPanel.setViewportView(viewPanel);
    }
    
    public void showFriends(){
        viewPanel = new PanelInfo(this.user.getFriends(), 0);
        userViewPanel.setViewportView(viewPanel);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilePictureLabel = new javax.swing.JLabel();
        showFriendsButton = new javax.swing.JButton();
        showGalleryButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        showGroupsButton = new javax.swing.JButton();
        blockButton = new javax.swing.JButton();
        showAboutButton = new javax.swing.JButton();
        showFriendRequestsButton = new javax.swing.JButton();
        userViewPanel = new javax.swing.JScrollPane();
        showFeedButton = new javax.swing.JButton();

        profilePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casinha.png"))); // NOI18N
        profilePictureLabel.setText("Foto do usuario");

        showFriendsButton.setText("Ver Amigos");
        showFriendsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFriendsButtonActionPerformed(evt);
            }
        });

        showGalleryButton.setText("Ver Fotos");
        showGalleryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGalleryButtonActionPerformed(evt);
            }
        });

        userNameLabel.setText("Nome do usuário");

        showGroupsButton.setText("Ver Grupos");
        showGroupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupsButtonActionPerformed(evt);
            }
        });

        blockButton.setText("Bloquear");
        blockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockButtonActionPerformed(evt);
            }
        });

        showAboutButton.setText("Sobre");
        showAboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAboutButtonActionPerformed(evt);
            }
        });

        showFriendRequestsButton.setText("Solicitar Amizade");
        showFriendRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFriendRequestsButtonActionPerformed(evt);
            }
        });

        showFeedButton.setText("Mural");
        showFeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFeedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(userViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showFriendRequestsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(showGroupsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showGalleryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showAboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profilePictureLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showFriendsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showFeedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(profilePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showAboutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showFeedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showFriendsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showGalleryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showGroupsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showFriendRequestsButton)
                .addGap(29, 29, 29)
                .addComponent(blockButton)
                .addContainerGap())
            .addComponent(userViewPanel)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void blockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockButtonActionPerformed
        App.getNetwork().getCurrentUser().addToBlacklist(this.user);
        App.showFeed();
    }//GEN-LAST:event_blockButtonActionPerformed

    private void showAboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAboutButtonActionPerformed
        showAboutView();
    }//GEN-LAST:event_showAboutButtonActionPerformed

    private void showFeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFeedButtonActionPerformed
        showFeed();
    }//GEN-LAST:event_showFeedButtonActionPerformed

    private void showFriendsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFriendsButtonActionPerformed
        showFriends();
    }//GEN-LAST:event_showFriendsButtonActionPerformed

    private void showGalleryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGalleryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showGalleryButtonActionPerformed

    private void showGroupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showGroupsButtonActionPerformed

    private void showFriendRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFriendRequestsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showFriendRequestsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blockButton;
    private javax.swing.JLabel profilePictureLabel;
    private javax.swing.JButton showAboutButton;
    private javax.swing.JButton showFeedButton;
    private javax.swing.JButton showFriendRequestsButton;
    private javax.swing.JButton showFriendsButton;
    private javax.swing.JButton showGalleryButton;
    private javax.swing.JButton showGroupsButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JScrollPane userViewPanel;
    // End of variables declaration//GEN-END:variables
}
