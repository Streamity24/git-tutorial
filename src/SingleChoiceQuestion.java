import java.util.ArrayList;
import java.util.List;

public class SingleChoiceQuestion extends Question {

    private List<String> answerChoices;
    private int correctAnswer;

    public SingleChoiceQuestion(int points, String question) {
        super(points, question);
        correctAnswer = -1;
        answerChoices = new ArrayList<>(0);
    }

    public void addWrongAnswerChoice(String answer) {
        answerChoices.add(answer);
    }

    public void setCorrectAnswerChoice(String answer) {
        answerChoices.add(answer);
        correctAnswer = answerChoices.indexOf(answer);
    }

    @Override
    public String getQuestion() {
        StringBuilder sb = new StringBuilder();
        sb.append(question);
        for (String answer: answerChoices) {
            sb.append(System.lineSeparator()).append(answer);
        }
        return sb.toString();
    }
    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(answerChoices.get(correctAnswer));
    }
}
