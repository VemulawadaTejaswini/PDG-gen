import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
    }
    int ans = Integer.MAX_VALUE;
    for (int p = 1; p <= N; p++) {
      int sum = 0;
      for (int x : X) {
        sum += (x - p) * (x - p);
      }
      ans = Math.min(ans, sum);
    }
    System.out.println(ans);
  }
}
