import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
    EFlatten solver = new EFlatten();
    solver.solve(1, in, out);
    out.close();
  }

  static class EFlatten {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      ModInt mi = new ModInt(0);
      int n = in.nextInt();
      int[] a = new int[n];
      int[] aa = new int[n];
      ModInt[] b = new ModInt[n];
      ModInt lcm = new ModInt(1);
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
        aa[i] = a[i];
        b[i] = new ModInt(1);
      }

      ArrayList<Integer> primes = MathLib.eratosthenesSieve(100);
      for (int i : primes) {
        // 各素数について,いくつ含まれるかを数える
        int[] cnt = new int[n];
        boolean f = true;
        int max = 0;

        for (int j = 0; j < n; j++) {
          while (a[j] % i == 0) {
            a[j] /= i;
            cnt[j]++;
            max = Math.max(cnt[j], max);
          }
        }
        lcm = lcm.mul(new ModInt(i).pow(max));
      }

      for (int i = 0; i < n; i++) {
        lcm = lcm.mul(a[i]);
      }

      for (int i = 0; i < n; i++) {
        b[i] = lcm.div(aa[i]);
      }

      for (ModInt m : b) {
        mi = mi.add(m);
      }

      out.println(mi.toString());
    }

  }

  static class ModInt {

    private static int MOD = 1000000007;
    long x;

    public ModInt(int i) {
      this.x = i % MOD;
    }

    public ModInt(long l) {
      this.x = l % MOD;
    }

    public ModInt add(ModInt mi) {
      return new ModInt(this.x + mi.x);
    }

    public ModInt mul(long i) {
      return new ModInt(this.x * i);
    }

    public ModInt mul(ModInt mi) {
      return new ModInt(this.x * mi.x);
    }

    public ModInt div(long mi) {
      return this.mul(new ModInt(mi).inv());
    }

    public ModInt pow(int p) {
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

    public ModInt inv() {
      return this.pow(MOD - 2);
    }

    public String toString() {
      return Integer.toString((int) this.x);
    }

  }

  static class MathLib {

    public static ArrayList<Integer> eratosthenesSieve(int n) {
      ArrayList<Integer> prime = new ArrayList<>();
      ArrayList<Integer> nums = new ArrayList<>();
      for (int i = 2; i <= n; i++) {
        nums.add(i);
      }
      while (nums.get(0) <= Math.sqrt(n)) {
        int nxtPrime = nums.get(0);
        prime.add(nxtPrime);
        nums.removeIf(x -> (x % nxtPrime == 0));
      }
      prime.addAll(nums);
      return prime;
    }

  }
}

