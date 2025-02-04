import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long T = sc.nextLong();
    long ans = T;
    long[] t = new long[N - 1];
    for(int i = 0; i < N; i++) {
      t[i] = sc.nextLong();
    }
    for(int i = 0; i < N - 1; i++) {
      ans += Math.min(T, t[i + 1] - t[i]);
    }
    System.out.println(ans);
  }
}