package Palindrome;

import java.util.stream.IntStream;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        String wordInLowerCases = word.toLowerCase(); //change the word to lower cases
        int wordLength = wordInLowerCases.length();  //word length into local varaible
        return IntStream                             //starting stream
                .range(0, wordLength / 2)              // making the range from 0 to half of the length
                .noneMatch(i -> wordInLowerCases.charAt(i) != wordInLowerCases.charAt(wordLength - i - 1)); //checking is there are none, none matching pair of chars in a word

    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}