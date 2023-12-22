

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] strings = new String[N];
    for (int i = 0; i < N; i++) {
      strings[i] = sc.nextLine();
    }
    int happyness = solve(strings);
    System.out.println(happyness);
  }

  private static int solve(String[] strings) {

    int[][] ans = new int[strings.length][3];
    for (String str : strings) {
      String[] s = str.split(" ");
      ans[0][0] = Integer.parseInt(s[0]);
      ans[0][1] = Integer.parseInt(s[1]);
      ans[0][2] = Integer.parseInt(s[2]);
      break;
    }
    for (int i = 1; i < strings.length; i++) {
      String[] s = strings[i].split(" ");
      ans[i][0] = Math.max(ans[i - 1][1], ans[i - 1][2]) + Integer.parseInt(s[0]);
      ans[i][1] = Math.max(ans[i - 1][0], ans[i - 1][2]) + Integer.parseInt(s[1]);
      ans[i][2] = Math.max(ans[i - 1][0], ans[i - 1][1]) + Integer.parseInt(s[2]);
    }

    return Math.max(
        Math.max(ans[strings.length - 1][0], ans[strings.length - 1][1]),
        ans[strings.length - 1][2]);
  }
}
