
import java.util.Random;
import java.util.Scanner;


public class guessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        boolean playAgain = true;

        while(playAgain){
         int secretNum =random.nextInt(10)+1 ;
        int guess= 0;
        int attempts=0;

        System.out.println("Guessing game");
        System.out.println("Select a number between 1-10: ");
        System.out.println("can you guess it?");

        while(guess != secretNum ){
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        attempts++;
        }

        if(guess < secretNum){
            System.out.println("HIGHER PO");
        }else if(guess > secretNum){
            System.out.println("LOWER PO");
        }else{
            System.out.println("you have guessed it right!!!!"+secretNum);
            System.out.println("You've guessed it in: "+attempts+" attempts");
        }


        System.out.print("Do you want to play again??(y/n): ");
        String answer = scanner.next().toLowerCase();

       if(answer.equals("y")){
       playAgain = true;
       }else{
        playAgain = false;
        System.out.println("Thankyou for playing come again!!");

       }




    }

        scanner.close();
    }
    
}
