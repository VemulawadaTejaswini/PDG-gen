import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String hundreds = s.substring(0, 1);
    String tens = s.substring(1, 2);
    String ones = s.substring(2, 3);
    
    String reverseOfS = ones + tens + hundreds;
    
    if (s.equals(reverseOfS)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}