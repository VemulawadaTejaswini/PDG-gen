import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static boolean[][] bomb = new boolean[50][50];

  public static void main(String[] args) {
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();
    int K = sc.nextInt();

    rec(0, H, 0, W, N);
    long ans = 0;
    long mul = 1;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (bomb[i][j]) ans += mul;
        mul *= 2;
        mul %= K;
      }
    }
    System.out.println("! " + (ans % K));
    System.out.flush();
  }

  static void rec(int t, int b, int l, int r, int c) {
    if (c == 0) return;
    if ((b - t) * (r - l) == c) {
      for (int i = t; i < b; i++) {
        for (int j = l; j < r; j++) {
          bomb[i][j] = true;
        }
      }
      return;
    }
    if (b - t > 1) {
      int upper = query(t, (t + b) / 2, l, r);
      rec(t, (t + b) / 2, l, r, upper);
      rec((t + b) / 2, b, l, r, c - upper);
    } else {
      int left = query(t, b, l, (l + r) / 2);
      rec(t, b, l, (l + r) / 2, left);
      rec(t, b, (l + r) / 2, r, c - left);
    }
  }

  static int query(int t, int b, int l, int r) {
    System.out.printf("? %d %d %d %d\n", t, l, b - 1, r - 1);
    System.out.flush();
    return sc.nextInt();
  }

}


