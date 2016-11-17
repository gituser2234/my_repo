
/* Simulation of console-I/O program Interest1,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck & Arnold Swart
   eck@hws.edu
   
*/

public class Interest1Console extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"Interest1\"";
   }

   protected void program() {

      /*
        Program  computes the amount of interest that is
        earned on $17,000 invested at an interest
        rate of 0.07 for one year.  The interest and
        the value of the investment after one year are
        printed to standard output.
     */


      double principal;     // The value of the investment.
      double rate;          // The annual interest rate.
      double interest;      // Interest earned in one year.
    
      /* Do the computations. */
    
      principal = 17000;
      rate = 0.07;
      interest = principal * rate;   // Compute the interest.
    
      principal = principal + interest;
            // Compute value of investment after one year, with interest.
           // (Note: The new value replaces the old value of principal.)
          
      /* Output the results. */
            
      console.put("The interest earned is $");
      console.putln(interest);
      console.put("The value of the investment after one year is $");
      console.putln(principal);

   }

}
