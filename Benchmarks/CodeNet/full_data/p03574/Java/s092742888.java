import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();
    int[][] dd = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (map[i][j] == '#') continue;
        int cnt = 0;
        for (int[] d : dd) {
          int x = i + d[0];
          int y = j + d[1];
          if (x >= 0 && x < H && y >= 0 && y< W && map[x][y] == '#') cnt++;
        }
        map[i][j] = (char)('0' + cnt);
      }
    }
    for (int i = 0; i < H; i++) System.out.println(new String(map[i]));
  }
}
