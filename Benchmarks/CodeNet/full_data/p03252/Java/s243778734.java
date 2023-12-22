import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    
    char[] src = new char[26];
    char[] dst = new char[26];
    
    for (int i = 0; i < S.length(); i++) {
      char s = S.charAt(i);
      char t = T.charAt(i);
      if (src[s-'a'] == 0 || dst[t-'a'] == 0) {
        src[s-'a'] = t;
        dst[t-'a'] = s;
      } else {
        if (src[s-'a'] != t || dst[t-'a'] != s) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}