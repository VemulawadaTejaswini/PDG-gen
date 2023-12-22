import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static PrintWriter writer = new PrintWriter(System.out);
  static final int TH = 200;

  public static void main(String[] args) {
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] sum = new int[M + 2];
    for (int i = 0; i < N; i++) {
      int L = Integer.parseInt(sc.next());
      int R = Integer.parseInt(sc.next());
      int prev = M + 100000;
      for (int j = 1; ; j++) {
        int l = L / j;
        int r = R / j;
        if (r < TH) break;
        sum[Math.max(TH, l)]++;
        if (r >= prev) {
          sum[prev]--;
        } else {
          sum[r + 1]--;
        }
        if (l < TH) break;
        prev = l;
      }
      for (int j = 1; j < Math.min(TH, M + 1); j++) {
        int lo = (L - 1) / j;
        int hi = R / j;
        if (lo != hi) {
          sum[j]++;
          sum[j + 1]--;
        }
      }
    }
    for (int i = 1; i <= M; i++) {
      sum[i] += sum[i - 1];
      writer.println(sum[i]);
    }
    writer.flush();
  }

}
