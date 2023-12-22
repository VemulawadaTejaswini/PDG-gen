import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

class Main {

  private static final int INF = Integer.MAX_VALUE / 4;
  private static final Integer[] di = { 1, -1, 0, 0 };
  private static final Integer[] dj = { 0, 0, 1, -1 };

  public static boolean isIn(int i, int j, int H, int W) {
    if (0 <= i && i < H && 0 <= j && j < W) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    String[] map = new String[H];
    int[][] min = new int[H][W];
    int cntBlack = 0;
    for (int i = 0; i < H; i++) {
      map[i] = scanner.next();
      for (int j = 0; j < W; j++) {
        if (map[i].charAt(j) == '#') {
          cntBlack++;
        }
      }
    }
    for (int[] is : min) {
      Arrays.fill(is, INF);
    }
    Queue<Integer[]> queue = new ArrayDeque<Integer[]>();
    queue.add(new Integer[] { 0, 0 });
    min[0][0] = 0;
    while (!queue.isEmpty()) {
      Integer[] p = queue.poll();
      for (int k = 0; k < 4; k++) {
        int ci = p[0] + di[k];
        int cj = p[1] + dj[k];
        if (isIn(ci, cj, H, W) && map[ci].charAt(cj) == '.' && min[ci][cj] == INF) {
          min[ci][cj] = min[p[0]][p[1]] + 1;
          queue.add(new Integer[] { ci, cj });
        }
      }
    }
    if (min[H - 1][W - 1] == INF) {
      System.out.println(-1);
    } else {
      System.out.println(H * W - min[H - 1][W - 1] - cntBlack - 1);
    }
  }
}
