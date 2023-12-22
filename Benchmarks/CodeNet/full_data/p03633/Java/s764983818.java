import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long[] time = new long[n];
    long ans = 1;
    for(int i = 0; i < n; i++) time[i] = Integer.parseInt(sc.next());
    for(int i = 0; i < n; i++) {
      ans = ans * time[i] / ((ans > time[i])? gcd(ans, time[i]): gcd(time[i], ans));
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}
