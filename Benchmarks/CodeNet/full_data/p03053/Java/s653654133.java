import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();

    int[][] level = new int[H][W];
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (map[i][j] == '#') {
          queue.add(new int[]{i, j});
        }
      }
    }
    int max = 0;
    while (!queue.isEmpty()) {
      int[] pos = queue.remove();
      for (int[] df : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
        int[] next = new int[]{pos[0] + df[0], pos[1] + df[1]};
        if (next[0] >= 0 && next[0] < H && next[1] >= 0 && next[1] < W && map[next[0]][next[1]] == '.') {
          level[next[0]][next[1]] = level[pos[0]][pos[1]] + 1;
          max = Math.max(max, level[next[0]][next[1]]);
          map[next[0]][next[1]] = '#';
          queue.add(next);
        }
      }
    }
    System.out.println(max);
  }
}
