import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }
  public void solve() {
    Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = scan.nextInt();
    int ans = 0;
    while (0 < N) {
      if (N % 10 == 2) {
        ans += 1;
      }
      N /= 10;
    }
    System.out.println(ans);
  }
}
