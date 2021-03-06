/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.About;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.Group;
import model.User;

/**
 *
 * @author augus
 */
public class AboutView extends javax.swing.JPanel {

    /**
     * Creates new form AboutView
     */
    private User user;
    private Group group;
    
    public AboutView(User user) {
        initComponents();
        lblname.setText(user.getName());
        lblAddress.setText(user.getAddress());
        lblDob.setText(user.getDobString());
        lblPhone.setText(user.getPhone());
        txtAreaBio.setText(user.getBio());
        ImageIcon image = user.getProfilePicture();
        if(image != null)
         lblfoto.setIcon(new ImageIcon(image.getImage().getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_SMOOTH)));

      
    }

    public AboutView(Group group) {
        initComponents();
        //esperando metodos do grupo;
        lblname.setText(group.getName());
        lblDob.setText(group.getDateCreatedString());
        txtAreaBio.setText(group.getBio());
        ImageIcon image = group.getProfilePicture();
        if(image != null)
            lblfoto.setIcon(new ImageIcon(image.getImage().getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_SMOOTH)));
        lbladdresslbl.setVisible(false);
        lbldatalbl.setText("Data de Criação:");
        lblfonelbl.setVisible(false);
        lblBiolbl.setText("Descrição:");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbldatalbl = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lbladdresslbl = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblfonelbl = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblBiolbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaBio = new javax.swing.JTextArea();
        lblfoto = new javax.swing.JLabel();

        jLabel1.setText("Nome:");

        lbldatalbl.setText("Data de Nascimento:");

        lbladdresslbl.setText("Endereço:");

        lblfonelbl.setText("Telefone:");

        lblBiolbl.setText("Biografia:");

        txtAreaBio.setEditable(false);
        txtAreaBio.setColumns(20);
        txtAreaBio.setLineWrap(true);
        txtAreaBio.setRows(5);
        jScrollPane2.setViewportView(txtAreaBio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBiolbl)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldatalbl)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfonelbl)
                            .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbladdresslbl)
                            .addComponent(jLabel1)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldatalbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbladdresslbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblfonelbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBiolbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBiolbl;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lbladdresslbl;
    private javax.swing.JLabel lbldatalbl;
    private javax.swing.JLabel lblfonelbl;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextArea txtAreaBio;
    // End of variables declaration//GEN-END:variables
}
