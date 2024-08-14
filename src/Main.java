import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello user, type something and I will find the second-to-last word of the sentence!");

        Scanner myScanner = new Scanner(System.in);

        String userInput = myScanner.nextLine();

        // Split the input string into a list of words
        List<String> userInputWords = Arrays.asList(userInput.split(" "));

        // Function to:
        // 1. Check if there are at least two words
        // 2. Display the second-to-last word

        if (userInputWords.size() >= 2) {
            String secondToLastWord = userInputWords.get(userInputWords.size() -2);
            System.out.println("The second-to-last word is: " + secondToLastWord);
        } else {
            System.out.println("You need to type at least two words");
        }

    }
}