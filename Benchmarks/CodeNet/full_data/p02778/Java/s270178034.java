import java.util.*;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan1 = new Scanner(System.in);
    String input = scan1.next();
    String output = "";
    
    for(int i = 0; i < input.length(); i++)
    {
      output += "x";
    }
    
    System.out.println(output);
  }
}