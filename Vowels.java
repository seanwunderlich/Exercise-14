/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 14
 * Vowel analyzer program
 */

//This program counts the number of vowels and consonants in an entered word or phrase

import java.util.Scanner;

public class Vowels
{
    public static void main (String[]args)
    {
        String strInput;
        int  intA = 0, intE = 0, intI = 0, intO = 0, intU = 0, intConsonant = 0;
        char chrVowels;
        //instance variables, set all counts to 0 to start with

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a word or phrase: ");
        strInput =  scan.nextLine();

        for (int intCount = 0; intCount < strInput.length(); intCount++)
            //for when count is less than the entered string, add to the count
        {
            chrVowels = strInput.charAt(intCount);
            switch (chrVowels)
            {
                case 'a':
                    intA++;
                    break;
                case 'e':
                    intE++;
                    break;
                case 'i':
                    intI++;
                    break;
                case 'o':
                    intO++;
                    break;
                case 'u':
                    intU++;
                    break;
                default:
                    intConsonant++;
            //add to each vowel count in the event that there is one, otherwise add to consonant count
            }
        }
        System.out.println ("Amount of a's: " + intA);
        System.out.println ("Amount of e's: " + intE);
        System.out.println ("Amount of i's: " + intI);
        System.out.println ("Amount of o's: " + intO);
        System.out.println ("Amount of u's: " + intU);
        System.out.println ("Amount of consonants " + intConsonant);
        //print total counts from entered string
    }
}
