import java.util.Arrays;
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
    boolean[][] visited = new boolean[H][W];
    int[][] min = new int[H][W];
    for (int i = 0; i < H; i++) Arrays.fill(min[i], 100000);
    min[0][0] = map[0][0] == '.' ? 0 : 1;
    Queue<Cell> queue = new LinkedList<>();
    queue.add(new Cell(0, 0));
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      Cell c = queue.remove();
      if (c.y < W - 1) {
        Cell next = new Cell(c.x, c.y + 1);
        add(map, visited, min, queue, c, next);
      }
      if (c.x < H - 1) {
        Cell next = new Cell(c.x + 1, c.y);
        add(map, visited, min, queue, c, next);
      }
    }
    System.out.println(min[H - 1][W - 1]);
  }

  private static void add(char[][] map, boolean[][] visited, int[][] min, Queue<Cell> queue, Cell current, Cell next) {
    int cost = 0;
    if (map[current.x][current.y] == '.' && map[next.x][next.y] == '#') cost = 1;
    min[next.x][next.y] = Math.min(min[next.x][next.y], min[current.x][current.y] + cost);
    if (!visited[next.x][next.y]) {
      visited[next.x][next.y] = true;
      queue.add(next);
    }
  }

  private static class Cell {
    final int x;
    final int y;

    private Cell(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
