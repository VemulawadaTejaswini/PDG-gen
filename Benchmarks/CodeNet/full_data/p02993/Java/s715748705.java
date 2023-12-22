import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int cnt = 0;
    for (int i = 0; i < S.length() - 1; i++) {
      if (S.charAt(i) == S.charAt(i + 1)) {
        cnt++;
      }
    }
    if (cnt == 0) {
      System.out.println("Good");
    } else {
      System.out.println("Bad");
    }
  }
}
