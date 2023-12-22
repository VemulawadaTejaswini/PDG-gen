import java.util.*;
import java.io.*;

public class Main {

  private long MOD = (long) 1e9 + 7l;
  void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    long[] arr = new long[n];
    long[] inv = new long[n];
    long max = 0;
    long gcd = 0;
    long lcm = 1;
    for (int i = 0; i < n; ++i) {
      arr[i] = in.nextLong();
      inv[i] = inv(arr[i]);
      gcd = gcd(gcd, arr[i]);
      max = Math.max(max, arr[i]);
      lcm = lcm(lcm, arr[i]);
    }

    if (gcd == 1) {
      
      long ans = 0;
      for (int i = 0; i < n; ++i) {
        long toAdd = (lcm * inv[i]) % MOD;
        ans = (ans + toAdd) % MOD;
      }

      out.println(ans);

    } else {
      long ans = 0;
      for (int i = 0; i < n; ++i) {
        ans = (ans + max / arr[i]) % MOD;
      }
      out.println(ans);
    }
  }

  public long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public long lcm(long a, long b) {
    long ret = (a * b) % MOD;
    ret = (ret * inv(gcd(a, b))) % MOD;
    return ret;
  }

  public long inv(long a) {
    return pow(a, MOD - 2);
  }

  public long pow(long a, long b) {
    if (b == 0) return 1;
    if (b == 1) return a % MOD;
    long p = pow (a, b >> 1);
    p = (p * p) % MOD;
    p = (p * pow(a, b % 2)) % MOD;
    return p;
  }

  public static void main(String[] args) throws Exception {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Main solver = new Main();
    solver.solve(in, out);
    out.close();
  }

  static class InputReader {
    BufferedReader in;
    StringTokenizer st;

    public InputReader(InputStream is) {
      in = new BufferedReader(new InputStreamReader(is));
    }

    public String next() {
      try {
        while (st == null || !st.hasMoreTokens()) {
          st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}
