import java.util.Scanner;
import java.io.File;
/*
The scanner parses primitive data from an input source. Might be a text file, string, or and InputStream.
 */
public class LabTwo {

    public static void main(String[] args) {
        //In order to use a scanner. we must construct it.
        Scanner scan = new Scanner (System.in);

        System.out.println("SURVEY TIME");

        System.out.println("how many jobs have you had up to this point?");
        int jobAnswer = scan.nextInt();

        scan.nextLine();
        System.out.println("\n Why did the chicken cross the road?");
        String whyThough = scan.nextLine();

        System.out.println("\nTrue or false: Russet Potatoes are better than sweet potatoes");
        boolean potatoAnswer = scan.nextBoolean();

        System.out.println("\nSURVEY SUMMARY");

        System.out.println("\nYou have had "+jobAnswer+" jobs.");
        System.out.println("\nThe chicken crossed the road because \""+whyThough+"\"");
        System.out.println("\n Do you think russet potatoes are better than sweet potatoes? "+potatoAnswer);
        System.out.println("End of Survey");

        /*
        Taking two user integer inputs. Taking both numbers and generating a random whole number in between the two integers.
        Afterwards, the user will guess the random number in between the two integers and if incorrect the program will tell the user how far off their guess was.
         */
        System.out.println("Give me an integer.");
        int minMax1 = scan.nextInt();
        System.out.println("Give me another integer.");
        int minMax2 = scan.nextInt();

        double randomNumber = 0;

        if (minMax1 > minMax2){
            randomNumber = Math.round((Math.random()*((minMax1-minMax2)+1))+minMax2);
            System.out.println("So we now have a random number between "+minMax2+" and "+minMax1+". Guess what the number is");
        }

        if (minMax2 > minMax1) {
            randomNumber = Math.round((Math.random()*((minMax2-minMax1)+1))+minMax1);
            System.out.println("So we now have a random number between "+minMax1+" and "+minMax2+". Guess what the number is");

        }
        double userGuess = scan.nextDouble();

        if ( userGuess == randomNumber){
            System.out.println("Wow you guess the correct number!!!!");
        } else if ( userGuess > randomNumber) {
            double difference = userGuess - randomNumber;
            System.out.println("Oof, your guess was over by "+difference+".");
        } else if ( randomNumber > userGuess) {
            double difference = randomNumber - userGuess;
            System.out.println("Oof, your guess was short by "+difference+".");
        }


        System.out.println(randomNumber);





    }


}
