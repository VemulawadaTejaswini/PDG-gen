import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    ArrayList<BigInteger> list = new ArrayList<BigInteger>();
    BigInteger base = BigInteger.ONE;
    for(int i=0;i<N;i++){
      BigInteger bi = new BigInteger(sc.next());
      base = lcm(base, bi);
      list.add(bi);
    }
    base = base.subtract(BigInteger.ONE);
    BigInteger ans = BigInteger.ZERO;
    for(BigInteger bi:list){
      ans = ans.add(base.remainder(bi));
    }
    System.out.println(ans);
  }
  static BigInteger lcm (BigInteger a, BigInteger b) {
  	return a.multiply(b).divide(a.gcd(b));
  }
}
