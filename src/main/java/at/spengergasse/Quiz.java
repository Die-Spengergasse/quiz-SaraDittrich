package at.spengergasse;

import at.spengergasse.entities.Answer;
import at.spengergasse.entities.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private Scanner scanner = new Scanner(System.in);
    int nextQuestion = 0;

    public Quiz() {
        questions = new ArrayList<Question>();
    }

    public boolean showQuestionsandAnswers() {
        if (nextQuestion >= questions.size()) {
            return false;
        }

        Question q = questions.get(nextQuestion++);
        System.out.println(q.getText());
        List<Answer> answers = new ArrayList<Answer>();
        for (int i = 0; i < answers.size(); i++) {
            Answer a = answers.get(i);
            System.out.println((i+1) + " ) " + a.getText());
        }
        System.out.println("your answer: ");
        int userAnswer = Integer.parseInt(scanner.nextLine());
        //checkAnswer(q, userAnswer);
        return true;
    }

    private void finish() {

    }
    /*
    private void checkAnswer(Question q, int userAnswer) {
        //List<Answer> answers = q.getText();
        if (userAnswer > 0 && userAnswer <= answers.size()) {
            if (answers.get(userAnswer - 1).getCorrect()) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        } else {
            System.out.println("Invalid answer.");
        }
    }

     */
}
