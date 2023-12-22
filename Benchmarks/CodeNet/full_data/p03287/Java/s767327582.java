import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long[] sum = new long[n];
      sum[0] = sc.nextInt();
      for(int i = 1; i < n; i++) {
        sum[i] = (sum[i-1] + (sc.nextInt() % m)) % m;
      }

      Map<Integer, Long> cntMap = new HashMap<>();
      for(int i = 0; i < n; i++) {
        int remainder = (int)(sum[i] % m);
        cntMap.put(remainder, cntMap.getOrDefault(remainder, 0L) + 1);
      }
      long cnt = cntMap.getOrDefault(0,0L);
      for(Map.Entry<Integer, Long> entry : cntMap.entrySet()) {
        if(entry.getValue() < 2) continue;
        cnt += comb(entry.getValue());
      }
        
      System.out.println(cnt);
  }

  private static long comb(long n) {
      if(n % 2 == 0)
        return n / 2 * (n - 1);
      else
        return (n - 1) / 2 * n;
  }
}