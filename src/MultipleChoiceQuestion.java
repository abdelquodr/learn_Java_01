import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {

    static int nQuestions = 5;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";
        correctAnswer = answer.toUpperCase();
    }

    public String ask() {
        String answer = JOptionPane.showInputDialog(null, question);
        return answer.toUpperCase();
    }

    public void check() {
        String answer = ask();
        String message;
        if (answer.equals(correctAnswer)) {
            message = "Correct!";
            nCorrect++;
        } else {
            message = "Incorrect. The correct answer is " + correctAnswer + ".";
        }
        JOptionPane.showMessageDialog(null, message);
    }


    public static void showResults() {
        String message = "You got " + nCorrect + " out of " + nQuestions + " correct.";
        JOptionPane.showMessageDialog(null, message);
    }

}
