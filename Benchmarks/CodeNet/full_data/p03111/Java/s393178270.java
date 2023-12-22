import java.util.Scanner;

class Main {

  private static int N;

  private static int A, B, C;

  private static int[] l;

  private static int abs(int n) {
    return Math.abs(n);
  }

  private static int INF = Integer.MAX_VALUE / 4;

  public static int rec(int i, int a, int b, int c) {
    if (i == N) {
      if (a == 0 || b == 0 || c == 0) {
        return INF;
      }
      return abs(a - A) + abs(b - B) + abs(c - C) - 30;
    }
    int res0 = rec(i + 1, a + l[i], b, c) + 10;
    int res1 = rec(i + 1, a, b + l[i], c) + 10;
    int res2 = rec(i + 1, a, b, c + l[i]) + 10;
    int res3 = rec(i + 1, a, b, c);
    return Math.min(Math.min(Math.min(res0, res1), res2), res3);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    A = scanner.nextInt();
    B = scanner.nextInt();
    C = scanner.nextInt();
    l = new int[N];
    for (int i = 0; i < N; i++) {
      l[i] = scanner.nextInt();
    }
    System.out.println(rec(0, 0, 0, 0));
  }

}
