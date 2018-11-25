package com.comcastinterview.sourcecode;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * MainClass program which prompts the user to enter the input and converts it to Decimal Format
 * 
 * @author Dinesh Kumar Reddy
 * Date    11/24/2018
 */
public class MainClass {

 /**
  * This is the main method which prompts the user to enter input and also invokes performOperations() method
  * @param args unused
  * @return Nothing
  */
 public static void main(String[] args) {
  System.out.println("***********************************COMCAST ASSESSMENT*********************************");
  System.out.println("***************************String/File To Decimal Conversion**************************");
  String wishToContinue;
  do {
   performOperations();
   System.out.println("Do you wish to continue, Please enter Y for Yes, N for No");
   Scanner scanner = new Scanner(System.in);
   wishToContinue = scanner.nextLine();
  } while (!wishToContinue.equalsIgnoreCase("N"));
  System.out.println("Exited! Thank You.");
 }
 
 /**
  * This method is invoked by the main method to input the string and convert to Decimal Value
  * @param Nothing
  * @return Nothing
  * @exception FileNotFoundException upon invalid filePath
  */
 public static void performOperations() {
  System.out.println("Please enter -f to give file as input");
  System.out.println("Or Enter -x for conversion of Hexadecimal String");
  System.out.println("Or Enter the String: ");
  Scanner input = new Scanner(System.in);
  String s = input.nextLine();

  while (s.length() == 0) {
   System.out.println(
    "You forgot to enter the input,Please enter -f for file or -x for hexadecimal conversion or directly enter a String");
   s = input.nextLine();
  }

  StringToDecimal stringToDecimal = new StringToDecimal(s);

  switch (s) {
   case "-f":
    {
     System.out.println("Please enter the file path");
     StringToDecimal fToD = new StringToDecimal(input.nextLine());
     try {
      System.out.println("Decimal value for all values in File is " + fToD.fileToDecimal());
     } catch (FileNotFoundException e) {
         System.out.println("Invalid Path Please try again");
        }
    }
    break;
   case "-x":
    {
     System.out.println("Please enter the string");
     StringToDecimal hToD = new StringToDecimal(input.nextLine());
     System.out.println("Decimal value for all values in Hexadecimal String is " + hToD.hexToDecimal());
    }
    break;
   default:
    System.out.println("Decimal value for sum of all numeric values in String is " + stringToDecimal.stringToDecimal());
    break;
  }
 }

}