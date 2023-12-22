import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String s = sc.next();
      int n = s.length();

      String a = s.substring(0, n/2);
      String b = s.substring(n/2+1, n);

      boolean ans = isKaibun(a) && isKaibun(b) && isKaibun(s);
      System.out.println(ans ? "Yes" : "No");
    } finally {
      sc.close();
    }
  }

  private static boolean isKaibun(String s) {
    boolean ans = true;
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) ans = false;
    }
    return ans;
  }
}
