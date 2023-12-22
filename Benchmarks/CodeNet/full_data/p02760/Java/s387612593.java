import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    int n = sc.nextInt();

    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (a[j][k] == b[i]) {
            a[j][k] = -1;
          }
        }
      }
    }

    int sum = 0;

    for (int i = 0; i < 3; i++) {
      sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += a[i][j];
      }
      if (sum == -3) {
        System.out.println("Yes");
        return;
      }
    }

    for (int i = 0; i < 3; i++) {
      sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += a[j][i];
      }
      if (sum == -3) {
        System.out.println("Yes");
        return;
      }
    }

    sum = 0;

    for (int i = 0; i < 3; i++) {
      sum += a[i][i];
      if (sum == -3) {
        System.out.println("Yes");
        return;
      }
    }

    if (a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
      System.out.println("Yes");
    }

    System.out.println("No");

  }
}
