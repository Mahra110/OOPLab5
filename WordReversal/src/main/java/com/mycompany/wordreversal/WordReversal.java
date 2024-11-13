package com.mycompany.wordreversal;
import java.util.Scanner;
public class WordReversal {
    public static String reverseWord(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return word;}
    return reverseWord(word.substring(1)) + word.charAt(0);}
    public static void main(String[] args) {
        System.out.print("Enter word(s)");
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        String reversedWord = reverseWord(word);
        System.out.println("Original word(s): " + word);
        System.out.println("Reversed word(s): " + reversedWord);}}
