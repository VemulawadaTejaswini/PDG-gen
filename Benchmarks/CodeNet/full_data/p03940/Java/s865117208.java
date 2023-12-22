import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int E = sc.nextInt();
    int T = sc.nextInt();
    long[] X = new long[N + 1];
    for (int i = 0; i < N; i++) {
      X[i + 1] = sc.nextInt();
    }
    long time = 0;
    int pos = 0;
    while (pos < N) {
      int next = pos + 1;
      while (next < N && (X[next + 1] - X[next]) < T) {
        ++next;
      }
      time += X[pos + 1] - X[pos] + Math.max((X[next] - X[pos + 1]) * 2, T) + X[next] - X[pos + 1];
      pos = next;
    }
    System.out.println(time + E - X[N]);
  }
}
