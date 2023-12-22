import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int left = 0;
    int right = (N + 1) / 2;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (possible(s, mid, N)) left = mid;
      else right = mid;
    }
    System.out.println(left);
  }

  private static boolean possible(char[] s, int K, int N) {
    int M = 1_000_000_007;
    int B = new Random().nextInt(M);
    long bn = 1;
    for (int i = 0; i < K - 1; i++) {
      bn *= B;
      bn %= M;
    }

    for (int i = 0; i <= N - K * 2; i++) {
      long th = hash(s, i, K, B, M);
      long sh = hash(s, i + K, K, B, M);
      for (int j = i + K; j <= N - K; j++) {
        if (sh == th) return true;
        if (j + K == N) break;
        sh -= s[j] * bn % M;
        if (sh < 0) sh += M;
        sh *= B;
        sh %= M;
        sh += s[j + K];
        if (sh >= M) sh -= M;
      }
    }
    return false;
  }

  private static long hash(char[] s, int start, int len, int B, int M) {
    if (s.length < len) throw new IllegalArgumentException("len must be equal to or more than s.length: len=" + len + ", s.length=" + s.length);
    long hash = 0;
    for (int i = 0; i < len; i++) {
      hash *= B;
      hash %= M;
      hash += s[start + i];
      if (hash >= M) hash -= M;
    }
    return hash;
  }
}
