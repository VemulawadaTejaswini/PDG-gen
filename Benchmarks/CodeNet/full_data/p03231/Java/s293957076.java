import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    System.out.println(solve(N, M, s, t));
  }

  private static long solve(int N, int M, char[] s, char[] t) {
    if (N > M) return solve(M, N, t, s);
    long gcd = gcd(N, M);
    long lsm = (long) N / gcd * M;
    for (int i = 0, j = 0; i < N && j < M; ) {
      if (s[i] != t[j]) return -1;
      i += N / gcd;
      j += M / gcd;
    }
    return lsm;
  }

  private static long gcd(long i, long j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      long r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
