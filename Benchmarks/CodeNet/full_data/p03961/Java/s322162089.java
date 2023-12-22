import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  void run() {
    int n = ni();
    TreeSet<Integer> notExistInPset = new TreeSet<>();
    for (int i = 0; i < n; ++i) {
      notExistInPset.add(i);
    }
    int[] p = new int[n];
    int k = 0;
    int[] countWildCardUntilPrev = new int[n];
    for (int i = 0; i < n; ++i) {
      countWildCardUntilPrev[i] = k;
      p[i] = ni() - 1;
      if (p[i] < 0) {
        ++k;
      } else {
        notExistInPset.remove(p[i]);
      }
    }
    int sumOfNotExistInP = notExistInPset.stream().reduce(0, (a, b) -> a + b);

    long[] factorial = new long[n + 1];
    factorial[0] = 1;
    for (int i = 1; i <= n; ++i) {
      factorial[i] = i * factorial[i - 1];
      factorial[i] %= MOD;
    }

    int[] countIfSjSmallerThanSi = new int[n];
    BIT<Integer> bit = new BIT<>(n, (a, b) -> a + b, () -> 0);
    for (int i = 0; i < n; ++i) {
      if (p[i] >= 0) {
        bit.update(p[i] + 1, 1);
        countIfSjSmallerThanSi[i] = bit.reduce(p[i], () -> 0);
      }
    }

    ArrayList<Integer> notExitstInPlist = new ArrayList<>(notExistInPset);
    Collections.sort(notExitstInPlist);

    long unko = 0;
    if (k > 1) {
      ArrayList<Integer> list = new ArrayList<>(notExistInPset);
      for (int si : list) {
        notExistInPset.remove(si);
        int num = notExistInPset.headSet(si).size();
        unko += num * factorial[k - 2];
        unko %= MOD;
        notExistInPset.add(si);
      }
    }

    long[] LUT = new long[n];
    long last = 0;
    for (int i = 0; i < n; ++i) {
      if (p[i] < 0) {
        LUT[i] = last;
        continue;
      }
      int num = -Collections.binarySearch(notExitstInPlist, p[i]) - 1;
      num = notExitstInPlist.size() - num;
      LUT[i] += num * factorial[k - 1];
      LUT[i] %= MOD;
      LUT[i] += last;
      LUT[i] %= MOD;
      last = LUT[i];
    }

    long sum = 0;
    for (int i = 0; i < n; ++i) {
      long sub = 0;
      if (p[i] >= 0) {
        sub += p[i] * factorial[k];
        sub %= MOD;
        sub -= countIfSjSmallerThanSi[i] * factorial[k];
        sub += (Math.abs(sub / MOD) + 1) * MOD;
        sub %= MOD;
        if (k > 0) {
//          int num = notExistInPset.headSet(p[i]).size(); 遅い
          int num = -Collections.binarySearch(notExitstInPlist, p[i]) - 1;
          sub -= num * factorial[k - 1] * countWildCardUntilPrev[i];
          sub += (Math.abs(sub / MOD) + 1) * MOD;
          sub %= MOD;
        }
      } else {
        sub += sumOfNotExistInP * factorial[k - 1];
        sub %= MOD;
//        for (int j = 0; j < i; ++j) { このループがだめ
//          if (p[j] < 0) continue;
////          int num = notExistInPset.tailSet(p[j]).size(); 遅い
//          int num = -Collections.binarySearch(notExitstInPlist, p[j]) - 1;
//          num = notExitstInPlist.size() - num;
//          sub -= num * factorial[k - 1];
//          sub += (Math.abs(sub / MOD) + 1) * MOD;
//          sub %= MOD;
//        }
        if (i > 0) {
          sub -= LUT[i - 1];
          sub += (Math.abs(sub / MOD) + 1) * MOD;
          sub %= MOD;
        }
        ArrayList<Integer> list = new ArrayList<>(notExistInPset);
        if (k > 1) {
//          for (int si : list) { ゲロ遅い
//            notExistInPset.remove(si);
//            int num = notExistInPset.headSet(si).size();
//            sub -= num * factorial[k - 2] * countWildCardUntilPrev[i];
//            sub += (Math.abs(sub / MOD) + 1) * MOD;
//            sub %= MOD;
//            notExistInPset.add(si);
//          }
          sub -= (unko * countWildCardUntilPrev[i]) % MOD;
          sub += (Math.abs(sub / MOD) + 1) * MOD;
          sub %= MOD;
        }
      }
      sub *= factorial[n - 1 - i];
      sub %= MOD;
      sum += sub;
      sum %= MOD;
    }
    sum += factorial[k];
    sum %= MOD;

    System.out.println(sum);
  }

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

  class BIT<T> {
    int n;
    ArrayList<T> bit;
    BiFunction<T, T, T> bif;

    BIT(int n, BiFunction<T, T, T> bif, Supplier<T> sup) {
      this.n = n;
      bit = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; ++i) {
        bit.add(sup.get());
      }
      this.bif = bif;
    }

    void update(int i, T v) {
      for (int x = i; x <= n; x += x & -x) {
        bit.set(x, bif.apply(bit.get(x), v));
      }
    }

    T reduce(int i, Supplier<T> sup) {
      T ret = sup.get();
      for (int x = i; x > 0; x -= x & -x) {
        ret = bif.apply(ret, bit.get(x));
      }
      return ret;
    }
  }

  long MOD = 1_000_000_007;

  long pow(long a, long r) {
    long sum = 1;
    while (r > 0) {
      if ((r & 1) == 1) {
        sum *= a;
        sum %= MOD;
      }
      a *= a;
      a %= MOD;
      r >>= 1;
    }
    return sum;
  }

  long C(int n, int r) {
    long sum = 1;
    for (int i = n; 0 < i; --i) {
      sum *= i;
      sum %= MOD;
    }
    long s = 1;
    for (int i = r; 0 < i; --i) {
      s *= i;
      s %= MOD;
    }
    sum *= pow(s, MOD - 2);
    sum %= MOD;

    long t = 1;
    for (int i = n - r; 0 < i; --i) {
      t *= i;
      t %= MOD;
    }
    sum *= pow(t, MOD - 2);
    sum %= MOD;

    return sum;
  }

  double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

  /**
   * 黄金分割探索
   *
   * @param left  下限
   * @param right 上限
   * @param f     探索する関数
   * @param comp  上に凸な関数を探索するときは、Comparator.comparingDouble(Double::doubleValue)
   *              下に凸な関数を探索するときは、Comparator.comparingDouble(Double::doubleValue).reversed()
   * @return 極値の座標x
   */
  double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
    double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
    double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
    double d1 = f.apply(c1);
    double d2 = f.apply(c2);
    while (right - left > 1e-9) {
      if (comp.compare(d1, d2) > 0) {
        right = c2;
        c2 = c1;
        d2 = d1;
        c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        d1 = f.apply(c1);
      } else {
        left = c1;
        c1 = c2;
        d1 = d2;
        c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        d2 = f.apply(c2);
      }
    }
    return right;
  }

  /**
   * [a,b]をm:nに内分する点を返す
   */
  double divideInternally(double a, double b, double m, double n) {
    return (n * a + m * b) / (m + n);
  }
}
