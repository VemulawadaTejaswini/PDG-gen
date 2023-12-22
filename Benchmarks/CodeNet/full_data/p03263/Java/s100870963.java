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
      int ci = n / W;
      int cj = ci == 0 ? n % W : W - n % W - 1;
      int ni = (n + 1) / W;
      int nj = ni == 0 ? (n + 1) % W : W - (n + 1) % W - 1;
      if (a[ci][cj] % 2 != 0) {
        a[ni][nj]++;
        cnt++;
        sb.append(ci + 1).append(' ').append(cj + 1).append(' ').append(ni + 1).append(' ').append(nj + 1).append('\n');
      }
    }
    System.out.println(cnt);
    System.out.print(sb.toString());
  }
}
