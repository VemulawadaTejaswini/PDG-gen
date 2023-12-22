import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    (new Main()).run();
  }

  public void run() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] dm = new int[3]; // 1, 10, 100の位を格納
    for (int i = 0; i < 3; i++) {
      dm[i] = -1;
    }
    for (int i = 0; i < m; i++) {
      int s = sc.nextInt();
      int c = sc.nextInt();
      if (dm[n - s] == -1) {
        dm[n - s] = c;
      } else if (dm[n - s] == c) {
        //
      } else {
        System.out.println(-1);
        return;
      }
    }
    for (int i = 0; i < 3; i++) {
      if (i == n - 1 && dm[i] == -1) {
        if (n == 1 && i == 0) {
          dm[i] = 0;
        } else {
          dm[i] = 1;
        }
      } else if (dm[i] == -1) {
        dm[i] = 0;
      }
    }
    int result = dm[2] * 100 + dm[1] * 10 + dm[0];
    if (result == 0 && n != 1) {
      System.out.println(-1);
    } else {
      System.out.println(result);
    }
  }
}