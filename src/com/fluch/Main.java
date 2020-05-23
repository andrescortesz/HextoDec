package com.fluch;
import testio.TextIO;

public class Main {

    public static void main(String[] args) {

        // Variables declaration
        String number; // Number typed by the user
        int value=0;
        int flag=0;
        System.out.print("Insert an Hexadecimal Number: -> ");
        number= TextIO.getln().toUpperCase();
        //System.out.println(number);

        for(int i=0;i< number.length();i++){
            flag = hexValue(number.charAt(i));
            if (flag == -1)
                break;
            else
            value = value*16 + flag;
        }// end for
        if (flag==-1)
            System.out.println(" invalid Hex...");
         //   flag = 0;
        else
            System.out.println("Your " + number + " converted to decimal is: -> " + value);
    }// end main

    static int hexValue (char Char_number){

        // Variables declaration
        String each_number= Character.toString(Char_number);
        int integerValue=0;

            switch (each_number) {
                case "1":
                    integerValue = 1;
                    break;
                case "2":
                    integerValue = 2;
                    break;
                case "3":
                    integerValue = 3;
                    break;
                case "4":
                    integerValue = 4;
                    break;
                case "5":
                    integerValue = 5;
                    break;
                case "6":
                    integerValue = 6;
                    break;
                case "7":
                    integerValue = 7;
                    break;
                case "8":
                    integerValue = 8;
                    break;
                case "9":
                    integerValue = 9;
                    break;
                case "A":
                    integerValue = 10;
                    break;
                case "B":
                    integerValue = 11;
                    break;
                case "C":
                    integerValue = 12;
                    break;
                case "D":
                    integerValue = 13;
                    break;
                case "E":
                    integerValue = 14;
                    break;
                case "F":
                    integerValue = 15;
                    break;
                default:
                    System.out.println("Warning!! -> Invalid Charnumber <-");
                    integerValue = -1;
            }  // Switch
        return integerValue;
    }// end hexValue function
}//Main class
