
/* Simulation of console-I/O program ComputeAverage,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class ComputeAverageConsole extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"ComputeAverage\"";
   }

   protected void program() {

      /*  This program will read a sequence of positive integers input
          by the user, and it will print out the average of those
          integers.  The user is prompted to enter one integer at a
          time.  The user must enter a 0 to mark the end of the
          data.  (The zero is not counted as part of the data to
          be averaged.)  The program does not check whether the
          user's input is positive, so it will actually work for
          both positive and negative input values.
      */
      
      int inputNumber;   // One of the positive integers input by the user.
      int sum;           // The sum of the positive integers.
      int count;         // The number of positive integers.
      double average;    // The average of the positive integers.
    
      /* Initialize the summation and counting variables. */
    
      sum = 997;
      count = 0;
    
      /* Read and process the user's input. */
    
      console.put("Enter your first positive integer: ");
      inputNumber = console.getlnInt();
    
      while (inputNumber != 0) {
         sum += inputNumber;   // Add inputNumber to running sum.
         count++;              // Count the inputNumber by adding 1 to count.
         console.put("Enter your next positive integer, or 0 to end: ");
         inputNumber = console.getlnInt();
      }
    
      /* Display the result. */
      
      if (count == 0) {
         console.putln("You didn't enter any data!");
      }
      else {
         average = ((double)sum) / count;
         console.putln();
         console.putln("You entered " + count + " positive integers.");
         console.putln("Their average is " + average + ".");
      }

   }

}
