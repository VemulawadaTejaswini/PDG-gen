import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] p = new int[m];
    String[] s = new String[m];

    int w = 0;
    int a = 0;

    if (m != 0) {
      for (int i = 0; i < m; i++) {
        p[i] = sc.nextInt();
        s[i] = sc.next();
      }

      int w1 = 0;
      int a1 = 0;

      for (int i = 0; i < m; i++) {
        if (s[i].equals("WA")) {
          w1 = p[i];
          break;
        }
      }

      for (int i = 0; i < m; i++) {
        if (s[i].equals("AC")) {
          a1 = p[i];
          break;
        }
      }

      for (int i = 0; i < m; i++) {
        if (s[i].equals("WA")) {
          if (w1 == p[i]) {
            w = 1;
          } else {
            w += p[i] - w;
          }
        }

        if (s[i].equals("AC")) {
          if (a1 == p[i]) {
            a = 1;
          } else {
            a += p[i] - a;
          }
        }
      }
    }

    System.out.println(a+" "+w);

  }


}
