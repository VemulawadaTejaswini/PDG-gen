import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < S.length() - 2; i++) {
      int A = Integer.parseInt(S.substring(i, i + 3));
      int B = Math.abs(753 - A);
      ans = Math.min(ans, B);
    }
    System.out.println(ans);
  }
}
