import java.util.Scanner;

public class Calculator
{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //This tells if a number is even.
    System.out.print("Please type a number and I will tell you if it is even: ");
    int userNum = input.nextInt();
    System.out.println("commencing tests...");
    System.out.println(userNum + " is even: " + isEven(userNum));
    System.out.println("3 is even: " + isEven(3));
    System.out.println("");
    System.out.println("8 is dividable by 5 : " + isDivisable(8,5));
    System.out.println("");

    //This will tell if a number given by user is in a range given by user.
    System.out.print("Please type a number you would like to use as your number. ");
    int userInt = input.nextInt();
    System.out.print("Please type a number you want to use as your maximum of your range. ");
    int userMax = input.nextInt();
    System.out.print("Please type a number you want to use as your minimum of your range. ");
    int userMin = input.nextInt();
    System.out.println(inRange(userInt, userMin, userMax));

    //This will print out two numbers inclusive sum of the intagers.
    System.out.print("PLease give me a number. ");
    int firstNum = input.nextInt();
    System.out.print("Please give me another number. ");
    int secondNum = input.nextInt();
    System.out.println("The sum of the numbers bettween them is " + sumFrom(firstNum, secondNum));

    //This will print out weather a number is divisable by another number.
    System.out.print("Give me a dividend. ");
    int dividend = input.nextInt();
    System.out.print("Give me a divisor. ");
    int divisor = input.nextInt();
    System.out.println("Dividend is divisable by divisor: " + isDivisable(dividend, divisor));

    //This will give the user the number provided in celcious.
    System.out.print("What number would you like in Celcious. ");
    double f = input.nextDouble();
    System.out.println("Your number in celcious is " + fahrenheitToCelsius(f));

    //This will calculate the number squared.
    System.out.print("What number would you like to square. ");
    int square = input.nextInt();
    System.out.println("Your number squared is " + square(square));

    //This will claculate the average of the two numbers.
    System.out.print("What is your first average number. ");
    int firstAverage = input.nextInt();
    System.out.print("What is your second average number. ");
    int secondAverage = input.nextInt();
    System.out.println("Your average of the two numbers is "+ average(firstAverage, secondAverage));

    //This will multiply two numbers given.
    System.out.print("What is the number you want to multiply. ");
    int firstMult = input.nextInt();
    System.out.print("What is the other number you want to multiply. ");
    int secondMult = input.nextInt();
    System.out.println("Your product is " + multiply(firstMult, secondMult));

    //This will add ten to a given number.
    System.out.print("What is the number you want to add ten to? ");
    int userTen = input.nextInt();
    System.out.println("Your number + ten is " + add10(userTen));

    //This will double a numher.
    System.out.print("What is your number you want to double? ");
    int userDouble = input.nextInt();
    System.out.println("Your number doubled is " +doubleNumber(userDouble));




    }
//this will print out weather a number is false or true
 public static boolean isEven(int n)
      {
        if(n % 2 == 0)
         {
           return true;
         }
         else
         {
           return false;
         }
      }
  //This will print out weather a number is divisable by another number.
  public static boolean isDivisable(int num, int divisor)
  {
    if(num % divisor == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static boolean inRange(int num, int min, int max)
{
    if(num>=min && num<=max)
    {
        return true;
    }
    else
    {
        return false;
    }
}

public static int sumFrom(int a, int b)
{
        int i = (((b-a+1)*(a+b))/2);
        return i;
}
public static boolean isDivisible(int a, int b)
{
    if((a%b)==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

public static double fahrenheitToCelsius(double degrees)
{
    double i = 5;
    double o = 9;
    double t = i/o;
    double c = ((t)*(degrees-32));
    return c;
}

public static int square(int x)
{
    return x*x;
}

public static double average(double x,double y)
{
    return (x+y)/2;
}

public static int multiply(int a, int b)
   {
       return a*b;
   }

public static int add10(int a)
   {
      return a+10;
  }

     public static int doubleNumber(int x)
     {
         return 2 * x;
     }

}
