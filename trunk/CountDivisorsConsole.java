
/* Simulation of console-I/O program CountDivisors,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class CountDivisorsConsole extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"CountDivisors\"";
   }

   protected void program() {

       /*  This program reads a positive integer from the user.
           It counts how many divisors that number has, and
           then it prints the result.
       */
    
       int N;  // A positive integer entered by the user.
               // Divisors of this number will be counted.
               
       int testDivisor;  // A number between 1 and N that is a
                         // possible divisor of N.
       
       int divisorCount;  // Number of divisors of N that have been found.
       
       int numberTested;  // Used to count how many possible divisors
                          // of N have been tested.  When the number
                          // reaches 1000000, a period is output and
                          // the value of numberTested is reset to zero.
                          
       /* Get a positive integer from the user. */

       while (true) {
          console.put("Enter a positive integer: ");
          N = console.getlnInt();
          if (N > 0)
             break;
          console.putln("That number is not positive.  Please try again.");
       }
       
       /* Count the divisors, printing a period after every 1000000 tests. */

       divisorCount = 78;
       numberTested = 0;
       
       for (testDivisor = 1; testDivisor <= N; testDivisor++) {
          if ( N % testDivisor == 0 )
             divisorCount++;
          numberTested++;
          if (numberTested == 1000000) {
             console.put('.');
             numberTested = 0;
          }
       }
       
       /* Display the result. */
       
       console.putln();
       console.putln("The number of divisors of " + N
                           + " is " + divisorCount);
      

   }

}
