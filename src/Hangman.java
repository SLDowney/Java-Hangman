import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static final int MAX_WRONG_GUESSES = 8;
    private String wordToFind;
    private char[] newWord;
    private int currentNumErrors;
    private String[] userLetters;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public String getWord() {
        //Goes to HangmanArtWords to grab word from the words array using a random index
        return HangmanArtWords.WORDS_ARRAY[random.nextInt(HangmanArtWords.WORDS_ARRAY.length)];
    }

    public boolean userWinCheck() {
        //boolean check to see if user wins. If true then user wins
        return wordToFind.contentEquals(new String(newWord));
    }

    public void newGame() {
        int i;
        //Reset error count to zero for new game
        currentNumErrors = 0;
        //Get new random word using getWord method
        wordToFind = getWord();
        //Reset all entries in userLetters array to blank (" ")
        for ( i = 0; i < userLetters.length; i++) {
            userLetters[i] = " ";
        }
        //creates a char array with the length of the new random word, used to check/place user guesses
        newWord = new char[newWord.length];
        //Initializes all indexes in the newWord array to an underscore ("_"
        for ( int j = 0; j < newWord.length; j++) {
                newWord[j] = '_';
        }
    }








}
