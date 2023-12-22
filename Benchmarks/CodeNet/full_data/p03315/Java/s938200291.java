import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int x = 0;
    String str = scan.next();
    String plus = "+";
    String minus = "-";
    
    for (int i = 0; i <= 4; i++) {
      char ch = str.charAt(i);
      
      if (ch.equals(plus)) {
        x = x + 1;
      }
      
      if (ch.equals(minus)) {
        x = x - 1;
      }
    }
    
    System.out.println(0);
  }
}
