package com.kinses22;

/**
 * Created by Stephen on 18/07/2016.
 */
public class Encryption {

    private int keyEven; // Int key stored so encrypt and decrypt methods could access them.
    private int keyOdd;	// Int key stored so encrypt and decrypt methods could access them.

    public Encryption(int key1, int key2){ // Constructor.
        keyEven = key1; // int keys defined by values passed through the constructor.
        keyOdd = key2; //int keys defined by values passed through the constructor.
    }

    public String encrypt(String plaintext) { // Encrypt method
        String result = ""; // Value that will be returned
        int l = plaintext.length(); // Int l is the lenght of the phrase or word thats passed through the method. i.e. Hello = 4
        char ch; // declarying a char variable ch
        for(int count = 0; count<l; count++){ // a loop that starts at and runs as long as the length is greater that int count.
            if(count%2==0){ // Checking if the characters index is odd or even.
                ch = plaintext.charAt(count); // ch current character in this loop so "H" for Hello.
                int newShift = ch + keyEven; // int d adds the shift amount to the current characters decimal value in the ASCII table.
                int res = (newShift-32)%(127-32)+32; // formula using modulos to keep it in range 32-127.
                result += (char)res; // results equals to the blanck + the result of the above formula. Then converts to char.
            }
            else{
                ch = plaintext.charAt(count);
                int newShift = ch + keyEven;
                int res = (newShift-32)%(127-32)+32;
                result += (char)res; // add (char) in before to convert it to ascii characters
            }
        }
        return result;	// returns encrypted value
    }

    public String decrypt(String ciphertext) {
        String result = "";
        int l = ciphertext.length();
        char K;
        for(int count = 0; count<l; count++){
            if(count%2==0 ){ // Checking if the characters index is odd or even.
                K = ciphertext.charAt(count);
                int newShift = K - keyEven;
                int res = (((newShift-32)%95)+95)%95+32;
                result += (char)res;
            }
            else {
                K = ciphertext.charAt(count);
                int newShift = K - keyEven;
                int res = (((newShift-32)%95)+95)%95+32;// 95 = 127 - 32
                result += (char)res;
            }

        }
        return result;
    }



}
