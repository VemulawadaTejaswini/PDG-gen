// ggppgggpgg
// 0123456789
// 0112233445
// 0101010101
// 0011010101
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    int pnum = 0;
    int lose = 0;
    for (int i = 0; i < s.length; i++) {
      if (i%2 == 1) {
        pnum++;
      }
      if (s[i] == 'p') {
        if (pnum > 0) {
          pnum--;
        } else {
          lose++;
        }
      }
    }
    
    int win = 0;
    int start = s.length - 2*pnum + (s.length%2 == 0 ? 1 : 0);
    for (int i = start; i < s.length && pnum > 0; i++) {
      if (s[i] == 'g') {
        win++;
        pnum--;
      }
    }
    
    System.out.println(win - lose);
  }
}