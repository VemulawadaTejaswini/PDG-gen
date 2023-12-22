import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] x = new int[N];
    int s = -1;
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt();
      if (x[i] >= 0 && s < 0) s = i;
    }
    long min = Long.MAX_VALUE;
    if (s >= K) min = Math.abs(x[s - K]);
    if (s + K <= N && min > x[s + K - 1]) min = x[s + K - 1];
    for (int i = -K + 1; i <= K - 2; i++) {
      int t1 = s + i;
      int t2 = s + i + (i < 0 ? (K - 1) : (-K + 1));
      if (t1 < 0 || t1 >= N || t2 < 0 || t2 >= N) continue;
      long d = 2 * Math.abs(x[t1]);
      d += Math.abs(x[t2]);
      if (d < min) min = d;
    }
    System.out.println(min);
  }
}
