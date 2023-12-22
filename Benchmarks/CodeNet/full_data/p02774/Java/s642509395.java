import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static long mod = 1000000007;

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    long ans = BigInteger.valueOf(2).modPow(
      BigInteger.valueOf(n), BigInteger.valueOf(mod)
    ).longValue();
    ModInt m = new ModInt(ans, mod);
    m = m.minus(1);
    m = m.minus(combination(n, a));
    m = m.minus(combination(n, b));
    pw.println(
      m.x
    );
  }

  static long combination(int n, int a) {
    long x = 1;
    long y = 1;
    for (int i = 0; i < a; i++) {
      x *= n - i;
      x %= mod;
      y *= i + 1;
      y %= mod;
    }
    return new ModInt(x, mod).divide(new ModInt(y, mod)).x;
  }

  static class ModInt {

    private final long mod;
    private long x;

    ModInt(long x, long mod) {
      this.x = x;
      this.mod = mod;
    }

    ModInt(ModInt m) {
      this.x = m.x;
      this.mod = m.mod;
    }

    ModInt minus(long m) {
      ModInt n = new ModInt(this);
      if ((n.x += (mod - m)) >= mod) {
        n.x -= mod;
      }
      return n;
    }

    ModInt multiplicity(long m) {
      ModInt n = new ModInt(this);
      n.x *= m;
      n.x %= mod;
      return n;
    }

    ModInt pow(long p) {
      if (p == 0) {
        return new ModInt(1, mod);
      }
      ModInt a = pow(p >> 1);
      a = a.multiplicity(a.x);
      if ((p & 1) == 1) {
        a = a.multiplicity(x);
      }
      return a;
    }

    ModInt inv() {
      return pow(mod - 2);
    }

    ModInt divide(ModInt d) {
      ModInt n = new ModInt(this);
      n = n.multiplicity(d.inv().x);
      return n;
    }
  }
}
