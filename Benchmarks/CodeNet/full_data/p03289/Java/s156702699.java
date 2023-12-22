import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    int countC = 0;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (i == 0) {
        if (c != 'A') {
          System.out.println("WA");
          return;
        }
      } else if (2 <= i && i <= S.length() - 2 && c == 'C') {
        countC++;
      } else {
        if (!('a' <= c && c <= 'z')) {
          System.out.println("WA");
          return;
        }
      }
    }
    if (countC != 1) {
      System.out.println("WA");
      return;
    }

    System.out.println("AC");
  }
}