import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultipleChoiceQuestion extends Question {

    private List<String> answerChoices;
    private Set<Integer> correctAnswers;

    public MultipleChoiceQuestion(int points, String question) {
        super(points, question);
        this.answerChoices = new ArrayList<>(0);
        correctAnswers = new HashSet<>();
    }

    public void addWrongAnswerChoice(String answer) {
        answerChoices.add(answer);
    }

    public void addCorrectAnswerChoice(String answer) {
        answerChoices.add(answer);
        correctAnswers.add(answerChoices.indexOf((answer)));
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
        for (Integer index: correctAnswers) {
            if (answerChoices.get(index).equals(answer)) {
                return true;
            }
        }
        return false;
    }
}
