import java.util.*;
import java.math.BigInteger;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(kaijou(N));
  }
  
  public static BigInteger kaijou(int num) {
    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= num; i++) {
      result = result.multiply(BigInteger.valueOf(i));
      result = result.remainder(BigInteger.valueOf(1000000007));
    }
    return result;
  }
}