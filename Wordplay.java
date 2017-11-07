import java.util.Scanner;

class Wordplay
{
  public static void main(String[] args)
  {
    //This insults the person after asking for their name.
    Scanner input = new Scanner(System.in);
    System.out.println("Tell me your name.");
    String name = input.nextLine();
    String insultedName = insult(name);
    System.out.println(insultedName);

    //This makes a person say two words then go first + second + second +first.
    System.out.print("Give me a first word: ");
    String first = input.nextLine();
    System.out.print("Give me a second word: ");
    String second = input.nextLine();
    System.out.println(makeAbba(first, second));

    //This asks someone their name and then says "Hello their name".
    System.out.print("Tell me your name ");
    String name1 = input.nextLine();
    System.out.println(helloName(name1));

    //This will make a tag after asking for user input on the parts.
    System.out.print("Give me a first word for your tag ");
    String firstTag = input.nextLine();
    System.out.print("Give me a second word for your tag ");
    String secondTag = input.nextLine();
    System.out.println(makeTags(firstTag, secondTag));

    //It makes the last two letters triple.
    System.out.print("Give me a word to give you the last two words tripled ");
    String oneString = input.nextLine();
    System.out.println(extraEnd(oneString));

    //This makes the first two chars of the String given.
    System.out.print("Give me your Word to get the first two chars ");
    String startofWord = input.nextLine();
    System.out.println(firstTwo(startofWord));

    //This will print out half of the provided word.
    System.out.print("Give me a word to cut in half ");
    String halfofWord = input.nextLine();
    System.out.println(half(halfofWord));

    //This will cut the first and last letter off a word.
    System.out.print("Give me a word for me to take the last and first letter off. ");
    String midWord = input.nextLine();
    System.out.println(withoutEnd(midWord));

    //This will make a string that is a combo of the two given.
    System.out.print("Give me the first string: ");
    String firstString = input.nextLine();
    System.out.print("Give me the second string: ");
    String secondString = input.nextLine();
    System.out.println(comboString(firstString, secondString));

    //This will take the first letter off two words and then combine them together.
    System.out.print("Give me a first word for your combo. ");
    String comboOne = input.nextLine();
    System.out.print("Give me a second word for your combo. ");
    String comboTwo = input.nextLine();
    System.out.println(nonStart(comboOne, comboTwo));
  }

  public static String insult(String n)
  {
    return n + ", you slimy weasel.";
  }

  public static String makeAbba(String a, String b)
  {
    return a + b + b + a;
  }

  public static String helloName(String name)
  {
    return "Hello " + name + "!";
  }

  public static String makeTags(String tag, String word)
  {
    return "<"+tag+">"+word+"</"+tag+">";
  }

  public static String extraEnd(String str)
  {
    int a = str.length();
    int c = a-2;
    String sub = str.substring(c,a);
    return sub + sub + sub;
  }


  public static String firstTwo(String str)
  {
    int a = str.length();
    if(a ==1)
    {
      return "a";
    }
    if(a==0)
    {
      return "";
    }
    char first = str.charAt(0);
    char second = str.charAt(1);
    return "" + first + second;
  }

  public static String half(String str)
  {
    int a = str.length();
    int b = a/2;
    String sub = str.substring(0,b);
    return sub;
  }

  public static String withoutEnd(String str)
  {
    int a = str.length();
    String sub = str.substring(1,a-1);
    return sub;
  }

  public static String comboString(String a, String b)
  {
    int c = a.length();
    int d = b.length();
    if(c >= d)
    {
      return b+a+b;
    }
    else
    {
      return a+b+a;
    }
  }

  public static String nonStart(String a, String b)
  {
    int aa = a.length();
    int bb = b.length();
    String aLength = a.substring(1,aa);
    String bLength = b.substring(1,bb);
    return aLength+bLength;
  }
}
