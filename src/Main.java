import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

/**
 * Created by Lenovo on 22.06.2017.
 */
public class Main extends JFrame {

    private java.util.List<Question> questionList = new ArrayList<>();
    private JButton buttonYes;
    private JButton buttonNo;
    private JLabel labelQuestion;

    private int activeQuestion;
    private int points;

    public Main() {
        super("Milionerzy");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(3, 1));
        setResizable(false);

        labelQuestion = new JLabel("Kliknij 'tak', aby rozpoczac", SwingConstants.CENTER);
        buttonNo = new JButton("Nie");
        buttonYes = new JButton("Tak");

        labelQuestion.setFont(new Font("Serif", Font.BOLD, 32));


        add(labelQuestion);
        add(buttonNo);
        add(buttonYes);


        buttonNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickNo();
            }
        });

        buttonYes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickYes();
            }
        });

        generateQuestions();

        start();

        setVisible(true);

    }

    private void generateQuestions() {
        questionList.add(new Question("Czy Kanada leży w europie?", true,false));
        questionList.add(new Question("Czy europa to kontynent?", false,true));
    }

    private void start() {
        labelQuestion.setText(questionList.get(activeQuestion).getQuestionText());
        points = 0;
    }

    private void clickNo(){
        if(questionList.get(activeQuestion).isNoCorrect()){
            points++;
        }
        nextQueston();
    }

    private void clickYes() {
        if(questionList.get(activeQuestion).isYesCorrect()){
            points++;
        }
        nextQueston();
    }

    private void nextQueston() {
        activeQuestion ++;
        if(activeQuestion >= questionList.size()){
            end();
            return;
        }
        labelQuestion.setText(questionList.get(activeQuestion).getQuestionText());
    }

    private void end() {
        JOptionPane.showMessageDialog(this, "Koniec gry~! Zdobyłeś/aś: " + points + " puntków");
    }

    public static void main(String[] args) {
        new Main();
    }


}
