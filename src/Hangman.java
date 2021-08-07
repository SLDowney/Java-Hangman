import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static final int MAX_WRONG_GUESSES = 8;
    private static String currentWord = "";
    private static char[] currentlettersArray;
    private static int currentNumErrors;
    public static int count = 0;

    public static String getWord() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean invalid = false;
        String userPick = "";

        System.out.print("\nEnter 1 for Easy, 2 for Medium, or 3 for Hard: ");
        int userChoice = scanner.nextInt();

        while ( invalid == false )
            if ( userChoice == 1 ) {
                //Goes to HangmanArtWords to grab word from the words array using a random index
                userPick = HangmanArtWords.WORDS_ARRAY_EASY[random.nextInt(HangmanArtWords.WORDS_ARRAY_EASY.length)];
                invalid = true;
            }
            else if ( userChoice == 2 ) {
                //Goes to HangmanArtWords to grab word from the words array using a random index
                userPick =  HangmanArtWords.WORDS_ARRAY_MED[random.nextInt(HangmanArtWords.WORDS_ARRAY_MED.length)];
                invalid = true;
            }
            else if ( userChoice == 3 ) {
                //Goes to HangmanArtWords to grab word from the words array using a random index
                userPick =  HangmanArtWords.WORDS_ARRAY_HARD[random.nextInt(HangmanArtWords.WORDS_ARRAY_HARD.length)];
                invalid = true;
            }
            else {
                //If userChoice is invalid, it will ask again
                System.out.println("Invalid Entry");
                invalid = false;
            }
        return userPick;
    }

    public static boolean userWinCheck() {
        //boolean check to see if user letter guesses match the current word. If true then user wins
        return currentWord.contentEquals(new String(currentlettersArray));
    }

    public static void newGame() {
        //Reset error count to zero for new game
        currentNumErrors = 0;
        //Get new random word using getWord method
        currentWord = getWord();
        //creates a char array with the length of the new random word, used to check/place user guesses
        currentlettersArray = new char[currentWord.length()];
        //Initializes all indexes in the newWord array to an underscore ("_")
        for ( int j = 0; j < currentlettersArray.length; j++) {
                if ( (String.valueOf(currentlettersArray[j])) == "-") {
                    currentlettersArray[j] = '-';
                }
            currentlettersArray[j] = '_';
        }
        System.out.println("\n" + currentlettersArray);
    }

    public static void updateUserGuesses(String userEntry) {
        if (currentWord.contains(userEntry)) {
            //find the index of userEntry within the current word
            int index = currentWord.indexOf(userEntry);

            while (index >= 0) {
                currentlettersArray[index] = userEntry.charAt(0);
                index = currentWord.indexOf(userEntry, index + 1);
            }
        }
        else {
            //If userEntry is not in the current word, add 1 to the number of incorrect guesses
            currentNumErrors++;
        }
    }

    private static String displayUpdated() {
        int i = 0;
        //Class to add strings together to create larger strings
        StringBuffer buffer = new StringBuffer();

        while ( i < currentlettersArray.length ) {
            buffer.append(currentlettersArray[i]);
            //If i is equal to the last letter in the word
            if ( i == currentlettersArray.length - 1 ) {
                buffer.append(" ");
            }
            i++;
        }
        return buffer.toString();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        while ( currentNumErrors < MAX_WRONG_GUESSES ) {
            int guessesRamaining = MAX_WRONG_GUESSES - currentNumErrors;
            if ( guessesRamaining == 1 ) {
                System.out.print("Enter LAST Letter Guess: ");
            }
            else {
                System.out.print("Enter Letter Guess: ");

            }
            String userEntry = scanner.next();
            updateUserGuesses(userEntry);
            //Shows current state of user guesses
            System.out.println("\n" + displayUpdated());
            userWinCheck();
            if (userWinCheck() == true) {
                System.out.println("\nWINNER!!");
                System.out.println("You get the joy of being a winner at Hangman, you don't need any more art.");
                break;
            }
            else {
                System.out.println("Guesses remaining: " + guessesRamaining);
                //switch statement to check number of current errors and print corresponding art
                switch (currentNumErrors) {
                    case 1 -> System.out.println(HangmanArtWords.stringArt1());
                    case 2 -> System.out.println(HangmanArtWords.stringArt2());
                    case 3 -> System.out.println(HangmanArtWords.stringArt3());
                    case 4 -> System.out.println(HangmanArtWords.stringArt4());
                    case 5 -> System.out.println(HangmanArtWords.stringArt5());
                    case 6 -> System.out.println(HangmanArtWords.stringArt6());
                    case 7 -> System.out.println(HangmanArtWords.stringArt7());
                    case 8 -> System.out.println(HangmanArtWords.stringArt8());
                }
            }
        }
        if ( currentNumErrors >= MAX_WRONG_GUESSES ) {
            count++;
            System.out.println("\nYOU LOST HA HA!!! Word to find was: " + currentWord);
            if ( count == 1 ) {
                System.out.println(HangmanArtWords.lose1());
            }
            else if ( count == 2 ) {
                System.out.println(HangmanArtWords.lose2());
            }
            else if ( count >= 3 ) {
                System.out.println(HangmanArtWords.lose3());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hangman!");
        System.out.print(HangmanArtWords.helloArt());

        String userChoice = "y";
        while (Objects.equals(userChoice, "y")) {
            newGame();
            playGame();
            System.out.print("\nWould you like to play again? (y/n): ");
            userChoice = scanner.next();
        }
        System.out.println("Thanks for playing!");
        System.out.println(HangmanArtWords.byeArt());
    }
}
