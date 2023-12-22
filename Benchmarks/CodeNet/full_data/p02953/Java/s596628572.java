
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long h[] = new long[n];
    boolean fix[] = new boolean[n];
    Arrays.fill(fix, false);
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    for (int i = n - 1; i > 0; i--) {
      if (h[i] >= h[i - 1]) {
        continue;
      }
      if (h[i] == h[i - 1] - 1) {
        h[i - 1] = h[i - 1] - 1;
        continue;
      }

      System.out.println("No");
      return;
    }
    System.out.println("Yes");
  }
}
