/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.App;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.Group;
import model.User;
import view.Feed.FeedView;
import view.Gallery.GaleryView;
import view.SearchSolicitationBlock.NotFound;
import view.SearchSolicitationBlock.PanelInfo;
import view.SearchSolicitationBlock.Search;
/**
 *
 * @author augus
 */
public class MainView extends javax.swing.JFrame {
    private JPanel viewPanel;
    
    public MainView() {
        initComponents();
        ImageIcon profilePicture;
        User user = App.getNetwork().getCurrentUser();
        profilePicture = user.getProfilePicture();
        if(profilePicture != null){
            this.lblprofilePicture.setIcon(new ImageIcon(profilePicture.getImage().getScaledInstance(lblprofilePicture.getWidth(), lblprofilePicture.getHeight(), Image.SCALE_SMOOTH)));
        }
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                App.saveNetwork();
                System.exit(0);
            }
        });
        
        this.showFeed();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblprofilePicture = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        friends = new javax.swing.JButton();
        groups = new javax.swing.JButton();
        solicitations = new javax.swing.JButton();
        home = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        blocked = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        photos = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        mainPane = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        userName.setText("Nome do Usuário");

        friends.setText("Amigos");
        friends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendsActionPerformed(evt);
            }
        });

        groups.setText("Grupos");
        groups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsActionPerformed(evt);
            }
        });

        solicitations.setText("Solicitações");
        solicitations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitationsActionPerformed(evt);
            }
        });

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        logout.setText("Desconectar");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        blocked.setText("Bloqueados");
        blocked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockedActionPerformed(evt);
            }
        });

        Profile.setText("Sobre");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        photos.setText("Galeria de fotos");
        photos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(blocked, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(solicitations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(friends, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(groups, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(photos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(lblprofilePicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblprofilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groups)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solicitations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blocked)
                .addGap(57, 57, 57)
                .addComponent(logout)
                .addGap(20, 20, 20))
        );

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        mainPane.setBackground(new java.awt.Color(51, 0, 204));
        mainPane.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search))
                        .addGap(10, 10, 10)
                        .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void friendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendsActionPerformed
        if(App.getNetwork().getCurrentUser().getFriends().size()==0){
            showNotFound("amigos");
        } 
        else
        showFriends(App.getNetwork().getCurrentUser().getFriends());
    }//GEN-LAST:event_friendsActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.showFeed();
    }//GEN-LAST:event_homeActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        App.showAboutEdit();
    }//GEN-LAST:event_ProfileActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        App.showLoginView();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void photosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photosActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
         showSearch(searchText.getText());
         
    }//GEN-LAST:event_searchActionPerformed

    private void groupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupsActionPerformed
        if(App.getNetwork().getCurrentUser().getGroups().size()==0){
            showNotFound("grupos");
        }
        else
            showGroups(App.getNetwork().getCurrentUser().getGroups());
    }//GEN-LAST:event_groupsActionPerformed

    private void solicitationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitationsActionPerformed
       if(App.getNetwork().getCurrentUser().getFriendRequests().size()==0){
            showNotFound("solicitações");
        }
        else
            showFriendsRequests(App.getNetwork().getCurrentUser().getFriendRequests());
    }//GEN-LAST:event_solicitationsActionPerformed

    private void blockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockedActionPerformed
        if(App.getNetwork().getCurrentUser().getBlacklist().size()==0){
            showNotFound("usuários bloqueados");
        }
        else
            showBlocked(App.getNetwork().getCurrentUser().getBlacklist());
    }//GEN-LAST:event_blockedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        }); 
    }
    
    public void showFeed(){
        viewPanel = new FeedView();
        mainPane.setViewportView(viewPanel);
    }
    
    public void showGalery(){
        viewPanel = new GaleryView();
        mainPane.setViewportView(viewPanel);
    }
    
    public void showSearch(String str){
        viewPanel = new Search(str);
        mainPane.setViewportView(viewPanel);
    }
    
    public void showProfile(User user){
        viewPanel = new UserView(user);
        mainPane.setViewportView(viewPanel);
    }
     public void showFriends(List array){
        viewPanel = new PanelInfo(array, 0);
        mainPane.setViewportView(viewPanel);
    }
    
    public void showGroups(List array){
        viewPanel = new PanelInfo(array, 3);
        mainPane.setViewportView(viewPanel);
    }
    public void showFriendsRequests(List array){
        viewPanel = new PanelInfo(array, 1);
        mainPane.setViewportView(viewPanel);
    }
    public void showBlocked(List array){
        viewPanel = new PanelInfo(array, 2);
        mainPane.setViewportView(viewPanel);
    }
    public void showNotFound(String str){
        viewPanel = new NotFound(str);
        mainPane.setViewportView(viewPanel);
    }
    
    public String getSearchText(){
        return searchText.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Profile;
    private javax.swing.JButton blocked;
    private javax.swing.JButton friends;
    private javax.swing.JButton groups;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblprofilePicture;
    private javax.swing.JButton logout;
    private javax.swing.JScrollPane mainPane;
    private javax.swing.JButton photos;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton solicitations;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
