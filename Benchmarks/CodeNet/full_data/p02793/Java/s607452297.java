import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger[] A = new BigInteger[N];
    for (int i = 0; i < N; i++) A[i] = BigInteger.valueOf(sc.nextInt());
    sc.close();

    BigInteger lcm = BigInteger.ONE;
    for (int i = 0; i < N; i++)
      lcm = lcm(lcm, A[i]);

    BigInteger mod = BigInteger.valueOf(1000000007);
    BigInteger ans = BigInteger.ZERO;
    for (int i = 0; i < N; i++) {
      ans = ans.add(lcm.divide(A[i])).mod(mod);
    }
    System.out.println(ans);
  }

  private static BigInteger lcm(BigInteger a, BigInteger b) {
    return a.divide(a.gcd(b)).multiply(b);
  }
}