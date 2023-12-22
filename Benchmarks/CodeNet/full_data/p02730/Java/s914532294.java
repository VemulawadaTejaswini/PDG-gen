
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String sreverse = new StringBuffer(s).reverse().toString();
    String shalf = s.substring(0,(s.length() -1)/2);
    String shalfReverse = new StringBuffer(shalf).reverse().toString();
    String shalf2 = s.substring((s.length() + 1) / 2,s.length());
    String shalf2Reverse = new StringBuffer(shalf2).reverse().toString();
    
    if(s.equals(sreverse) && shalf.equals(shalfReverse) && shalf2.equals(shalf2Reverse)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
