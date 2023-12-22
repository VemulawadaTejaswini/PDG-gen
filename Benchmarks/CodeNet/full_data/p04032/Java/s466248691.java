import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int a = -1;
    int b = -1;

    int min = Math.min(s.length(), 100);
    LABEL: for (int i = 3; i <= min; i++) {  // 抽出文字数
      int khs = (i / 2) + (i % 2 == 0 ? 0 : 1);
      int mojisu = s.length() - i - 1;
      for (int j = 0; j <= mojisu; j++) { // 何文字目から抽出するか
        int cnt = 0;
        String t = s.substring(j, j + i);
        for (int k = 0; k <= i - 1; k++) { // 何文字目をマッチングするか
          int chk = 0;
          for (int l = 0; l <= i - 1; l++) { // マッチング
            String u1 = t.substring(k, k + 1);
            String u2 = t.substring(l, l + 1);
            if (k != l && u1.equals(u2)) cnt++;
            // System.out.println("j:" + j + " t:" + t + " k:" + k + " l:" + l + " u1:" + u1 + " u2:" + u2 + " cnt:" + cnt);
          }
          if (cnt >= khs) {
            a = j + 1;
            b = j + i;
            break LABEL;
          }
        }
      }
    }

    System.out.println(a + " " + b);

  }
}