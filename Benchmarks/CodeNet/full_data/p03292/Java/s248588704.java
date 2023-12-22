import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int[] inp = new int[3];
    for (int i = 0; i < 3; i++) {
      inp[i] = sc.nextInt();
    }

    Arrays.sort(inp);

    int ans = 0;
    ans += Math.abs(inp[0] - inp[1]);
    ans += Math.abs(inp[1] - inp[2]);

    System.out.println(ans);
  }
}
