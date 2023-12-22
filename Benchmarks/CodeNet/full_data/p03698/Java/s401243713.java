import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[] c = new int[26];
    String ans = "yes";
    for (int i = 0; i < S.length(); i++) {
      char a = S.charAt(i);
      if (c[a-'a'] == 1) {
        ans = "no";
        break;
      }
      c[a-'a'] = 1;
    }
    
    System.out.println(ans);
  }
}