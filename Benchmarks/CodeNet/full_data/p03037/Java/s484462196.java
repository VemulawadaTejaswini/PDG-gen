import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] lr = new int[m][2];

    for (int i = 0; i < m; ++i) {
      lr[i][0] = sc.nextInt();
      lr[i][1] = sc.nextInt();
    }

    int res = 0;

    idLoop:
    for (int i = 1; i <= n; ++i) {
      for (int j = 0; j < m; ++j) {
        if (i < lr[j][0] || i > lr[j][1])
          continue idLoop;
      }
      ++res;
    }

    System.out.println(res);
  }
}