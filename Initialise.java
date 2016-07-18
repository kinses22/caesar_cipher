package com.kinses22;

import java.util.Scanner;
/**
 * Created by Stephen on 18/07/2016.
 */
public class Initialise {



    public static void main(String args[]){

        Scanner scan = new Scanner(System.in); // Calling the Scanner Object.

        System.out.println("Enter in a word or phrase you would like to encrypt: "); // Prompting the user for a word or a phrase
        String password = scan.nextLine();// The input is stored as a String called Password

        System.out.println("Enter in a first key: ");// Prompting the user for a Key(integer)
        int shiftKey = scan.nextInt(); // Storing the input as an int called key
        scan.nextLine(); // use this to clear the buffer.

        System.out.println("Enter in a second key: ");// Prompting the user for a Key(integer)
        int shiftKey1 = scan.nextInt(); // Storing the input as an int called key1
        scan.nextLine(); // problem with nextInt, so I needed to use this so I could type value for string a

        Encryption enc;// Initialising the constructor
        enc = new Encryption(shiftKey, shiftKey1);

        String newEncryption = enc.encrypt(password);// passing the password through the encrypt method.
        System.out.println("Encrypted word: "+ newEncryption);// Outputting the encrypted message.

        System.out.println("Would you like to decrypt an encrypted word?  Yes or No?"); // Prompting the user to make a decision
        String a = scan.nextLine(); // storing response as a String and then creating an if else statement for yes or no.
        if (a.equalsIgnoreCase("Yes")){ // If Else
            System.out.println("Enter in a word you would like to decrypt: "); // Prompting a user to store a message to decrypt.
            String encryptedWord = scan.nextLine(); // Store the input as a String
            System.out.println("Decrypted word: "+ enc.decrypt(encryptedWord));} // pass the String encryptedWord through the decrypt method.
        else{
            System.out.println("Thanks for using this encryption application");
            System.exit(0);} // Exits normally

        System.exit(0); // Exits normally

    }


}
