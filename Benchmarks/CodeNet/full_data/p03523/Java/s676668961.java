import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String key = "AKIHABARA";
    int s = 0;
    int k = 0;
    boolean ans = true;
    while (k < key.length()) {
      if( s >= S.length()
         || (S.charAt(s) != key.charAt(k))) {
        if (key.charAt(k) != 'A') {
          ans = false;
          break;
        }
      } else {
        s++;
      }
      k++;
    }
    System.out.println(s == S.length() && ans ? "YES" : "NO");
  }
}