import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long m = sc.nextLong();
    TreeMap<Long, Long> map = new TreeMap<Long, Long>();
    BigInteger ans = BigInteger.ZERO;
    long bought = 0;

    for (int i = 0; i < n; i++) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      map.put(a, b);
    }

    for (long key : map.keySet()) {
      if ((m - bought) <= 0) {
        break;
      }
      ans = ans.add(BigInteger.valueOf(key * Math.min(m - bought, map.get(key))));
      bought += map.get(key);
    }

    System.out.println(ans);

  }
}