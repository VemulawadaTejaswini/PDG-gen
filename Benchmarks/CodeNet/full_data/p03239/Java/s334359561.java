import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  public void solve() {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int T = sc.nextInt();

    int[] c = new int[N];
    int[] t = new int[N];
    for (int i = 0; i < N; i++) {
      c[i] = sc.nextInt();
      t[i] = sc.nextInt();
    }

    int cmin = 1001;
    for (int i = 0; i < N; i++) {
      if (t[i] <= T) {
        cmin = Math.min(cmin, c[i]);
      }
    }

    if (cmin == 1001) {
      System.out.println("TLE");
    } else {
      System.out.println(cmin);
    }
  }
}
