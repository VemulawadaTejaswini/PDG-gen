
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int p[][] = new int[m][3];

    for (int i = 0; i < m; i++) {
      p[i][0] = sc.nextInt();
      p[i][1] = sc.nextInt();
      p[i][2] = i;
    }

    Arrays.sort(p, (a, b) -> Integer.compare(a[1], b[1]));
    Arrays.sort(p, (a, b) -> Integer.compare(a[0], b[0]));

    p[0][1] = 1;
    for (int i = 1; i < m; i++) {
      p[i][1] = p[i][0] == p[i - 1][0] ? p[i - 1][1] + 1 : 1;
    }

    Arrays.sort(p, (a, b) -> Integer.compare(a[2], b[2]));

    for (int i = 0; i < m; i++) {
      System.out.println(String.format("%06d", p[i][0]) + String.format("%06d", p[i][1]));
    }
  }
}
