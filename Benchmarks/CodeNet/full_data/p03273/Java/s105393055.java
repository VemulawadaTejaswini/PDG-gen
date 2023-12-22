import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int H = sc.nextInt();
    int W = sc.nextInt();

    char[][] grid = new char[H][W];
    for (int i = 0; i < H; i++) {
      grid[i] = sc.next().toCharArray();
    }

    boolean[] hasBlackH = new boolean[H];
    boolean[] hasBlackW = new boolean[W];

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (grid[i][j] == '#') {
          hasBlackH[i] = true;
          hasBlackW[j] = true;
        }
      }
    }

    for (int i = 0; i < H; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < W; j++) {
        if (hasBlackH[i] && hasBlackW[j]){
          sb.append(grid[i][j]);
        }
      }
      if (!sb.toString().equals("")){
        System.out.println(sb.toString());
      }
    }
  }
}

