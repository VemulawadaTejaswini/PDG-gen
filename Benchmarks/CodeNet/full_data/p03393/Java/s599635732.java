import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (S.length() < 26) {
      for (char c = 'a';;c++) {
        if (S.indexOf(c) == -1) {
          System.out.println(S + c);
          break;
        }
      }
    } else {
      int place[] = new int[26];
      for (int i=0; i<26; i++) {
        place[S.charAt(i) - 'a'] = i;
      }
      boolean okay = false;
      for (int i=24; i>=0; i--) {
        char s = S.charAt(i);
        for (char c = s; c < 'z';) {
          c++;
          if (place[c - 'a'] > i) {
            System.out.println(S.substring(0, i) + c);
            i = -1;
            okay = true;
            break;
          }
        }
      }
      if (!okay) {
        System.out.println(-1);
      }
    }
  }
}