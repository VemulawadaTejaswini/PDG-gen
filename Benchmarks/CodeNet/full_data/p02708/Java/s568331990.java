import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long n = Long.parseLong(sc.next());
    long k = Long.parseLong(sc.next());
    ModInt ans = new ModInt(0, 1000000000 + 7);
    long min = LongStream.range(0, k - 1).sum();
    long max = LongStream.rangeClosed(n - k + 2, n).sum();
    for (long i = k; i <= n + 1; i++) {
      min += i - 1;
      max += (n - i + 1);
      ans = ans.add(max - min + 1);
    }
    pw.println(ans);
  }


  static class ModInt {

    final long mod;
    long x;

    ModInt(long x, long mod) {
      this.x = x;
      this.mod = mod;
    }

    ModInt(ModInt m) {
      this.x = m.x;
      this.mod = m.mod;
    }

    ModInt add(long m) {
      this.x += m;
      this.x %= mod;
      return this;
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
