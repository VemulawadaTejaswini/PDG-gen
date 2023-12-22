import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int x = 0;
    String plus = "+";
    String minus = "-";
    
    for (int i = 0; i <= 4; i++) {
      String y = scan.next();
      
      if (y.equals(plus)) {
        x = x + 1;
      }
      
      if (y.equals(minus)) {
        x = x - 1;
      }
    }
    
    System.out.println(x);
  }
}
