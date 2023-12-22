import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int T = scanner.nextInt();
    int ans = 1001;
    for (int i = 0; i < N; i++) {
      int c = scanner.nextInt();
      int t = scanner.nextInt();
      if (t <= T && c < ans) ans = c;
    }
    scanner.close();
    if (ans == 1001) {
      System.out.println("TLE");
    } else {
      System.out.println(ans);
    }
  }
}