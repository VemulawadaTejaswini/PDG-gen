import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    long res = 0;
    BinaryIndexTree bit = new BinaryIndexTree(2000);
    for (int i = 0; i < N; i++) {
      res += i - bit.query(A[i]);
      bit.add(A[i], 1);
    }
    res *= K;
    res %= M;
    Arrays.sort(A);
    long count2 = 0;
    for (int i = 0; i < N; i++) {
      count2 += N - lowerBound(A, A[i]);
    }
    count2 *= K - 1;
    count2 %= M;
    count2 *= K;
    count2 %= M;
    count2 *= inverse(2, M);
    count2 %= M;

    res += count2;
    res %= M;
    System.out.println(res);
  }

  private static long inverse(long a, long mod) {
    return modpow(a, mod - 2, mod);
  }

  private static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }

  public static int lowerBound(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (k < a[mid]) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }

  public static class BinaryIndexTree {
    private final int[] a;

    public BinaryIndexTree(int size) {
      a = new int[size + 1];
    }

    public int query(int index) {
      int res = 0;
      while (index > 0) {
        res += a[index];
        index -= Integer.lowestOneBit(index);
      }
      return res;
    }

    public void add(int index, int value) {
      while (index < a.length) {
        a[index] += value;
        index += Integer.lowestOneBit(index);
      }
    }
  }
}
