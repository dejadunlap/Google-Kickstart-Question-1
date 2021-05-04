import java.lang.*;
import java.util.*;
/***
* @Author: Deja Dunlap
* @Date: March 5, 2021
* @ Finds the goodness score of a string
*/
class Main {
  public static void main(String[] args) {
    //creates scanner
    Scanner in = new Scanner(System.in);

    //takes in the number of list you would like to create
    int numCases = Integer.parseInt(in.nextLine()); 
    int counter = 0; 
    int[] answers = new int[numCases];

    while (counter < numCases){
      //takes in the current string and splits it into an array
      String currentLine = in.nextLine();
      String[] currentString = currentLine.split(" ");
      int lengthOfString = Integer.parseInt(currentString[0]);
      int goodnessScore = Integer.parseInt(currentString[1]);
      String testString = in.nextLine();
      String[] testArray = testString.split("");
      int startingGS = 0;

      //finds the goodness score of the string
      for (int i = 0; i < lengthOfString/2; i++){
       if (!testArray[i].equals(testArray[lengthOfString-i-1])){
          startingGS++;
       }//end of if 
      }//end of for loop

      answers[counter] = Math.abs(goodnessScore - startingGS);
      counter++;
    }//end of while loop

    // prints out the results
    for (int i = 0; i < answers.length; i++){
      System.out.println("Case #" + (i + 1) + ": " + answers[i]);
    }

  }//end of main method
}//end of main class