import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long m = sc.nextLong();
    long[] mod = new long[(int)m];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      sum = (sum + a) % m;
      mod[(int)sum]++;
    }
    long ans = mod[0];
    for(int i = 0; i < (int)m; i++) {
      ans += ((mod[i] * (mod[i] - 1)) / 2);
    }
    System.out.println(ans);
  }
}