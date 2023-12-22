import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    long N = 1_000_000_007L;
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    char[] s = str.toCharArray();
    long numC = 0;
    int totalQ = 0;
    for (char value : s) {
      if (value == 'C') numC++;
      if (value == '?') totalQ++;
    }

    long[][] comb = choose(totalQ, N);
    long numA = 0;
    int numQ = 0;
    long ans = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == 'A') {
        numA++;
      } else if (s[i] == 'C') {
        numC--;
      } else if (s[i] == 'B') {
        long left = 0;
        for (int j = 0; j <= numQ; j++) {
          left += (j + numA) * (comb[numQ][j] * modpow(2L, (numQ - j), N) % N);
          left %= N;
        }
        left %= N;
        long right = 0;
        for (int j = 0; j <= totalQ - numQ; j++) {
          right += (j + numC) * (comb[totalQ - numQ][j] * modpow(2L, (totalQ - numQ - j), N) % N);
          right %= N;
        }
        ans += left * right;
        ans %= N;
      } else {
        long left = 0;
        for (int j = 0; j <= numQ; j++) {
          left += (j + numA) * (comb[numQ][j] * modpow(2L, (numQ - j), N) % N);
          left %= N;
        }
        left %= N;
        long right = 0;
        for (int j = 0; j < totalQ - numQ; j++) {
          right += (j + numC) * (comb[totalQ - numQ - 1][j] * modpow(2L, (totalQ - numQ - 1 - j), N) % N);
          right %= N;
        }
        ans += left * right;
        ans %= N;
        numQ++;
      }
    }
    System.out.println(ans);
  }

  public static long[][] choose(int n, long mod) {
    long[][] C = new long[n + 1][n + 1];
    for (int i = 0; i <= n; i++) C[i][0] = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % mod;
      }
    }
    return C;
  }

  public static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }
}
