import java.util.*;
 
public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine();
    
    if ((input.equals("AAA")) || (input.equals("BBB"))){
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
    //System.out.println(input);
    //scanner.close();
  }
}