import java.util.Scanner;
import java.math.BigInteger;

public class Main {  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger[] T = new BigInteger[N+1];
    for (int i =1; i<=N; i++) {
      T[i] = sc.nextBigInteger();
    }
    BigInteger ans = T[1];
    for (int i =2; i<=N; i++) {
      ans = lcm(T[i],ans);
    }
    System.out.print(ans);  
  }
  
  static BigInteger lcm(BigInteger a, BigInteger b) {
    BigInteger tmp = a.remainder(b);
    BigInteger c = a;
    c = c.multiply(b);
    while (!tmp.equals(BigInteger.ZERO)) {
      a = b;
      b = tmp;
      tmp = a.remainder(b);
      if (tmp.equals(BigInteger.ZERO)) break;
    }
    return c.divide(b);
  }
}