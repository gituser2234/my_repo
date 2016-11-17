
/* Simulation of console-I/O program GuessingGame,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
   August 11, 1996
*/

public class GuessingGameConsole extends ConsoleApplet {

   public String getTitle() {
      return "Sample program \"GuessingGame\"";
   }

   protected void program() {
   
     /*  The user plays a guessing game where the
         computer picks a number between 1 and 100,
         and the user tries to guess the number
     */
     
      console.putln("Let's play a game.  I'll pick a number between");
      console.putln("1 and 100, and you try to guess it.");
      boolean playAgain;
      do {
         playGame();  // call subroutine to play one game
         console.put("Would you like to play again? ");
         playAgain = console.getlnBoolean();
      } while (playAgain);
      console.putln("Thanks for playing.  Goodbye.");
    
    } // end program()
    
     
    void playGame() {
       int computersNumber; // A random number picked by the computer.
       int usersGuess;      // A number entered by user as a guess.
       int guessCount;      // Number of guesses the user has made.
       computersNumber = (int)(100 * Math.random()) + 1;
                 // The value assigned to computersNumber is a randomly
                 //    chosen integer between 1 and 100, inclusive.
       guessCount = 0;
       console.putln();
       console.put("What is your first guess? ");
       while (true) {
          usersGuess = console.getInt();  // get the user's guess
          guessCount++;
          if (usersGuess == computersNumber) {
             console.putln("You got it in " + guessCount
                     + " guesses!  My number was " + computersNumber);
             break;  // the game is over; the user has won
          }
          if (guessCount == 6) {
             console.putln("Sorry, you didn't get the number in 6 guesses.");
             console.putln("You lose.  My number was " + computersNumber);
             break;  // the game is over; the user has lost
          }
          // If we get to this point, the game continues.
          // Tell the user if the guess was too high or too low.
          if (usersGuess < computersNumber)
             console.put("That's too low.  Try again: ");
          else if (usersGuess > computersNumber)
             console.put("That's too high.  Try again: ");
       }
       console.putln();
   } // end of playGame()
   
}  //end class GuessingGameConsole
