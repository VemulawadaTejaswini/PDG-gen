import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int l = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int ans = 0;

    for (int i = 1; i <= n; i++) {
      int tmp = (l + i) - 1;
      ans += tmp;
      if (Math.abs(min) > Math.abs(tmp)) {
        min = tmp;
      }
    }

    System.out.println(ans - min);

  }
}