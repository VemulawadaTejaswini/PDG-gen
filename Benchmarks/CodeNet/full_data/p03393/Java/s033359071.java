import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int N = S.length;
    int[] ss = new int[N + 1];
    for (int i = 0; i < N; i++) ss[i] = S[i] - 'a';
    ss[N] = -1;
    int[] remaining = new int[N + 1];
    remaining[0] = (1 << 26) - 1;
    for (int i = 1; i < N + 1; i++) {
      remaining[i] = remaining[i - 1];
      remaining[i] ^= (1 << ss[i - 1]);
    }
    int j = N;
    int next = -1;
    while (j >= 0 && (next = lsb(remaining[j], ss[j])) < 0) j--;
    if (next < 0) {
      System.out.println(-1);
      return;
    }
    for (int i = 0; i < j; i++) System.out.print(S[i]);
    System.out.println((char) (next + 'a'));
  }

  private static int lsb(int n, int s) {
    s++;
    n >>= s;
    while (n > 0) {
      if (n % 2 != 0) return s;
      s++;
      n /= 2;
    }
    return -1;
  }
}
