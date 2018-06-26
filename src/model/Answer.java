package model;

import java.io.Serializable;
import java.util.Date;


public class Answer extends DataModel implements Serializable{
    public Answer(User user, String text, Date datePosted){
        this.user = user;
        this.text = text;
        this.datePosted = datePosted;        
    }
}
