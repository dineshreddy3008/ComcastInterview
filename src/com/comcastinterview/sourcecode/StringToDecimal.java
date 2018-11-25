package com.comcastinterview.sourcecode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StringToDecimal Class program which has different methods to Convert the input data into Decimal value
 * 
 * @author Dinesh Kumar Reddy
 * Date    11/24/2018
 */
public class StringToDecimal {

 private String countDigits;
 private long sumOfDigits;
 private String filterDigits;
 private final static String hexaDecimals = "0123456789ABCDEF";
 
 /**
  * This is Constructor which is used to initialize the entered String
  *
  */
 public StringToDecimal(String countDigits) {
  this.countDigits = countDigits;
 }

 /**
  * This method is used to add the numbers in default String and return the the sum
  * @param  not used
  * @return long
  */
 public long stringToDecimal() {
  filterDigits = countDigits.replaceAll("[^0-9]", "");
   for (int i = 0; i < filterDigits.length(); i++) {
    sumOfDigits += Character.getNumericValue(filterDigits.charAt(i));
   }
   return sumOfDigits;
 
 }

 /**
  * This method is used to add the numbers in the Hexadecimal String and return the the sum.
  * It uses Lambda Function to calculate the sum
  * @param  not used
  * @return long
  */
 public long hexToDecimal() {
  filterDigits = countDigits.toUpperCase().replaceAll("[^A-F0-9]", "");
  Function < String, Long > hexaSum = (x) -> {
   for (int i = 0; i < x.length(); i++) {
    sumOfDigits += hexaDecimals.indexOf(filterDigits.charAt(i));

   }
   return sumOfDigits;
  };
  return hexaSum.apply(filterDigits);

 }

 /**
  * This method is used to add the numbers by reading the data from the file and return the the sum.
  * It uses Streams to read the file
  * @param  not used
  * @return long
  * @exception FileNotFoundException
  */
 public long fileToDecimal() throws FileNotFoundException {
  countDigits = countDigits.replaceAll("\\\\", "/");

  try (Stream < String > fileString = Files.lines(Paths.get(countDigits), Charset.forName("windows-1251"))) {
   countDigits = fileString.collect(Collectors.joining());
  }catch (IOException ex) {
	   throw new FileNotFoundException("File does not exist in the given path");
	  }

  return stringToDecimal();
 }
}