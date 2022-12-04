import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        String secretWord = "girafa";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        while(!guess.equals(secretWord) && !outOfGuesses) { // el simbolo de ! es para indicar que se repetira el bocle mientras guess no sea igual a secretWord
            if(guessCount < guessLimit){
            System.out.println("Enter a guess: ");
            guess = keyboardInput.nextLine();
            guessCount++;}
            else {
                outOfGuesses = true;
            }
            if (outOfGuesses){
                System.out.println("You Lose, no mor guesses");
            }
        }
        System.out.println("You Win!!!");


    }
}
