/**
 * Created by Lenovo on 25.06.2017.
 */
public class Question {
    private String questionText;
    private boolean isNoCorrect;
    private boolean isYesCorrect;

    public Question(String questionText, boolean isNoCorrect, boolean isYesCorrect) {
        this.questionText = questionText;
        this.isNoCorrect = isNoCorrect;
        this.isYesCorrect = isYesCorrect;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isNoCorrect() {
        return isNoCorrect;
    }

    public void setNoCorrect(boolean noCorrect) {
        isNoCorrect = noCorrect;
    }

    public boolean isYesCorrect() {
        return isYesCorrect;
    }

    public void setYesCorrect(boolean yesCorrect) {
        isYesCorrect = yesCorrect;
    }
}
