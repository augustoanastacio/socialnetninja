
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Comment  extends DataModel implements Serializable{
	private ArrayList<Answer> answers;
        
	public Comment(String userName, String text, Date datePosted) {
		this.userName = userName;
		this.text = text;
		this.datePosted = datePosted;
	}
}
