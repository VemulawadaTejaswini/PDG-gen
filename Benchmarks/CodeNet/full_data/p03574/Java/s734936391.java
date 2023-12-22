import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  int countBomb(int x, int y, int H, int W, char[][] grid){
    int res = 0;
    for (int i = -1; i <= 1 ; i++) {
      for (int j = -1; j <= 1; j++) {
        if (x + j < 0 || x + j >= W || y + i < 0 || y + i >= H) {
          continue;
        }

        if (grid[y+i][x+j] == '#') {
          res++;
        }
      }
    }

    return res;
  }

  private void run() {
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());

    char[][] grid = new char[H][W];

    for (int i = 0; i < H; i++) {
      grid[i] = sc.next().toCharArray();
    }

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int bomb = countBomb(j, i, H, W, grid);
        if (grid[i][j] == '.') {
          grid[i][j] = Character.forDigit(bomb, 10);
        }
      }
    }

    for (int i = 0; i < H; i++) {
      System.out.println(grid[i]);
    }
  }
}
