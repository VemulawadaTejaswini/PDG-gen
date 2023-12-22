
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    System.out.println(solve(n, ""));
  }

  public static int solve(long n, String num) {

    if (!num.equals("") && Long.valueOf(num) > n) {
      return 0;
    }

    int cnt = 0;
    if (num.contains("7") && num.contains("5") && num.contains("3")) {
      cnt++;
    }

    cnt += solve(n, num + "7");
    cnt += solve(n, num + "5");
    cnt += solve(n, num + "3");

    return cnt;
  }
}
