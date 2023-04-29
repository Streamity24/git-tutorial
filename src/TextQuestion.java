public class TextQuestion extends Question{

    private String correctAnswer;

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(correctAnswer);
    }

    public TextQuestion(int points,String question, String answer) {
        super(points, question);
        this.correctAnswer = answer;
    }
}
