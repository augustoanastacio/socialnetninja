package model;

import java.io.Serializable;
import java.util.Date;

public abstract class DataModel implements Serializable{
    protected User user;
    protected String text;
    protected Date datePosted;
    
    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }
}
