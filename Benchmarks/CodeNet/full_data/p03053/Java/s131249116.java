import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {

  public static final int INF = Integer.MAX_VALUE / 4;

  public static final Integer[] di = { 1, -1, 0, 0 };
  public static final Integer[] dj = { 0, 0, 1, -1 };

  public static boolean isOK(boolean[][] isBlack, int H, int W) {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (!isBlack[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void fill(boolean[][] isBlack, int H, int W) {
    boolean[][] sub = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      sub[i] = isBlack[i].clone();
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (sub[i][j]) {
          for (int k = 0; k < 4; k++) {
            int ci = i + di[k];
            int cj = j + dj[k];
            if (0 <= ci && ci < H && 0 <= cj && cj < W) {
              isBlack[ci][cj] = true;
            }
          }
        }
      }
    }
  }

  public static boolean isIn(int i, int j, int H, int W) {
    if (0 <= i && i < H && 0 <= j && j < W) {
      return true;
    } else {
      return false;
    }
  }

  public static int min(int i, int j, boolean[][] isBlack, int H, int W) {
    Queue<Integer[]> queue = new ArrayDeque<Integer[]>();
    queue.add(new Integer[] { i, j, 0 });
    while (true) {
      Integer[] p = queue.poll();
      for (int k = 0; k < 4; k++) {
        int ci = p[0] + di[k];
        int cj = p[1] + dj[k];
        if (isIn(ci, cj, H, W)) {
          if (isBlack[ci][cj]) {
            return p[2] + 1;
          } else {
            queue.add(new Integer[] { ci, cj, p[2] + 1 });
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    boolean[][] isBlack = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      String st;
      st = scanner.next();
      for (int j = 0; j < W; j++) {
        isBlack[i][j] = st.charAt(j) == '#';
      }
    }
    int max = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (!isBlack[i][j]) {
          max = Math.max(max, min(i, j, isBlack, H, W));
        }
      }
    }
    System.out.println(max);
  }
}
