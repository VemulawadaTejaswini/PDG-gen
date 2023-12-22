
import java.util.Scanner;

public class Main {

  static long[][] sol;
  static boolean[][] flag;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sol = new long[N][N];
    flag = new boolean[N][N];
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    if (N == 1) {
      System.out.println(arr[0]);
    } else {
      System.out.println(solve(arr, 0, N - 1));
    }
  }


  private static long solve(int[] arr, int i, int length) {
    if (i == length) {
      return arr[i];
    } else {
      if (!flag[i + 1][length]) {
        sol[i + 1][length] = solve(arr, i + 1, length);
        flag[i + 1][length] = true;
      }
      if (!flag[i][length - 1]) {
        sol[i][length - 1] = solve(arr, i, length - 1);
        flag[i][length - 1] = true;
      }
      return Math.max((arr[i] - sol[i + 1][length]), (arr[length] - sol[i][length - 1]));
    }
  }

}
