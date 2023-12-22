import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int K = scanner.nextInt();
    char[][] S = new char[H][W];
    for (int i = 0; i < H; i++) {
      S[i] = scanner.next().toCharArray();
    }
    int[][] cumsum = new int[H + 1][W + 1];
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        cumsum[i][j] = cumsum[i][j - 1];
        if (S[i - 1][j - 1] == '1') cumsum[i][j]++;
      }
    }
    for (int j = 1; j <= W; j++) {
      for (int i = 1; i <= H; i++) {
        cumsum[i][j] += cumsum[i - 1][j];
      }
    }

    int min = 1_000_000;
    for (int i = 0; i < 1 << (H - 1); i++) {
      int num = i;
      int count = Integer.bitCount(num);

      int[][] csum = new int[count + 1][W + 1];
      int j = 0;
      int top = 1;
      int bottom = 1;
      while (num > 0) {
        while (num % 2 == 0) {
          num /= 2;
          bottom++;
        }
        for (int k = 1; k <= W; k++) {
          csum[j][k] = cumsum[bottom][k] - cumsum[top - 1][k];
        }
        j++;
        bottom++;
        top = bottom;
        num /= 2;
      }
      for (int k = 1; k <= W; k++) {
        csum[j][k] = cumsum[H][k] - cumsum[top - 1][k];
      }

      int max = foo(csum, count + 1, W + 1, K);
      min = Math.min(min, count + max);
    }
    System.out.println(min);
  }

  private static int foo(int[][] csum, int H, int W, int K) {
    for (int i = 0; i < H; i++) {
      for (int j = 1; j < W; j++) {
        if (csum[i][j] - csum[i][j - 1] > K) return 1_000_000;
      }
    }
    int num = 0;
    int left = 0;
    for (int i = 0; i < W; i++) {
      int max = 0;
      for (int j = 0; j < H; j++) {
        max = Math.max(max, csum[j][i] - csum[j][left]);
      }
      if (max > K) {
        num++;
        left = i - 1;
      }
    }
    return num;
  }
}
