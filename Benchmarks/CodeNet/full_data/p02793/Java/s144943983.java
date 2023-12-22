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
      ModInt[] b = new ModInt[n];
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
        b[i] = new ModInt(1);
      }

      ArrayList<Integer> primes = MathLib.eratosthenesSieve(100000);
      for (int i : primes) {
        // 各素数について,いくつ含まれるかを数える
        int[] cnt = new int[n];
        ArrayList<ModInt> fac = new ArrayList<>();
        fac.add(new ModInt(1));
        boolean f = true;
        int max = 0;

        for (int j = 0; j < n; j++) {
          while (a[j] % i == 0) {
            a[j] /= i;
            cnt[j]++;
            max = Math.max(cnt[j], max);
          }
        }

        for (int j = 1; j <= max; j++) {
          fac.add(fac.get(fac.size() - 1).mul(i));
        }

        for (int j = 0; j < n; j++) {
          // out.println("b[" + j + "]: " + b[j].toString());
          b[j] = b[j].mul(fac.get(max - cnt[j]));
        }
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

