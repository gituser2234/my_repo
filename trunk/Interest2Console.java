
/* Simulation of console-I/O program Interest2,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   v6.44  
 
   David Eck
   eck@hws.edu
   
*/

public class Interest2Console extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"Interest2\"";
   }

   protected void program() {

       /* This program will compute the amount of interest
          earned on an investment over a period of
          one year.  The initial amount of the investment
          and the interest rate are input by the user.
          The value of the investment at the end of the
          year is output.  The rate must be input as a
          decimal, not a percentage (for example, 0.05,
          rather than 5).
       */
       
       double principal;  // the value of the investment
       double rate;       // the annual interest rate
       double interest;   // the interest earned during the year
       
       console.put("Enter the initial investment: ");
       principal = console.getlnDouble();
       
       console.put("Enter the annual interest rate: ");
       rate = console.getlnDouble();
       
       interest = principal * rate;          // compute this year's interest
       principal = principal + interest;     // add it to principal
       
       console.put("The value of the investment after one year is $");
       console.putln(principal);
      

   }

}
