import java.util.ArrayList;
import java.util.List;

public class Quiz implements Gradable {

    private List<Question> questions = new ArrayList<>();

    @Override
    public int getTotalPoints() {
        int result = 0;
        for (Question question: questions) {
            result += question.getPoints();
        }
        return result;
    }

    @Override
    public double getGrade(List<String> answers) {
        double grade = 0.0;
        int questionCount = questions.size();
        for (int i = 0; i < answers.size() ; i++) {
            if(i > questionCount - 1){
                return grade;
            } else if (questions.get(i).checkAnswer(answers.get(i))){
                grade += questions.get(i).getPoints() * 0.1;
            }
        }
        return grade;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public int getNumberOfQuestions(){
        return questions.size();
    }
}
