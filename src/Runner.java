import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        //The logic Questions
        String q1 = "Where Is China?\n" + "(a)Asia\n(b)Europe\n(c)South America\n ";
        //The Albinson Questions
        String q2 = "How Do You Make Mr.Albinson Happy?\n"
                + "(a)Buy Him Gifts\n(b)Be On Time To Class\n(c)Complement Him On The Way He Dresses\n";

        String q3 = "How Do You Get Mr.Albinson To Stop Calling Manny, Mario?\n"
                + "(a)Remind Him\n(b)Make MArio And Manny Where Name Tags\n(c)Just deal With it\n";

        //The Math Questions

        String q4 = "What Is The Square Root Of 256?\n"
                + "(a)12\n(b)16\n(c)18\n";

        //The science questions
        String q5 = "What Is 8456 Inches Converted into Centimeters?\n"
                + "(a)21478.24\n(b)21480.78\n(c)21485.86\n";

        String q6 = "What Is A Mole In Chemistry Terms\n"
                + "(a) 6.022 x 1023\n(b) 6.023 x 1024\n(c) 6.034 x 1011\n";
        //The Art questions
        String q7 = "What Is One Of The Primary Colors\n"
                + "(a)Blue\n(b)Grey\n(c)Pink\n";

        String q8 = "What Is My Favorite Color\n"
                + "(a)Blue\n(b)Purple\n(c)Black,Please Dont Pick This, That's Sad Lol";

        Question[] questions = {
                new Question(q1 , "a"),
                new Question(q2 , "c"),
                new Question(q3 , "c"),
                new Question(q4 , "b"),
                new Question(q5 , "a"),
                new Question(q6 , "a"),
                new Question(q7 , "a"),
                new Question(q8 , "b"),
         };
         takeIt(questions);
    }
        public static void takeIt( Question [] questions) {
            int score = 0;

            Scanner keyboardInput = new Scanner(System.in);

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i].prompt);
                String answer = keyboardInput.nextLine();
                if(answer.equals(questions[i].answer)) ;
                score++;
            }
            System.out.println("You Were Able To Get a " + score + "/" + questions.length);

            System.out.println("If You Got Some Wrong, The Correct Answers are: 1a , 2c, 3c , 4b , 5a , 6a , 7a , 8b");
        }
}
