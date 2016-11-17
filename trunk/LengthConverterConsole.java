
/* Simulation of console-I/O program LengthConverter,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class LengthConverterConsole extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"LengthConverter\"";
   }

   protected void program() {
      
      /* This program will convert measurements expressed in inches,
         feet, yards, or miles into each of the possible units of
         measure.  The measurement is input by the user, followed by
         the unit of measure.  For example:  "17 feet", "1 inch",
         "2.73 mi".  Abbreviations in, ft, yd, and mi are accepted.
         The program will continue to read and convert measurements
         until the user enters an input of 0.
      */
      
      double measurement;  // Numerical measurement, input by user.
      String units;        // The unit of measure for the input, also
                           //    specified by the user.
      
      double inches, feet, yards, miles;  // Measurement expressed in each
                                          //   possible unit of measure.
      
      console.putln("Enter measurements in inches, feet, yards, or miles.");
      console.putln("For example:  1 inch    17 feet    2.73 miles");
      console.putln("You can use abbreviations:   in   ft  yd   mi");
      console.putln("I will convert your input into the other units of measure.");
      console.putln();
      
      while (true) {
         
         /* Get the user's input, and converts units to lower case. */
         
         console.put("Enter your measurement, or 0 to end:  ");
         measurement = console.getDouble();
         if (measurement == 0)
            break;  // terminate the while loop
         units = console.getlnWord();            
         units = units.toLowerCase();
         
         /* Convert the input measurement to inches. */
         
         if (units.equals("inch") || units.equals("inches") || units.equals("in"))
             inches = measurement;
         else if (units.equals("foot") || units.equals("feet") || units.equals("ft"))
             inches = measurement * 12;
         else if (units.equals("yard") || units.equals("yards") || units.equals("yd"))
             inches = measurement * 36;
         else if (units.equals("mile") || units.equals("miles") || units.equals("mi"))
             inches = measurement * 12 * 5280;
         else {
             console.putln("Sorry, but I don't understand \"" + units + "\".");
             continue;  // back to start of while loop
         }
         
         /* Convert the measurement in inches to feet, yards, and miles. */
         
         feet = inches / 12;
         yards = inches / 36;
         miles = inches / (12*5280);
         
         /* Output the measurement in terms of each unit of measure. */
         
         console.putln();
         console.putln("That's equivalent to:");
         console.put(inches, 15);
         console.putln(" inches");
         console.put(feet, 15);
         console.putln(" feet");
         console.put(yards, 15);
         console.putln(" yards");
         console.put(miles, 15);
         console.putln(" miles");
         console.putln();
      
      } // end while
      
      console.putln();
      console.putln("OK!  Bye for now.");
      
   }

}
