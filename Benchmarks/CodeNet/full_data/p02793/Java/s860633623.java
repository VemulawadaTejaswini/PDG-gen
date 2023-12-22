import java.util.*;
import java.lang.*;
import java.math.*;

class Main
{
  public void run()
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    BigInteger[] b = new BigInteger[n];
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextBigInteger();
    }

    BigInteger lcm = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      lcm = lcm.multiply(b[i]).divide(lcm.gcd(b[i]));
    }

    BigInteger ans = BigInteger.ZERO;
    BigInteger mod = BigInteger.valueOf(1000000007);
    for (int i = 0; i < n; i++) {
      ans = ans.add(lcm.divide(b[i])).remainder(mod);
    }

    System.out.println(ans);
  }


  public static void main(String[] args)
  {
    new Main().run();
  }
}
