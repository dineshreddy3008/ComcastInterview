                                           String/File to Decimal Sum
Project Name: ComcastInterview
Files In the Project:
1.	MainClass
2.	StringToDecimal
3.	StringToDecimalTest
Eclipse:  This project is developed on Eclipse IDE platform using Java 1.8 . Import this project into Eclipse to execute the project. Upon prompted, give the valid text file path where file is stored.
OR
Command Prompt: Execute the following commands in the command prompt.
1.	Comment the package on top of MainClass.java and StringToDecimal.java
2.	Type javac *.java for compilation of both classes
3.	Type java MainClass to run the application
4.	Upon prompted, give the valid text file path where file is stored

MainClass.java:
This is the main class in java from where the execution of the project starts. It has two methods
1.main():
This method prompts the other method called performOperations() and also prompts the user to Continue or quit.
2. performOperations():
This method checks for the length of String and prompts the user till input is entered. It gives a bunch of options such as file, hexadecimal, normal string and executes the switch case which calls the specific methods in StringToDecimal class.
StringToDecimal.java:
This class has the main functionality which takes the input from the performOperations() and executes the following methods
1.stringToDecimal():
This method takes the default string. It Filters the string with numbers from 0 to 9 and calculates the sum of numbers in the string. It uses Lambda functions like Function to calculate the sum.
 
2.hexToDecimal():
This method takes the string. It Filters the string with numbers from 0 to 9 and digits from A-F.it calculates the sum of hexadecimal numbers in the string. It uses Lambda functions like Function to calculate the sum. 
3.fileToDecimal():
This method takes the file. It reads the content of file into string and calls the stringToDecimal() to calculate the sum. It uses Streams to read the contents from file and store it to String.
StringToDecimalTest.java
This is a test class which has test cases for StringToDecimal class. Run this class to view the test cases status.
---------------------------------------------------------------------------------------------------------------------
OUTPUT:
***********************************COMCAST ASSESSMENT*********************************
***************************String/File To Decimal Conversion**************************
Please enter -f to give file as input
Or Enter -x for conversion of Hexadecimal String
Or Enter the String: 
1234567890[];',./=-)(*&^%$#@!`~
Decimal value for sum of all numeric values in String is 45
Do you wish to continue, Please enter Y for Yes, N for No
y
Please enter -f to give file as input
Or Enter -x for conversion of Hexadecimal String
Or Enter the String: 
-x
Please enter the string
1234567890abcdefghi
Decimal value for all values in Hexadecimal String is 120
Do you wish to continue, Please enter Y for Yes, N for No
y
Please enter -f to give file as input
Or Enter -x for conversion of Hexadecimal String
Or Enter the String: 
-f
Please enter the file path
C:\Users\Dinesh Reddy\Desktop\Interview\ComcastInterview\src\com\comcastinterview\sourcecode\FileToDecimal.txt
Decimal value for all values in File is 69
Do you wish to continue, Please enter Y for Yes, N for No
y
Please enter -f to give file as input
Or Enter -x for conversion of Hexadecimal String
Or Enter the String: 
-f
Please enter the file path
C:\Users\Dinesh Reddy\Desktop\Interview\ComcastInterview\src\com\comcastinterview\sourcecode\FileToDecim
Invalid Path Please try again
Do you wish to continue, Please enter Y for Yes, N for No
y
Please enter -f to give file as input
Or Enter -x for conversion of Hexadecimal String
Or Enter the String: 

You forgot to enter the input,Please enter -f for file or -x for hexadecimal conversion or directly enter a String
1234567890
Decimal value for sum of all numeric values in String is 45
Do you wish to continue, Please enter Y for Yes, N for No
n
Exited! Thank You.
-------------------------------------------------------------------------------------


