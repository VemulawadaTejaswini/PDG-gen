import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String w = sc.next();

    String ans = "Yes";
    for (int i = 0; i < w.length(); i++) {
      String a = w.substring(i, i + 1);
      int cnt = 0;
      for (int j = 0; j < w.length(); j++) {
        String b = w.substring(j, j + 1);
        if (a.equals(b)) cnt++;
      }
      if (cnt % 2 != 0) {
        ans = "No";
        break;
      }
    }

    System.out.println(ans);
  }
}