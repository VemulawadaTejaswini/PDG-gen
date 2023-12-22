
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h[] = new int[n];

    int max = 0;
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
      max = Math.max(max, h[i]);
    }

    // 段数分チェック
    int cnt = 0;
    for (int i = 0; i < max; i++) {
      boolean on = false;
      for (int j = 0; j < n; j++) {
        if (h[j] - i > 0) {
          if (!on) {
            on = true;
            cnt++;
          }
        } else {
          on = false;
        }
      }
    }

    System.out.println(cnt);
  }
}
