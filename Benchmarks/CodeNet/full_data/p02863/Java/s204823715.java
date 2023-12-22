// https://atcoder.jp/contests/abc145/submissions/8483934
// https://mdstoy.hatenablog.com/entry/2019/11/16/232252

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[][] AB = new int[N][2];
    for (int i = 0; i < N; i++) {
      AB[i][0] = sc.nextInt(); // time
      AB[i][1] = sc.nextInt(); // value
    }
    Arrays.sort(AB, Comparator.comparingInt(a -> a[0]));

    // [i-th-Dish][FinishTImeOf-i-thDish] := max value till i-th-dish
    int[] dp = new int[6001];
    for (int i = 1; i <= N; i++) {
      for (int timeAfterEat = 0; timeAfterEat <= 6000; timeAfterEat++) {
        int time = AB[i - 1][0];
        int value = AB[i - 1][1];
        if (0 <= timeAfterEat - time && timeAfterEat - time < T) {
          dp[timeAfterEat] = Math.max(dp[timeAfterEat], dp[timeAfterEat - time] + value);
        }
      }
    }
    System.out.println(Arrays.stream(dp).max().getAsInt());
  }
}
