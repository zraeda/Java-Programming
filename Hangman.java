import java.io.*;
import java.util.*;

public class Hangman{
    public static void main(String[] args) throws IOException {
    	int choice = 0;
    	String[] words ;  
    	do {
    	System.out.println("Hangman Game\r\n" + 
    			"Press 1 to run game with randomly generated word.\r\n" + 
    			"Press 2 to run game by reading the word from the text file.\r\n" + 
    			"Enter your choice: ");
    	Scanner input = new Scanner(System.in);
    	choice = input.nextInt();
    	input.nextLine();
    	if (choice != 1 && choice != 2) {
    		System.out.println("\nPlease Enter either 1 or 2");
    	}
    	}while (!(choice == 1 || choice == 2));
    	
    	if (choice == 1) {
    	    words = new String[] {"enjoy", "program", "happy", "dreams", "java", "eclips", "facebook"};
    		
    	}else {
    		 words = loadWords("words.txt").toArray(new String[loadWords("words.txt").size()]);
    	}
    	
    	
       // String[] words = {"enjoy", "program", "happy", "dreams", "java", "eclips", "facebook"};
        Random random = new Random();
      //  boolean asteriskPrinted = false;
        // Pick random index of words array
        int randomWordNumber = random.nextInt(words.length); //
        // Create an array to store already entered letters
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        boolean wordIsGuessed = false;
        do {
                	
                // infinitely iterate through cycle as long as enterLetter returns true
                // if enterLetter returns false that means user guessed all the letters
                // in the word 
                switch (enterLetter(words[randomWordNumber], enteredLetters)) {
                case 0:
                    triesCount++;
                    break;
                case 1:
                    triesCount++;
                    break;
                case 2:
                    break;
                case 3:
                    wordIsGuessed = true;
                    break;
            }
        	


        } while (! wordIsGuessed);
        System.out.println("\nThe word is " + words[randomWordNumber] +
            " You missed " + (triesCount -findEmptyPosition(enteredLetters)) +
            " time(s)");
    }

    /* Hint user to enter a guess letter,
    returns 0 if letter entered is not in the word (counts as try),
    returns 1 if letter were entered 1st time (counts as try),
    returns 2 if already guessed letter was REentered,
    returns 3 if all letters were guessed */
    public static int enterLetter(String word, char[] enteredLetters)    {
        System.out.print("(Guess) Enter a letter in word ");
        // If-clause is true if no asterisks were printed so
        // word is successfully guessed
        if (! printWord(word, enteredLetters))
            return 3;
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = findEmptyPosition(enteredLetters);
        char userInput = input.nextLine().toLowerCase().charAt(0);
        if (inEnteredLetters(userInput, enteredLetters)) {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (word.contains(String.valueOf(userInput).toLowerCase())) {
            enteredLetters[emptyPosition] = userInput;
            return 1;
        }
        else {
            System.out.println(userInput + " is not in the word");
            return 0;
            }
    }

    /* Print word with asterisks for hidden letters, returns true if
    asterisks were printed, otherwise return false */
    public static boolean printWord(String word, char[] enteredLetters) {
        // Iterate through all letters in word
        boolean asteriskPrinted = false;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            // Check if letter already have been entered bu user before
            if (inEnteredLetters(letter, enteredLetters))
                System.out.print(letter); // If yes - print it
            else {
                System.out.print('*');
                asteriskPrinted = true;
            }
        }
        return asteriskPrinted;
    }

    /* Check if letter is in enteredLetters array */
    public static boolean inEnteredLetters(char letter, char[] enteredLetters) {
        return new String(enteredLetters).contains(String.valueOf(letter));
    }

    /* Find first empty position in array of entered letters (one with code \u0000) */
    public static int findEmptyPosition(char[] enteredLetters) {
        int i = 0;
        while (enteredLetters[i] != '\u0000') i++;
        return i;
    }
    
    public static List<String> loadWords(String fileName) throws IOException {
       List< String> wordsList = new ArrayList<String>();
   

    File f = new File(fileName);
 
  char c;
  String word="";
  FileInputStream fis = null;
try {
      fis = new FileInputStream(fileName);
    int i ;
      while ((i = fis.read()) != -1) {
        c = (char) i;
 
        while (c != ' ' && fis.available() > 0) {
        	word += c;
        	if ((i = fis.read()) != -1) {
        		c = (char) i;
        	}
        	       	
        	else {
        		continue;
 
        	}
        }
        if (fis.available() == 0) {
        	word += c;
        }
        wordsList.add(word);
        word = "";
  
      }


    } catch (IOException e) {
      e.printStackTrace();
    }finally {
        
        // releases all system resources from the streams
        if(fis!=null) {
           fis.close();
        }
     }








        return wordsList;
    }



}
