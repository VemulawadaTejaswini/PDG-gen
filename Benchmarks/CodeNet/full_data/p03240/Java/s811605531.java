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
        long H = h[0] + Math.abs(x[0] - cx) + Math.abs(y[0] - cy);
        boolean end = true;
        if (H <= 0) {
          end = false;
        }
        for (int i = 0; i < N; i++) {
          if (h[i] != Math.max(H - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0)) {
            end = false;
          }
        }
        if (end) {
          System.out.println(cx + " " + cy + " " + H);
        }
      }
    }
  }
}