import java.util.Scanner;
import java.io.File;
import java.awt.Point;
/*
The scanner parses primitive data from an input source. Might be a text file, string, or and InputStream.
 */
public class LabTwo {

    public static void main(String[] args) throws java.io.FileNotFoundException {
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

        File inputFile = new File("src/input.txt");
        Scanner inputFileScanner = new Scanner(inputFile);
        String nextWord;

        boolean keepLooping = inputFileScanner.hasNext();
        while ( keepLooping ) {
            nextWord = inputFileScanner.next();
            System.out.print(" "+ nextWord);
            keepLooping = inputFileScanner.hasNext();
        }

        /*
        What is an Object?
        Value vs Reference .
        primitive data is passed by value whereas object data is passed by reference. A reference is an address in memory; it encodes a location.
        The Integer class constucts Integer objects which is essentially the object equivalent of the int primitive. The Integer class is one of the wrapper classes

         */

        int b = 1;
        //b's value is simply the int value 1.

        Integer bb = 1;
        // bb's value is an address where the Integer object referenced bb is located showing where the integer value is stored.

        Integer cc = bb;
        /*
        In this example, I created an Integer object called cc and declared it equal to bb. Both cc and bb are referencing the same address where the object
        data is stored. So essentially, 2 difference objects are referencing the same data stored.
         */
        Integer jj = 1;
        Integer kk = 1;
        /*
        Here we have two Integers that equal 1. However, unlike the example above, these two objects are referencing different addresses where
        object data is stored. In other words, they both have their OWN int 1 stored somewhere thats seperate from one another.
         */

        // Shared Reference Example.
        Point origin = new Point(0, 0);

        //Point otherPoint = origin;    this was changing both to 4,3 when I used the setLocation method on otherPoint. I needed to reference a new address in order to prevent this.
        Point otherPoint = new Point(0, 0);

        otherPoint.setLocation(4, 3);
        System.out.println(" ");
        System.out.println("The origin is at "+ origin.toString());
        System.out.println("The other point is at "+ otherPoint.toString());

        Point point_1 = new Point(0, 0);
        Point point_2 = new Point(0, 0 );
         // the points are equal right?

        System.out.println( point_1.toString() + " equals "+ point_2.toString()+ " : " +(point_1==point_2));

        /*
        The reason these point_1 == point_2 is evaluating as false is because objects are passed by reference! that part of code is not comparing the values of the two
        Point objects, it is comparing the references to those points. That is , the == operator is checking if the location of point_1 in memory is the same
        as that of point_2.
         */







    }


}
