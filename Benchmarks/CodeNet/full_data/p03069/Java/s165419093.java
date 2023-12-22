import java.util.Scanner;

class Main {

  public static final long INF = Long.MAX_VALUE / 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    String S = scanner.next();
    int[] sum = new int[N + 1];
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == '#') {
        sum[i + 1] = sum[i] + 1;
      } else {
        sum[i + 1] = sum[i];
      }
    }
    int ans = sum[N];
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == '#') {
        ans = Math.min(ans, sum[i] + N - i - 1 - (sum[N] - sum[i + 1]));
      }
    }
    System.out.println(ans);
  }
}
