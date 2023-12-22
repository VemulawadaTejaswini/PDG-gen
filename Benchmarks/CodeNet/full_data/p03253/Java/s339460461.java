import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    long ans = 1;
    long mod = 1000000007;

    // 因数分解した結果のべき乗の部分のみ
    int p[] = new int[10];
    int pCount = 0;
    int countSum = 0;

    int m = M;
    for (int i = 2; i <= Math.sqrt(m) + 1; i++) {
      if (M % i == 0) {
        for (int j = 0; j < 32; j++) {
          if (M % i == 0) {
            p[pCount]++;
            countSum++;
            M = M / i;
          } else {
            break;
          }
        }
        if (M == 1) {
          break;
        }
        pCount++;
      }
    }

    combination c = new combination(N + 50, mod);

    for (int i = 0; i < 10; i++) {
      ans = (ans * c.C(N - 1 + p[i], p[i])) % mod;
    }

    System.out.println(ans);

  }

  static class combination {
    public int n;
    public long p;
    public long factTable[];
    public long reverceTable[];

    public combination(int n, long p) {
      this.n = n;
      this.p = p;
      factTable = new long[n + 1];
      factTable[0] = 1;
      for (int i = 1; i <= n; i++) {
        factTable[i] = factTable[i - 1] * i % p;
      }
      reverceTable = new long[n + 1];
      reverceTable[0] = 1;
      reverceTable[n] = 1;
      long x = factTable[n];
      long m = p - 2;
      while (m > 0) {
        if ((m & 1) == 1) {
          reverceTable[n] = reverceTable[n] * x % p;
        }
        x = x * x % p;
        m >>= 1;
      }
      for (int i = n - 1; i > 0; i--) {
        reverceTable[i] = reverceTable[i + 1] * (i + 1) % p;
      }
    }

    public long C(int n, int r) {
      if (r < 0 || n < r) {
        return 0;
      } else if (r == n || r == 0) {
        return 1;
      } else {
        return (factTable[n] * reverceTable[r] % p) * reverceTable[n - r] % p;
      }
    }
  }
}