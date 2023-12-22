import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[][] a = new int[H][W];
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) a[i][j] = scanner.nextInt();

    StringBuilder sb = new StringBuilder();
    int cnt = 0;
    for (int n = 0; n < H * W - 1; n++) {
      int ci = ntoi(n, H, W);
      int cj = ntoj(n, H, W);
      int ni = ntoi(n + 1, H ,W);
      int nj = ntoj(n + 1, H, W);
      if (a[ci][cj] % 2 != 0) {
        a[ni][nj]++;
        cnt++;
        sb.append(String.format("%d %d %d %d\n", ci + 1, cj + 1, ni + 1, nj + 1));
      }
    }
    System.out.println(cnt);
    if (sb.length() > 0) System.out.print(sb.toString());
  }

  private static int ntoi(int n, int H, int W) {
    return n / W;
  }

  private static int ntoj(int n, int H, int W) {
    int i = n / W;
    if (i % 2 == 0) {
      return n % W;
    }
    int j = n % W;
    j = W - j - 1;
    return j;
  }
}
