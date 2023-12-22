import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int ans = 0;
    for (int i = 1; i <= N; i+=2) {
      if (countYakusu(i) == 8) {
        ans++;
      }
    }
    System.out.println(ans);
  }
  
  private static int countYakusu(int n) {
    int ret = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        ret++;
      }
    }
    return ret;
  }
}