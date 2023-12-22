import java.util.*;
public class Main {

  private static int MOD = 998244353;

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer, Integer> distMap = new HashMap<>();
      for(int i = 0; i < n; i++)  {
        int num = sc.nextInt();
        if(i == 0 && num != 0) {
          System.out.println(0);
          return;
        }
        distMap.put(num, distMap.getOrDefault(num, 0) + 1);
      }

      if(distMap.getOrDefault(0, 0) != 1) {
        System.out.println(0);
        return;
      }

      long res = 1;
      long prev = 1;
      for(int i = 1; i < distMap.size(); i++) {
        int curCnt = distMap.getOrDefault(i, 0);
        if(curCnt == 0) {
          res = 0;
          break;
        }
        long curRes = modPow(prev, curCnt) % MOD;
        res = (res % MOD) * curRes % MOD;
        prev = curCnt;
      }

      System.out.println(res % MOD);
  }

  private static long modPow(long a, long b) {
    if(b == 0)
      return 1;
    if(b == 1)
      return a;

    long res = modPow(a, b / 2) % MOD;
    if(b % 2 == 1)
      return (res * res % MOD) * a % MOD;
    return res * res % MOD;
  }
}