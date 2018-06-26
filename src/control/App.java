/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.SocialNetwork;
import model.User;
import view.Login.Login;
import view.Login.NewUser;
import view.Login.ForgotenPassword;
import view.MainView;
import view.About.AboutEdit;
import view.CreationWindows.NewCommentary;
import view.CreationWindows.NewPost;



/**
 *
 * @author italo
 */
public class App implements Serializable{
    private static JFrame mainWindow;
    private static MainView mainView;
    private static JFrame secondaryWindow;
    private static SocialNetwork network;
    
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try{
            File file = new File("bd.ser");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            network = (SocialNetwork) ois.readObject();
            
        }
        catch(FileNotFoundException e){
            network = new SocialNetwork();
        }
        
        catch(IOException | ClassNotFoundException e){
           network = new SocialNetwork();
        }
           
        showLoginView();
    }
    public static void showLoginView(){
        mainWindow = new Login();
        mainWindow.setVisible(true);
    }
    
    public static void showNewUserView(){
        secondaryWindow = new NewUser();
        secondaryWindow.setVisible(true);
    }

    public static void showForgotenPasswordView(){
        secondaryWindow = new ForgotenPassword();
        secondaryWindow.setVisible(true);
    }
    
    public static void showMainView(){
        mainWindow = new MainView();
        mainView = (MainView) mainWindow;
        mainWindow.setVisible(true);
    }
    
    public static void showAboutEdit(){
        secondaryWindow = new AboutEdit();
        secondaryWindow.setVisible(true);
    }
    public static void showNewCommentary(){
        secondaryWindow = new NewCommentary();
        secondaryWindow.setVisible(true);
    }
    public static void showNewPost(){
        secondaryWindow = new NewPost();
        secondaryWindow.setVisible(true);
    }
    
    public static void showNewPost(User user){
        secondaryWindow = new NewPost(user);
        secondaryWindow.setVisible(true);
    }    
    
    // getters and setters
    public static SocialNetwork getNetwork() {
        return network;
    }

    public static void setNetwork(SocialNetwork network) {
        App.network = network;
    }

    public static JFrame getMainWindow() {
        return mainWindow;
    }

    public static void setMainWindow(JFrame mainWindow) {
        App.mainWindow = mainWindow;
    }

    public static JFrame getSecondaryWindow() {
        return secondaryWindow;
    }

    public static void setSecondaryWindow(JFrame secondaryWindow) {
        App.secondaryWindow = secondaryWindow;
    }
    
    public static void showProfile(User user){
        mainView.showProfile(user);
    }
    
    public static void showFeed(){
        mainView.showFeed();
    }
    
    public static void showBlocked(){
        mainView.showBlocked(network.getCurrentUser().getBlacklist());
    }
    
    public static void showFriends(){
        mainView.showFriends(network.getCurrentUser().getFriends());
    }
    
    public static void showFriendRequests(){
        mainView.showFriendsRequests(network.getCurrentUser().getFriendRequests());
    }
    
    public static void showSearch(){
        mainView.showSearch(mainView.getSearchText());
    }
    
    public static void saveNetwork(){
        try {
        File file = new File("bd.ser");
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(App.network);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"arquivo não encontrado: " + e);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"erro no salvamento do arquivo: " + e);
        }   
    }
}
