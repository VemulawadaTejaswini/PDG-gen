import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), sum = 0;
    int[] W = new int[N];
    for (int i = 0; i < N; i++) {
      W[i] = sc.nextInt();
      sum += W[i];
    }
    int ans = 1000000000;
    for (int i = 0, tmp = 0; i < N; i++) {
      tmp += W[i];
      ans = Math.min(ans, Math.abs(tmp * 2 - sum));
    }
    System.out.println(ans);
  }
}