import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextInt();
    String hundreds = s.substring(0, 1);
    String tens = s.substring(1, 2);
    String ones = s.substring(2, 3);
    
    String reverseOfS = hundreds + tens + ones;
    
    if (s.equals(reverseOfS)) {
      System.out.println("Yes");
    } else if {
      System.out.println("No");
    }
  }
}