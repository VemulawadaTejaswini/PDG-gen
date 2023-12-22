import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
  void run() {
    int h = ni();
    int w = ni();
    int[][] field = new int[h][w];
    for (int i = 0; i < h; ++i) {
      String str = sc.next();
      for (int j = 0; j < w; ++j) {
        field[i][j] = str.charAt(j);
      }
    }

    int[][][] cost = new int[w - 1][h + 1][h + 1];
    for (int i = 0; i < w - 1; ++i) {
      // left
      for (int j = 0; j < h; ++j) {
        for (int k = 0; k <= h - 1 - j; ++k) {
          cost[i][j][0] += field[k][i] == field[j + k][i + 1] ? 1 : 0;
        }
        for (int k = 1; k <= h - 1 - j; ++k) {
          cost[i][j + k][k] = cost[i][j + k - 1][k - 1]
              - (field[h - 1 - j - (k - 1)][i] == field[h - 1 - (k - 1)][i + 1] ? 1 : 0);
        }
      }
      // right: j = 0のケースはもう計算済みなので注意
      for (int j = 1; j < h; ++j) {
        for (int k = 0; k <= h - 1 - j; ++k) {
          cost[i][0][j] += field[j + k][i] == field[k][i + 1] ? 1 : 0;
        }
        for (int k = 1; k <= h - 1 - j; ++k) {
          cost[i][k][j + k] = cost[i][k - 1][j + k - 1]
              - (field[h - 1 - (k - 1)][i] == field[h - 1 - j - (k - 1)][i + 1] ? 1 : 0);
        }
      }
    }

    int[][][] dp = new int[w - 1][h + 1][h + 1];
    for (int i = 0; i < w - 1; ++i) {
      for (int j = 0; j < h + 1; ++j) {
        Arrays.fill(dp[i][j], 1 << 28);
      }
    }
    for (int i = 0; i < w - 1; ++i) {
      dp[i][0][0] = 0;
    }
    for (int i = 0; i < w - 1; ++i) {
      for (int j = 0; j <= h; ++j) {
        for (int k = 0; k <= h; ++k) {
          dfs(dp, cost, i, j, k);
        }
      }
    }
    int sum = 0;
    for (int i = 0; i < w - 1; ++i) {
      sum += dp[i][h][h];
    }
    System.out.println(sum);
  }

  int dfs(int[][][] dp, int[][][] cost, int i, int j, int k) {
    if (dp[i][j][k] != 1 << 28) {
      return dp[i][j][k];
    }
    int min = 1 << 28;
    if (j > 0) {
      min = Math.min(min, dfs(dp, cost, i, j - 1, k) + cost[i][j - 1][k]);
    }
    if (k > 0) {
      min = Math.min(min, dfs(dp, cost, i, j, k - 1) + cost[i][j][k - 1]);
    }
    return dp[i][j][k] = min;
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

    BIT(int n, BiFunction<T, T, T> bif, T defaultValue) {
      this.n = n;
      bit = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; ++i) {
        bit.add(defaultValue);
      }
      this.bif = bif;
    }

    void update(int i, T v) {
      for (int x = i; x <= n; x += x & -x) {
        bit.set(x, bif.apply(bit.get(x), v));
      }
    }

    T reduce(int i, T defaultValue) {
      T ret = defaultValue;
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
