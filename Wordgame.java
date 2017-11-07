import java.util.Scanner;

class Wordgame
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int secretNumber = 37;
    int userGuess = -1;
  //  System.out.println("What is a number bettween 1 and 100");
  //  userGuess = scan.nextInt();

    while(userGuess != secretNumber)
    {
      System.out.println("What is a number bettween 1 and 100");
      userGuess = scan.nextInt();
      if(userGuess > secretNumber)
      {
        System.out.println("That was to high. ");
      }
      else
      {
        if(userGuess < secretNumber)
        {
          System.out.println("That was to low. ");
        }
        else
        {
          break;
        }
    }
    }

    System.out.print("You are right!");
  }
}
