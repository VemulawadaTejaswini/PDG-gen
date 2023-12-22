import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<BigInteger> A = new LinkedList<>();
    for (int i = 0; i < N; i++) A.add(BigInteger.valueOf(sc.nextInt()));
    sc.close();

    BigInteger lcm = A.stream().parallel()
      .reduce(BigInteger.ONE, (a, b) -> a.divide(a.gcd(b)).multiply(b));

    BigInteger ans = A.stream().parallel()
      .map(lcm::divide)
      .reduce(BigInteger::add)
      .get();

    BigInteger mod = BigInteger.valueOf(1000000007);
    System.out.println(ans.mod(mod));
  }
}
