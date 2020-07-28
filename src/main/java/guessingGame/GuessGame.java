package guessingGame;

public class GuessGame {
  private Player p1;
  private Player p2;
  private Player p3;

  /**  the startGame() method is where the entire game plays out.
   * it create 3 payers, then "thinks􏰃" of a random number(the target for the plyers to guess)􏰂􏰂
   * it then asks each player to guess, checks the result, and either prints out information about the winning players(s) or asks them to guess again.
   **/

  //instantiate 3 players
  public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    //declare 3 variables to hold the 3 guesses
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    //declare 3 variables to hold true or false based on player's answer;
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    //making a 'target' number that the player have to guess
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thinking of a number between 0 and 9...");

    while(true) {
      System.out.println("Number to guess is " + targetNumber);

      p1.guess();
      p2.guess();
      p3.guess();

      guessp1 = p1.number;
      System.out.println("Player one guessed " + guessp1);

      guessp2 = p2.number;
      System.out.println("Player one guessed " + guessp2);

      guessp3 = p3.number;
      System.out.println("Player one guessed " + guessp3);

      if(guessp1 == targetNumber) {
        p1isRight = true;
      }
      if(guessp2 == targetNumber) {
        p2isRight = true;
      }
      if(guessp3 == targetNumber) {
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("We have a winner!");
        System.out.println("Player one got it right? " + p1isRight);
        System.out.println("Player two got it right? " + p2isRight);
        System.out.println("Player three got it right? " + p3isRight);
        System.out.println("Game is over");
        break;
      } else {
        System.out.println("Players will have to try again.");
      }
    } //end while loop
  } //end method
} //end class
