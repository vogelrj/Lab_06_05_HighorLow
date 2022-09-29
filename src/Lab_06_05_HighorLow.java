import java.util.Random;
import java.util.Scanner;

public class Lab_06_05_HighorLow {
    public static void main(String[] args) {
        String Trash = "";
        int randNum = 0;
        int userNum = 0;
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        randNum = generator.nextInt(10) + 1;
        System.out.println("Guess what whole number [1-10] I am thinking of?");
        if (in.hasNextInt()){
            userNum = in.nextInt();
            in.nextLine();
        }
        else{
            Trash.equals(in.nextLine());
            System.out.println("Invalid Input. Please try again with a whole number [1-10].");
            System.exit(0);
        }
        if (randNum == userNum){
            System.out.println("Your guess was correct! My number was " + randNum + ".");
        }
        else if (randNum < userNum){
            System.out.println("Your guess was higher. My number was " + randNum + ".");
        }
        else{
            System.out.println("Your guess was lower. My number was " + randNum + ".");
        }

    }
}
