class Scorecard {

    private boolean[] results;
    private int answerCount;

    // Constructor
    public Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        answerCount = 0;
    }

    // Record the next answer
    public void recordAnswer(boolean isCorrect) {

        if (answerCount < results.length) {
            results[answerCount] = isCorrect;
            answerCount++;
        } else {
            System.out.println("All questions have been answered.");
        }
    }

    // Return the total score
    public int getScore() {

        int score = 0;

        for (int i = 0; i < answerCount; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class WEEK7Q2 {

    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Final Score: " + sc.getScore());
    }
}