import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long origN = n;
      List<Long> list = new ArrayList<>();
      for(long i = 2; i <= n; i++) {
        while(n > 1 && n % i == 0) {
          list.add(i);
          n /= i;
        }
      }
      long res = 1;
      long minDigit = Integer.MAX_VALUE;
      for(int i = 0; i < (1 << list.size()); i++) {
        long curRes = 1;
        for(int j = 0; j < list.size(); j++) {
          if(((i >> j) & 1) == 1) {
            curRes *= list.get(j);
          }
        }
        minDigit = Math.min(minDigit, calDigit(Math.max(curRes, origN / curRes)));
      }

      System.out.println(minDigit);
  }

  private static long calDigit(long n) {
    long cnt = 0;
    while(n > 0) {
      cnt++;
      n /= 10;
    }
    return cnt;
  } 
}