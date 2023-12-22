import java.util.Scanner;
import java.lang.String;
 
public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    solve(sc);
    sc.close();
  }
  
  private static void solve(Scanner sc) {
    String topCoStr = sc.next();
    char[] atCoStr = new char[topCoStr.length()];
    for (int i = 0; i < atCoStr.length; i++) {
      if (i % 2 == 0) {
        atCoStr[i] = 'g';
      } else {
        atCoStr[i] = 'p';
      }
    }
    
    int atCoPoint = 0;
    for (int k = 0; k < topCoStr.length(); k++) {
      if ((topCoStr.charAt(k) == 'g') && (atCoStr[k] == 'p')) {
        atCoPoint++;
      } else if ((topCoStr.charAt(k) == 'p') && (atCoStr[k] == 'g')) {
        atCoPoint--;
      }
    }
    
    System.out.println(atCoPoint);
  }
}