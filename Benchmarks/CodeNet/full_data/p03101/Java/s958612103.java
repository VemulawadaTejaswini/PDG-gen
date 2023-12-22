import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    int H = sc.nextInt();

    int W = sc.nextInt();

    int h = sc.nextInt();

    int w = sc.nextInt();

    boolean[][] matrix = new boolean[H][W];

    for (int i = 0; i < h; i++){
      for (int j = 0; j < w; j++){
        matrix[h][j] = true;
      }
    }

    int count = 0;
    for (int i = 0; i < H; i++){
      for (int j = 0; j < W; j++){
        if (!matrix[h][j]) {
          count++;
        }
      }
    }
    os.println(count);
  }
}