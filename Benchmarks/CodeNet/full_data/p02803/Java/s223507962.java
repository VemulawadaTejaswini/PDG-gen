import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
  static class Pair {
    int left;
    int right;
    int depth;

    Pair(int l, int r, int depth) {
      left = l;
      right = r;
      this.depth = depth;
    }
  }

  public static void main(String[] args) {
    Scanner std = new Scanner(System.in);
    int h = std.nextInt();
    int w = std.nextInt();
    char[][] table = new char[h][w];
    for (int i = 0; i < h; i++) {
      String line = std.next();
      for (int j = 0; j < w; j++) {
        char c = line.charAt(j);
        table[i][j] = c;
      }
    }

    int max = 0;

    Deque<Pair> deque = new ArrayDeque<>();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (table[i][j] == '#') {
          continue;
        }

        Pair start = new Pair(i, j, 0);
        boolean[][] visited = new boolean[h][w];

        deque.add(start);
        while (!deque.isEmpty()) {
          Pair p = deque.poll();
          max = Math.max(p.depth, max);
          if (visited[p.left][p.right]) {
            continue;
          }

          visited[p.left][p.right] = true;
          int left = p.right - 1;
          int right = p.right + 1;
          int top = p.left - 1;
          int bottom = p.left + 1;

          if (left >= 0) {
            char c = table[p.left][left];
            if (c != '#' && !visited[p.left][left]) {
              deque.add(new Pair(p.left, left, p.depth + 1));
            }
          }

          if (right < table[0].length) {
            char c = table[p.left][right];
            if (c != '#' && !visited[p.left][right]) {
              deque.add(new Pair(p.left, right, p.depth + 1));
            }
          }

          if (top >= 0) {
            char c = table[top][p.right];
            if (c != '#' && !visited[top][p.right]) {
              deque.add(new Pair(top, p.right, p.depth + 1));
            }
          }

          if (bottom < table.length) {
            char c = table[bottom][p.right];
            if (c != '#' && !visited[bottom][p.right]) {
              deque.add(new Pair(bottom, p.right, p.depth + 1));
            }
          }
        }
      }
    }

    System.out.println(max);
  }
}
