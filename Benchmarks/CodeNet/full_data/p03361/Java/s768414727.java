import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());

    boolean S[][] = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      String str = sc.next();
      for (int j = 0; j < W; j++) {
        if (str.charAt(j) == '#') {
          S[i][j] = true;
        } else {
          S[i][j] = false;
        }
      }
    }

    int di[] = { -1, 0, 1, 0 };
    int dj[] = { 0, -1, 0, 1 };
    boolean flag = true;

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (!S[i][j]) {
          continue;
        }
        flag = false;
        for (int k = 0; k < 4; k++) {
          int ni = i + di[k];
          int nj = j + dj[k];
          if (ni < 0 || ni >= H || nj < 0 || nj >= W) {
            continue;
          }
          if (S[ni][nj]) {
            flag = true;
          }
        }
        if (!flag) {
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");
  }
}