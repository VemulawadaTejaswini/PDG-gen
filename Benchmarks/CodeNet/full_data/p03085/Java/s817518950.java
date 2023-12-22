import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner (System.in);
    String userInput = input.nextLine();

    if (userInput.equals("a") || userInput.equals("A"))
    {
       System.out.println("T");
    }
    else if (userInput.equals("t") || userInput.equals("T"))
    {
       System.out.println("A");
    }
    else if (userInput.equals("g") || userInput.equals("G"))
    {
       System.out.println("C");
    }
    else if (userInput.equals("c") || userInput.equals("C"))
    {
       System.out.println("G");
    }
  }
}
