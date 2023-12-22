import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] k = new int[n];
    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      k[i] = scanner.nextInt();
      for (int j = 0; j < k[i]; j++) {
        a[i][j] = scanner.nextInt();
      }
    }
    boolean[][] map = new boolean[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        map[i][j] = false;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < k[i]; j++) {
        map[i][a[i][j] - 1] = true;
      }
    }
    int count = 0;
    boolean isTrue;
    for (int i = 0; i < m; i++) {
      isTrue = true;
      for (int j = 0; j < n; j++) {
        if (!map[j][i]) {
          isTrue = false;
        }
      }
      if (isTrue) {
        count++;
      }
    }
    System.out.println(count);
  }

}
