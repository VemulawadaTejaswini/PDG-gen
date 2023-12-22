import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();

    if (possible(H, W, map)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean possible(int H, int W, char[][] map) {
    int[][] d = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (map[i][j] != '#') continue;
        boolean found = false;
        for (int[] dd : d) {
          int x = i + dd[0];
          int y = j + dd[1];
          if (x >= 0 && x < H && y >= 0 && y < W) {
            if (map[x][y] == '#') found = true;
          }
        }
        if (!found) return false;
      }
    }
    return true;
  }
}
