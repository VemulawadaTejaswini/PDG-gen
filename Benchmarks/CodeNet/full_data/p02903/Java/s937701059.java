import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int H = in.nextInt();
    int W = in.nextInt();
    int A = in.nextInt();
    int B = in.nextInt();

    int[][] ans = new int[H][W];

    // Fill row
    for (int i = 0; i < H; i++) {
      int count = 0;
      for (int j = 0; j < W; j++) {
        if (count < A) {
          ans[i][j] = 0;
          count++;
        } else {
          ans[i][j] = 1;
        }
      }
    }

    // Flip for column
    for (int i = 0; i < B; i++) {
      for (int j = 0; j < W; j++) {
        if (ans[i][j] == 0) {
          ans[i][j] = 1;
        } else {
          ans[i][j] = 0;
        }
      }
    }

    StringBuilder s = new StringBuilder();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (ans[i][j] == 0) {
          s.append("0");
        } else {
          s.append("1");
        }
        s.append(" ");
      }
      s.append("\n");
    }
    System.out.printf("%s", s);
  }

  public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);

  }

  public static long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}