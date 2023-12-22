import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    char[] T = new char[S.length * 2];
    System.arraycopy(S, 0, T, 0, S.length);
    System.arraycopy(S, 0, T, S.length, S.length);
    int K = scanner.nextInt();
    long res1 = 0;
    for (int i = 1; i < S.length; i++) {
      if (S[i] == S[i - 1]) {
        res1++;
        i++;
      }
    }
    long res2 = 0;
    for (int i = 1; i < T.length; i++) {
      if (T[i] == T[i - 1]) {
        res2++;
        i++;
      }
    }
    System.out.println(res1 + (res2 - res1) * (K - 1));
  }
}
