import java.io.InputStream;
import java.io.PrintStream;
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
    ModInt ans = new ModInt(2, mod);
    pw.println(
      ans.pow(n)
        .minus(1)
        .minus(combination(n, a))
        .minus(combination(n, b))
    );
  }

  static ModInt combination(int n, int a) {
    ModInt x = new ModInt(1, mod);
    ModInt y = new ModInt(1, mod);
    for (int i = 0; i < a; i++) {
      x = x.multiplicity(n - i);
      y = y.multiplicity(i + 1);
    }
    return x.divide(y);
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

    ModInt add(long m) {
      ModInt n = new ModInt(this);
      n.x += m;
      n.x %= mod;
      return n;
    }

    ModInt add(ModInt m) {
      return this.add(m.x);
    }

    ModInt minus(long m) {
      ModInt n = new ModInt(this);
      if ((n.x += (mod - m)) >= mod) {
        n.x -= mod;
      }
      return n;
    }

    ModInt minus(ModInt m) {
      return this.minus(m.x);
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

    @Override
    public String toString() {
      return String.valueOf(x);
    }
  }
}
