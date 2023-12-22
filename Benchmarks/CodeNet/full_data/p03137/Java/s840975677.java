
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x[] = new int[m];
    for (int i = 0; i < m; i++) {
      x[i] = sc.nextInt();
    }
    Arrays.sort(x);

    if (m == 1) {
      System.out.println(0);
      return;
    }

    int sabun[] = new int[m - 1];
    for (int i = 1; i < m; i++) {
      sabun[i - 1] = x[i] - x[i - 1];
    }

    Arrays.sort(sabun);
    int sum = 0;
    for (int i = 0; i < sabun.length; i++) {
      if (i + n - 1 < sabun.length) {
        sum += sabun[i];
      }
    }
    System.out.println(sum);
  }
}
