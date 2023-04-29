public abstract class Question {
    protected int points;
    protected String question;

    protected Question(int points, String question) {
        this.points = points;
        this.question = question;
    }

    public int getPoints() {
        return points;
    }

    public String getQuestion() {
        return question;
    }

    public abstract boolean checkAnswer(String answer);
}
