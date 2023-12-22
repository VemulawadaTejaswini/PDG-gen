import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p = sc.nextInt();

      long[] cnt = new long[2];
      for(int i = 0; i < n; i++)
        cnt[sc.nextInt() % 2]++;

      long res = (long)Math.pow(2.0, cnt[0]);
      long num = 0;
      if(p == 0) {
        for(int i = 0; i <= cnt[1]; i+=2)
          num += comb(cnt[1], i);
      } else {
        for(int i = 1; i <= cnt[1]; i+=2)
          num += comb(cnt[1], i);
      }
      res *= num;
      System.out.println(res);
  }

  private static long comb(long a, long b) {
    long sum = 1;
    for(int i = 0; i < b; i++) {
      sum *= (a - i);
    }
    for(int i = 1; i<= b; i++)
      sum /= i;
    return sum;
  }
}