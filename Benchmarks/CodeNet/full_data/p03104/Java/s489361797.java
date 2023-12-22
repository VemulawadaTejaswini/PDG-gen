import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = func(b);
    if(a > 0) ans = func(b) ^ func(a - 1);
    System.out.println(ans);
  }

  public static long func(long x) {
    if(x == 0) return 0;
    if(x == 1) return 1;
    long ret = 1;
    if((x % 2) == 0) {
      ret = ret / 2;
      ret = (ret % 2);
      ret = (ret ^ x);
    } else {
      ret = (x + 1) / 2;
      ret = (ret % 2);
    }
    return ret;
  }
}
