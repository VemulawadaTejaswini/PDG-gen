import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] s = new char[H][W];
    for (int i = 0; i < H; i++) {
      s[i] = scanner.next().toCharArray();
    }
    if (possible(H, W, s)) {
      System.out.println("Possible");
    } else {
      System.out.println("Impossible");
    }
  }

  private static boolean possible(int H, int W, char[][] s) {
    int prev = 0;
    for (int i = 0; i < H; i++) {
      int left = -1;
      int right = W;
      for (int j = 0; j < W; j++) {
        if (s[i][j] == '#') {
          if (left < 0) left = j;
          if (right < j) return false;
        }
        if (s[i][j] == '.') {
          if (left >= 0) right = Math.min(right, j);
        }
      }
      if (left != prev) return false;
      prev = right - 1;
    }
    return true;
  }
}
