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

    BigInteger lcm = Arrays.stream(A).parallel()
        .reduce(BigInteger.ONE, (a, b) -> a.divide(a.gcd(b)).multiply(b));

    BigInteger mod = BigInteger.valueOf(1000000007);
    BigInteger ans = Arrays.stream(A).parallel()
      .map(lcm::divide)
      .reduce(BigInteger.ZERO, (a, b) -> a.add(b));

    System.out.println(ans.mod(mod));
  }
}