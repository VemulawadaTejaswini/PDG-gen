import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cnt = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        for (int j = i; j < s.length(); j++) {
          if (s.charAt(j) == 'Z') {
            cnt = j - i + 1;
            max = Math.max(cnt, max);
          }
        }
      }
    }
    System.out.println(max);
  }
}
