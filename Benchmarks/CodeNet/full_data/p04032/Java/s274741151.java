import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int n = s.length();

    for (int i = 2; i <= n; i++) { // 文字数
      for (int j = 0; j < (n - i + 1); j++) { // 開始位置
        char[] chk = s.substring(j, j + i).toCharArray();
        int max = 0;
        for (int k = 0; k < chk.length; k++) {
          char x = chk[k];
          int cnt = 0;
          for (int l = 0; l < chk.length; l++) {
            char y = chk[l];
            if (x == y) cnt++;
            // if (j == 0 && i == 3) System.out.println("x:" + x + " y:" + y + " k:" + k + " l:" + l + " cnt:" + cnt + " lng:" + chk.length);
          }
          max = Math.max(cnt, max);
        }
        if (max > (int)(chk.length / 2)) {
          System.out.println(j + 1 + " " + (j + i));
          return;
        }
      }
    }
    
    System.out.println("-1 -1");
  }
}