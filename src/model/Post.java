/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

public class Post extends DataModel implements Serializable {
    private ImageIcon picture;
    private List<Comment> comments;
    private boolean visibility;

    public Post(User user, String text, Date datePosted, ImageIcon picture) {
        this.user = user;
        this.text = text;
        this.datePosted = datePosted;
        this.picture = picture;
        comments = new ArrayList();
        visibility = true;
    }
    
    public Post(User user, String text, Date datePosted) {
        this.user = user;
        this.text = text;
        this.datePosted = datePosted;
        this.picture = null;
        comments = new ArrayList();
        visibility = true;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
    
    public void removeComment(Comment comment){
        this.comments.remove(comment);
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon Picture) {
        this.picture = Picture;
    }

    public boolean isPublic() {
        return visibility;
    }
    
    public void setPrivacy(boolean visibility){
        this.visibility = visibility;
    }
}
