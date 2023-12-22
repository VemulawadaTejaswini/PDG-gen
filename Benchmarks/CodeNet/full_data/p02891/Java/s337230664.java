import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int N = S.length;
    char[] T = new char[N * 2];
    char[] U = new char[N * 3];
    System.arraycopy(S, 0, T, 0, N);
    System.arraycopy(S, 0, T, N, N);
    System.arraycopy(T, 0, U, 0, T.length);
    System.arraycopy(S, 0, U, T.length, N);

    long K = scanner.nextInt();
    long res1 = count(S);
    long res2 = count(T);
    long res3 = count(U);
    long res = res1 + (K - 1) / 2 * (res3 - res1);
    res += (K - 1) % 2 * (res2 - res1);
    System.out.println(res);
  }

  private static long count(char[] s) {
    long res = 0;
    for (int i = 1; i < s.length; i++) {
      if (s[i] == s[i - 1]) {
        res++;
        i++;
      }
    }
    return res;
  }
}
