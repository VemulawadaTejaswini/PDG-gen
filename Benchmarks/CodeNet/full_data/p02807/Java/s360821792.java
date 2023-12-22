import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DWangoB solver = new DWangoB();
    solver.solve(1, in, out);
    out.close();
  }

  static class DWangoB {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] x = new int[n];
      for (int i = 0; i < n; i++) {
        x[i] = in.nextInt();
      }

      ModInt res = new ModInt(0);
      ModComb mc = new ModComb(3000);
      mc.makeFac();
      if (n > 3000) {
        return;
      }
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          long dist = x[j] - x[i];
          int k = j - i;
          ModInt dif = new ModInt(dist).mul(mc.fac[n - 1]);
          if (j == n - 1) {
            // 1/k
            res = res.add(dif.mul(mc.inv[k].mul(mc.fac[k - 1])));
          } else {
            // 1/k(k+1)
            res = res.add(dif.mul(mc.inv[k + 1].mul(mc.fac[k - 1])));
          }
        }
      }

      out.println(res.toString());

    }

  }

  static class ModInt {

    private static int MOD = 1000000007;
    long x;

    ModInt(long l) {
      this.x = l % MOD;
    }

    ModInt add(ModInt mi) {
      return new ModInt(this.x + mi.x);
    }

    ModInt mul(long i) {
      return new ModInt(this.x * i);
    }

    ModInt mul(ModInt mi) {
      return new ModInt(this.x * mi.x);
    }

    ModInt pow(int p) {
      ModInt res = new ModInt(1);
      ModInt tmp = this;
      while (p > 0) {
        if ((p & 1) == 1) {
          res = res.mul(tmp);
        }
        tmp = tmp.mul(tmp);
        p /= 2;
      }
      return res;
    }

    ModInt inv() {
      return this.pow(MOD - 2);
    }

    public String toString() {
      return Integer.toString((int) this.x);
    }

  }

  static class ModComb {

    int size;
    ModInt[] fac;
    ModInt[] inv;

    ModComb(int n) {
      size = n;
      fac = new ModInt[n + 1];
      inv = new ModInt[n + 1];
    }

    void makeFac() {
      for (int i = 0; i <= size; i++) {
        if (i == 0) {
          fac[i] = new ModInt(1);
        } else {
          fac[i] = fac[i - 1].mul(i);
        }
        inv[i] = fac[i].inv();
      }


    }

  }
}

