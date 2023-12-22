import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int N = sn.nextInt();
    int M = sn.nextInt();
    int[] sc = new int[N];
    Arrays.fill(sc, -1);

    // Check inconsistency.
    for (int i = 0; i < M; i++) {
      int s = sn.nextInt();
      int c = sn.nextInt();
      if (sc[s - 1] == -1) {
        sc[s - 1] = c;
      } else if (sc[s - 1] != c) {
        System.out.println(-1);
        return;
      }
    }
    // starting with 0.
    if (sc[0] == 0 && N == 3 || sc[0] == 0 && N == 2) {
      System.out.println(-1);
      return;
    }

    int ans = sc[0];
    for (int i = 1; i < N; i++) {
      ans *= 10;
      int d = sc[i];
      if (d == -1) {
        d = 0;
      }
      ans += d;
    }
    System.out.println(ans);
  }
}
