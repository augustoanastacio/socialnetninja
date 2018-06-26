/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Feed;

import control.App;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Date;
import model.Comment;
import model.Post;
import model.User;

/**
 *
 * @author Usuario
 */
public class WriteCommentary extends javax.swing.JPanel {

   private Commentary commentary;
   private Comment comment;
   private User user;
   private Post post;
    
    public WriteCommentary(Post post) {
        initComponents();
        this.user = App.getNetwork().getCurrentUser();
        this.post = post;
        textArea.setLineWrap(true);
        
        GridBagLayout layout = new GridBagLayout();
        commentaryPanel.setLayout(layout);

        int i = 0;
        for(Comment comment: post.getComments()){
            GridBagConstraints c = new GridBagConstraints();
            commentary = new Commentary(App.getNetwork().getCurrentUser(), comment);
            commentaryPanel.add(commentary, c);
            c.insets = new Insets(0, 0, 10, 10);
            c.gridx = 0;
            c.gridy = i;
            commentaryPanel.add(commentary, c);
            i++;     
        }
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
        commentBotton = new javax.swing.JButton();
        commentaryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(102, 255, 51));

        commentBotton.setText("Comentar");
        commentBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentBottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout commentaryPanelLayout = new javax.swing.GroupLayout(commentaryPanel);
        commentaryPanel.setLayout(commentaryPanelLayout);
        commentaryPanelLayout.setHorizontalGroup(
            commentaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        commentaryPanelLayout.setVerticalGroup(
            commentaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(commentaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(commentBotton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(commentaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(commentBotton)
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void commentBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentBottonActionPerformed
        comment = new Comment(this.user, textArea.getText(), new Date());
        post.addComment(comment);
        if(this.user == App.getNetwork().getCurrentUser()){
            App.showFeed();
        }else{
            App.showProfile(user);
        }
    }//GEN-LAST:event_commentBottonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton commentBotton;
    private javax.swing.JPanel commentaryPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
