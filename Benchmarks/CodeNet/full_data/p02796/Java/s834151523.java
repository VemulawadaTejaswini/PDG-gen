import java.util.*;

public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] X = new long[N];
    long[] L = new long[N];
    long[] tr = new long[N];
    long[] tl = new long[N];
    for (int i = 0; i < N; ++i) {
      X[i] = sc.nextInt();
      L[i] = sc.nextInt();
      tr[i] = X[i] + L[i];
      tl[i] = X[i] - L[i];
    }

    int cnt = 0;
    for (int i = 0; i < N; ++i) {
      for (int j = 1; j < N; ++j) {
        if (tr[i] > tr[j] && tl[i] < tr[j]) {
          ++cnt;
          continue;
        }
        if (tr[i] < tl[j] && tl[i] > tl[j]) {
          ++cnt;
          continue;
        }
      }
    }
    System.out.println(N - cnt);
  }
}
