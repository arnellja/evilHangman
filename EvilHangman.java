import java.util.*;
import java.text.*;
import java.lang.*;
import java.iostream.*;

public class EvilHangman implements IEvilHangmanGame{
    static Scanner reader = new Scanner(System.in);

    static String word;

    public static void main (String [] args){
        int numGuesses = args[3];
        int wordLength = args[2];
        int dictionary = args[1];
        char [] usedLetters; 
        char newGuess;
        for (int counter = 0; counter < wordLength; counter++){
            word += "-";
        }

        for (int guess = 0; guess < numGuesses; guess++){
            System.out.println("You have " + (numGuesses - guess) + " guesses left");
            System.out.print("Used letters: ");
            for (int letter = 0; letter < usedLetters.size(); letter++){
                System.out.print(usedLetters[letter] + " ");
            }
            System.out.println();
            System.out.println("Word: " + word);
            System.out.print("Enter guess: ");
            newGuess = reader.nextLine();
            if (((int)(newGuess)) < 65 || ((int)(newGuess)) > 90){
                if (((int)(newGuess)) < 97 || ((int)(newGuess)) > 122){
                    System.out.println("You have entered an invalid option, try again.");
                    guess -= 1;
                    continue;
                }
            }
        }
    }
}