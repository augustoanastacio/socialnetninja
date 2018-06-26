package model;

import java.io.Serializable;
import java.util.Date;


public class Answer extends DataModel implements Serializable{
    public Answer(String userName, String text, Date datePosted){
        this.userName = userName;
        this.text = text;
        this.datePosted = datePosted;        
    }
}
