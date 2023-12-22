import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static long B;
  static long C;
  // static int[][] map;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int W = scanner.nextInt();

    long[][] map = new long[N][W + 1];


    int tempw = scanner.nextInt();
    int tempv = scanner.nextInt();
    for (int i = tempw; i <= W; i++) {
      map[0][i] = tempv;
    }
    for (int i = 1; i < N; i++) {
      int w = scanner.nextInt();
      long v = scanner.nextLong();
      for (int j = 0; j <= W; j++) {
//        if(map[i - 1][j] == 0)continue;
        if(j - w < 0)map[i][j] = map[i - 1][j];
        else
        map[i][j] = Math.max(map[i - 1][j - w] + v, map[i - 1][j]);
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println(map[N - 1][W]);


  }
}
