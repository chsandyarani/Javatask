package Programs;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {

        String sentence, result = "";
        String allWords[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        sentence = sc.nextLine().toLowerCase();  //convert to lower case

        // Split the given sentence to get each word as String array

        allWords = sentence.split(" ");

        // Use for loop to remove duplicate words

        for (int i = 0; i < allWords.length; i++) {
            for (int j = i + 1; j < allWords.length; j++) {
                if (allWords[i].equals(allWords[j])) {
                    allWords[j] = "remove";
                    allWords[i] = "remove";
                }
            }
        }
        // Convert to String
        for (String word : allWords) {
            if (word != "remove") {
                result = result + word + " ";
            }
        }

        // Display given String after removing duplicate

        String words[] = result.split(" ");
        String reversedString = "";
        //Reverse each word's position

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }
        System.out.println(reversedString);
    }
}
