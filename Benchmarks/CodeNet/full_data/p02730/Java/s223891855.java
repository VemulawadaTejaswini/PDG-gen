import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int N = S.length();
    if (isPalin(S)
        && isPalin(S.substring(0, (N - 1) / 2))
        && isPalin(S.substring((N + 3) / 2 - 1))
    ) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  static boolean isPalin(String s) {
    int N = s.length();
    for (int i = 0; i < N / 2; i++) {
      if (s.charAt(i) != s.charAt(N - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
