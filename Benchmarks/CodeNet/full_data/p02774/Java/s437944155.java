import java.util.Arrays;
import java.util.Scanner;

// ref. https://atcoder.jp/contests/abc155/submissions/10152895
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);

    long l = -1000_000_000_000_000_000L;
    long r = 1000_000_000_000_000_000L;
    //    long l = -20;
    //    long r = 20;
    while (l + 1 < r) {
      long kThProd = (l + r) / 2;
      long cnt = countPairLessThan(kThProd, A);
      if (cnt < K) { // Find 'cnt == K -1', then 'kThProd' is K-th smallest product.
        l = kThProd; // l:ok.
      } else {
        r = kThProd; // r:ng.
      }
    }
    System.out.println(l);
  }

  private static long countPairLessThan(long m, long[] A) {
    long tot = 0;
    for (long a : A) {
      int l = -1, r = A.length;
      if (a > 0) {
        while (l + 1 < r) {
          int c = (l + r) / 2;
          if (a * A[c] < m) l = c; // l:ok, r:ng
          else r = c;
        }
        tot += l + 1; // Because index starts with 0. OK count is (l+1).
      } else {
        while (l + 1 < r) {
          int c = (l + r) / 2;
          if (a * A[c] < m) r = c; // l:ng, r:ok
          else l = c;
        }
        tot +=
            A.length - (l + 1); // Remove NG count. Because index starts with 0. NG count is (l+1).
      }
      if (a * a < m) tot--;
    }

    return tot / 2;
  }
}

// i < j
// Search m, where count(a*x <= m) equals K
// -----------------
// condition of a | count where | count
// -----------------
// a > 0: x <= m/a | |
// a== 0:          | | num-zero * x
// a < 0: x >= m/a | | N- count(x < m/a) <=> N-count(x <= m/a -1)
//   ref: 3/(-2) => -1
