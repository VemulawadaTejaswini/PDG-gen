import java.math.BigInteger;
import java.util.*;

public class Main{
  public static long inved(long a, long modulo){
    long x = 1, y = 0, u = 0, v = 1, k = a, l = modulo;
    long tmp;
    while (l != 0){
      tmp = x;
      x = u;
      u = tmp - u * (k / l);
      tmp = y;
      y = v;
      v = tmp - v * (k / l);
      tmp = k;
      k = l;
      l = tmp % l;
    }
    return (x + modulo) % modulo;
  }
  public static BigInteger gcd(BigInteger a, BigInteger b){
    BigInteger x = a, y = b;
    BigInteger tmp;
    while (y != BigInteger.ZERO){
      tmp = x;
      x = y;
      y = tmp.mod(y);
    }
    return x;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long modulo = (long)1e9 + 7;
    int n = sc.nextInt();
    long a[] = new long[n];
    BigInteger L = BigInteger.ONE;
    BigInteger t;
    for (int i=0;i<n;i++){
      a[i] = sc.nextLong();
      t = gcd(L, BigInteger.valueOf(a[i]));
      t = BigInteger.valueOf(a[i]).divide(t);
      L = L.multiply(t);
    }
    long S = 0l;
    for (int i=0;i<n;i++){
      S += inved(a[i], modulo);
      S %= modulo;
    }
    L = L.multiply(BigInteger.valueOf(S));
    System.out.println(L.mod(BigInteger.valueOf(modulo)));
  }
}