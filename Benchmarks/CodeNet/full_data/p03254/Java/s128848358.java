import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int N = sc.nextInt();
    long x = sc.nextInt();
    long[] as = new long[N];
    for (int i = 0; i < N; i++) {
      as[i] = sc.nextInt();
    }
    Arrays.sort(as);

    long rest = x;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (rest >= as[i]) {
        if (i != N - 1) {
          cnt++;
          rest -= as[i];
        } else {
          if (rest == as[i]){
            cnt++;
            rest -= as[i];
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
