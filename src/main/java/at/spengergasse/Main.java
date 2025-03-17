package at.spengergasse;

import at.spengergasse.entities.Question;


public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        QuizPersistence qp = new QuizPersistence();
       /* while (q.nextQuestion()) {
            try {
                run = q.showQuestionsAndAnswers();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}
