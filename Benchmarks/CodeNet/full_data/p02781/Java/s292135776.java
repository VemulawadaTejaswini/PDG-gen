// https://maspypy.com/atcoder-%E5%8F%82%E5%8A%A0%E6%84%9F%E6%83%B3-2019-02-09abc-154#toc4

import java.util.Scanner;

public class Main {
  //  static long[][] f;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String NS = sc.next();
    int[] N = new int[NS.length()];
    for (int i = 0; i < NS.length(); i++) {
      N[i] = NS.charAt(i) - '0';
    }
    int K = sc.nextInt();
    // f[K, N] := 0 以上 N 以下の整数で、 0 でない数字がちょうど K 個あるものの個数
    //    f = new long[K + 1][N.length + 1];
    System.out.println(f(N, N.length - 1, false, K));
  }

  static long f(int[] N, int d, boolean decreaseOne, int k) {
    if (d == 0) {
      switch (k) {
        case 0:
          return 1;
        case 1:
          return N[d] - (decreaseOne ? 1 : 0);
        default:
          return 0;
      }
    }
    if (decreaseOne) N[d]--;
    long ans = 0;
    if (k >= 1) { // case1: consume non-zero
      ans += f(N, d - 1, false, k - 1) * N[d]; // [1, N[d]]
      ans += f(N, d - 1, true, k - 1) * (9 - N[d]); // [N[d]+1, 9]
    }
    // case2: don't consume non-zero
    ans += f(N, d - 1, false, k);
    if (decreaseOne) N[d]++;
    return ans;
  }
}
