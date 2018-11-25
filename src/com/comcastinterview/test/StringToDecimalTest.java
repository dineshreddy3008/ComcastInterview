package com.comcastinterview.test;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.comcastinterview.sourcecode.StringToDecimal;

public class StringToDecimalTest {

 @Test
 public void stringToDecimalTest() {
  StringToDecimal stb = new StringToDecimal("zvkhw37498tpfuijigjnv");
  assertTrue(stb.stringToDecimal() == 31);
 }

 @Test
 public void hexToDecimalTest() {
  StringToDecimal stb = new StringToDecimal("");
  assertTrue(stb.hexToDecimal() == 0);
 }

 @Test
 public void fileToDecimalTest() {
  StringToDecimal stb = new StringToDecimal(
   "C:\\Users\\Dinesh Reddy\\Desktop\\Interview\\ComcastInterview\\src\\com\\comcastinterview\\sourcecode\\FileToDecimal.txt");
  try {
   assertTrue(stb.fileToDecimal() == 88);
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  }
 }

}