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
      lcm = lcm.divide(lcm.gcd(A[i])).multiply(A[i]);

    BigInteger mod = BigInteger.valueOf(1000000007);
    BigInteger ans = BigInteger.ZERO;
    for (int i = 0; i < N; i++)
      ans = ans.add(lcm.divide(A[i]));
    System.out.println(ans.mod(mod));
  }
}