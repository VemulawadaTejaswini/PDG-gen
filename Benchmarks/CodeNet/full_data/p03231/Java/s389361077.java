import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    int L = lcm(N, M);
    char[] X = new char[L];
    for (int i = 0; i < L; i++) {
      X[i] = 'A';
    }
    for (int i = 0; i < N; i++) {
      X[(L / N) * i] = S.charAt(i);
    }
    for (int i = 0; i < M; i++) {
      if (X[(L / M) * i] != 'A') {
        if (X[(L / M) * i] != T.charAt(i)) {
          System.out.println(-1);
          return;
        }
      }
    }
    System.out.println(L);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static int lcm(int a, int b) {
    return a / gcd(a, b) * b;
  }
}