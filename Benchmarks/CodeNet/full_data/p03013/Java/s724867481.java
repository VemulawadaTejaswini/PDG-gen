import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    List<Integer> a = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      a.add(sc.nextInt());
    }
    BigDecimal d = BigDecimal.valueOf(1000000007);
    BigDecimal[] dp = new BigDecimal[N+1];
    dp[0] = BigDecimal.ONE;
    dp[1] = BigDecimal.valueOf(a.contains(1) ? 0 : 1);
    for (int i = 2; i < N+1; i++) {
      if (a.contains(i)) {
        dp[i] = BigDecimal.valueOf(0);
      } else {
        dp[i] = dp[i-1].add(dp[i-2]);
      }
    }
    System.out.println(dp[N].remainder(d));
  }
}