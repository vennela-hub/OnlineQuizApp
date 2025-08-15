import java.util.*;

class Question {
    String questionText;
    List<String> options;
    char correctOption; // A, B, C, D

    public Question(String questionText, List<String> options, char correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "how many planets are there in the solar system?",
                Arrays.asList("A. Nine", "B. Eight", "C. Ten", "D. Seven"),
                'B'
        ));
        questions.add(new Question(
                "Which language runs in a web browser?",
                Arrays.asList("A. Java", "B. C++", "C. Python", "D. JavaScript"),
                'D'
        ));
        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                Arrays.asList("A. Earth", "B. Mars", "C. Venus", "D. Jupiter"),
                'B'
        ));

        int score = 0;

        // Loop through questions
        for (Question q : questions) {
            System.out.println("\n" + q.questionText);
            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char answer = Character.toUpperCase(sc.next().charAt(0));

            if (answer == q.correctOption) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctOption);
            }
        }

        // Display final score
        System.out.println("\nYour final score: " + score + "/" + questions.size());
        sc.close();
    }
}