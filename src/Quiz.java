import java.awt.Component;
import javax.swing.JOptionPane;

public class Quiz {

    static int numQuestions = 0;
    static int numCorrect = 0;

    public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "What country has the highest life expectancy?",
                "Paris", "London", "Hong Kong", "Madrid", "Rome", "C"
        );

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "Which planet has the most moons?",
                "Saturn", "earth", "Jupiter", "Mars", "Mercury", "A"
        );

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
                "How many bones do we have in an ear",
                "2", "none", "7", "3", "5", "D"
        );

        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
                "What city is known as \"The Eternal City\"?",
                "Rome", "Lagos", "Medina", "Johannesburg", "Paris", "A"
        );

        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
                "How many dots appear on a pair of dice?",
                "40", "50", "24", "36", "42", "E"
        );


        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();

        MultipleChoiceQuestion.showResults();
    }

}