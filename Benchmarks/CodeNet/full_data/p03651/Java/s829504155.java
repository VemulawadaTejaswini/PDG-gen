import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int K = in.nextInt();

    int[] arr = new int[N];
    int max = -1;
    for (int i = 0; i < N; i++) {
      arr[i] = in.nextInt();
      max = Math.max(max, arr[i]);
    }

    boolean result = false;
    if (N == 1) {
      result = arr[0] == K;
    } else {
      int gcd = gcd(arr[0], arr[1]);
      for (int i = 2; i < N; i++) {
        gcd = gcd(gcd, arr[i]);
      }

      result = max >= K && (max - K) % gcd == 0;
    }

    System.out.println(result ? "POSSIBLE" : "IMPOSSIBLE");
  }

/**
 * 1を作れるか、そうじゃないかばかり考えていたけど、絶対値を取り続けたときにどんな数になるかを考えるべきだった。
 * 1じゃないときにそれがどんな数になるのかをより考えるべきだった。
 */

  public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public static long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
