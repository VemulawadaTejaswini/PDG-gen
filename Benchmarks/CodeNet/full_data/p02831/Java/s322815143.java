import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    in.close();
    
    BigInteger ba = BigInteger.valueOf(a);
    BigInteger bb = BigInteger.valueOf(b);
    BigInteger gcd = ba.gcd(bb);
    System.out.println(ba.multiply(bb).divide(gcd).toString());
  }
}
    