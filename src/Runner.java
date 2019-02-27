import java.until.Scanner;
public class Runner {
    public static void main(String[] args) {
        String q1 = "Where Is China?" + "(a)Asia\n(b)Europe\nSouth America\n ";

        String q2 = "How Do You Make Mr.Albinson Happy?\n"
                + "(a)Buy Him Gifts\n(b)Be On Time To Class\n(c)Complement Him On The Way He Dresses\n";

        String q3 = "How Do You Get Mr.Albinson To Stop Calling Manny, Mario?\n"
                + "(a)Remind Him\n(b)Make MArio And Manny Where Name Tags\n(c)Just deal With it\n";
        Question[] questions = {
                new Question(q1, "a");
                new Question(q2, "c");
                new Question(q3, "c");


         }
         takeIt(questions);
    }
        public static void takeIt( Question [] questions){
            int score = 0;
            Scanner keyboardInput = new Scanner(system.in);

            for(int i = 0; i < questions.length; i++){
                System.out.println(questions[i].prompt);
                String answer = keyboardInput.nextLine();
                if(answer.equals(questions[i].answer));
                score++;
            }
    }
    System.out.println("You got" + score "/" + questions.length);
}
