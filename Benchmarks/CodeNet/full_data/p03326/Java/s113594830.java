import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  long num[][] = new long[4][N];
  int d[] = { -1, 1 };
  for (int i = 0; i < N; i++) {
    long x = sc.nextLong();
    long y = sc.nextLong();
    long z = sc.nextLong();
    for (int j = 0; j < 2; j++) {
      for (int k = 0; k < 2; k++) {
        num[2 * j + k][i] = x + y * d[j] + z * d[k];
      }
    }
  }
  for (int i = 0; i < 4; i++) {
    Arrays.sort(num[i]);
  }
  long ans = 0, sum;
  for (int i = 0; i < 4; i++) {
    sum = 0;
    for (int j = 0; j < M; j++) {
      sum += -num[i][j];
    }
    ans = Math.max(ans, sum);
    sum = 0;
    for (int j = N - 1; j > N - 1 - M; j--) {
      sum += num[i][j];
    }
    ans = Math.max(ans, sum);
  }
  System.out.println(ans);
}}