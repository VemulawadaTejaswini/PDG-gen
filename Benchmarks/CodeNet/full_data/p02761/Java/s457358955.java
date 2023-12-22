import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] s = new int[M];
    int[] c = new int[M];
    for (int i = 0; i < M; i++) {
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();

    }
    sc.close();

    int ans = -1;

    int n0 = (int) Math.pow(10, N - 1);
    int n1 = (int) Math.pow(10, N) - 1;
    for (int i = n0; i <= n1; i++) {
      String v = String.valueOf(i);
      boolean m = true;
      for (int j = 0; j < M; j++) {
        int d = v.charAt(s[j] - 1) - '0';
        if (c[j] != d) {
          m = false;
          break;
        }
      }
      if (m) {
        ans = i;
        break;
      }
    }

    System.out.println(ans);
  }
}