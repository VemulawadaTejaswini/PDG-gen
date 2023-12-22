import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    final long MOD = 1000000000 + 7;

    while (in.hasNext()) {
      int N = in.nextInt();
      long K = in.nextLong();
      int[] A = new int[N];

      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt();
      }

      int[] smaller = new int[N];
      long countRev = 0;
      for (int i = 0; i < A.length; ++i) {
        for (int j = 0; j < A.length; ++j) {
          if (A[i] > A[j]) {
            ++smaller[i];

            if (i < j) {
              ++countRev;
            }
          }
        }
      }

      countRev *= K;
      countRev %= MOD;
      
      long base = (K * (K - 1)) / 2;

      for (int i = 0; i < smaller.length; ++i) {
        countRev = (countRev + (smaller[i] * base) % MOD) % MOD;
      }

      System.out.println(countRev);
    }
  }
}