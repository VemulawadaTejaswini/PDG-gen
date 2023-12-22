import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[][] = new int[2][n];
    int ans = 0;

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      int tmp = 0;
      for (int j = 0; j < (n - i); j++) {
        tmp += a[0][j];
      }
      for (int j = n - i - 1; j < n; j++) {
        tmp += a[1][j];
      }
      ans = Math.max(tmp, ans);
    }

    System.out.println(ans);

  }
}