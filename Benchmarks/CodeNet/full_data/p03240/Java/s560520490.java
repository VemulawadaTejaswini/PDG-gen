import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[100];
    int[] y = new int[100];
    long[] h = new long[100];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      h[i] = sc.nextLong();
    }
    for (int cx = 0; cx <= 100; cx++) {
      for (int cy = 0; cy <= 100; cy++) {
        int same_count = 0;
        long height = Math.abs(x[0] - cx) + Math.abs(y[0] - cy) + h[0];
        for (int i = 1; i < N; i++) {
          long tmp = Math.abs(x[i] - cx) + Math.abs(y[i] - cy) + h[i];
          if (height == tmp) {
            same_count++;
          }
        }
        if (same_count == N - 1) {
          System.out.println(cx + " " + cy + " " + height);
          return;
        }
      }
    }
  }
}