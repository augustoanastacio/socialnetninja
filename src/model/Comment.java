
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment  extends DataModel implements Serializable{
    private List<Answer> answers;

    public Comment(User user, String text, Date datePosted) {
        this.user = user;
        this.text = text;
        this.datePosted = datePosted;
        answers = new ArrayList();
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    public void addAnswers(Answer answer) {
        this.answers.add(answer);
    }
    
    public void removeAnswers(Answer answer){
        this.answers.remove(answer);
}
