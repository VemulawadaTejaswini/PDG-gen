import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  private void solve() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      String[] ln = in.readLine().split(" ");
      final int A = atoi(ln[0]);
      final int B = atoi(ln[1]);
      final int Q = atoi(ln[2]);

      long[] s = new long[A+1];
      for (int i = 0; i < A; i++) {
        s[i] = atol(in.readLine());
      }
      s[A] = 1L << 40;

      long[] t = new long[B+1];
      for (int i = 0; i < B; i++) {
        t[i] = atol(in.readLine());
      }
      t[B] = 1L << 40;

      for (int q = 0; q < Q; q++) {
        long x = atol(in.readLine());
        long dist = 1L << 50;

        for (int c = 0; c < 2; c++) {
          long[] af = c == 0 ? s : t;
          long[] as = c == 0 ? t : s;

          for (int i = 0; i < 2; i++) {
            int posF = binarySearch(af, x) + i;
            long df = af[posF];

            for (int j = 0; j < 2; j++) {
              int posS = binarySearch(as, x) + j;
              long ds = as[posS];
              
              long d = Math.abs(x - df);
              d += Math.abs(df - ds);
              dist = Math.min(dist, d);
            }
          }
        }

        out.println(dist);
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s); }

  private int binarySearch(long[] arr, long x) {
    int left = 0;
    int right = arr.length;

    while(right - left > 1) {
      int mid = (left + right) / 2;
      if(arr[mid] <= x)  left = mid;
      else right = mid;
    }
    return left;
  }
}