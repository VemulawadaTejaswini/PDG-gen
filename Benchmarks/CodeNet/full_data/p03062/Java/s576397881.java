import java.util.Scanner;

class Main {

  private static long INF = Long.MAX_VALUE / 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] A = new long[N];
    long[] comSum = new long[N + 1];
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextLong();
      comSum[i + 1] = comSum[i] + Math.abs(A[i]);
    }
    long min = INF;
    int minIdx = -1;
    for (int i = 0; i < N; i++) {
      if (Math.abs(min) > Math.abs(A[i])) {
        min = A[i];
        minIdx = i;
      }
    }
    long ans = comSum[N] - Math.abs(min);
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] < 0) {
        cnt++;
      }
    }
    if (A[N - 1] < 0 && minIdx == N - 1) {
      cnt--;
    }
    if (cnt % 2 == 0) {
      System.out.println(ans + min);
    } else {
      System.out.println(ans - min);
    }
  }

}
