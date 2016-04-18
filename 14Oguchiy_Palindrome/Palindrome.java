// ****************************************************************
// Palindrome.java
//
// Author: Yuya Oguchi              Date: 3/6/14
//
//
// ****************************************************************

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        String word;
        int first = 0, last;
        boolean check;

        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Palindrome program! ");
        System.out.println("Please do not use integers.");

        //get string
        System.out.print("Enter a string you would like to check: ");
        word = scan.next();

        last = word.length();

        check = palindrome(word, first, last);

        if (check == true){
            System.out.println("Phrase: " + word + " " + " is palindrome" );
        }
        else{
            System.out.println("Phrase: " + word + " " + " is not palindrome" );
        }

    }

    // -------------------------------------------------
    // Computes and returns if word is palindrome
    // -------------------------------------------------

    public static boolean palindrome( String word, int first, int last)
    {
        if (first - last >= 0)
      return true;


        if (word.charAt(first) == word.charAt(last - 1)){
          first++;
          last--;
        return palindrome(word, first, last);
      } else {
          return false;
        }



        //return palindrome.indexOf(1 + f) == palindrome.indexOf(n - f);
    }
}
