import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int[] xs = new int[N];
      int[] ys = new int[N];
      int[] hs = new int[N];
      for (int i = 0; i < N; i++) {
        xs[i] = sc.nextInt();
        ys[i] = sc.nextInt();
        hs[i] = sc.nextInt();
      }
      for (int i = 0; i <= 100; i++) {
        out : for (int j = 0; j <= 100; j++) {
          int H = hs[0] + Math.abs(xs[0] - i) + Math.abs(ys[0] - j);
          if (H < 1) continue out;
          for (int k = 1; k < N; k++) {
            if (H != hs[k] + Math.abs(xs[k] - i) + Math.abs(ys[k] - j)) {
              continue out;
            }
          }
          System.out.println(String.format("%d %d %d", i, j, H));
        }
      }
    }
  }
}
