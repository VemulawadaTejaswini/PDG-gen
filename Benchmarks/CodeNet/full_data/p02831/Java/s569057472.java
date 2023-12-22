import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    in.close();
    long gcd = gcd(a,b);
    System.out.println(a/gcd*b);
  }
  
  static long gcd(long i, long j) {
    if(i>j)
      return gcd(j,i);
    while(i>0) {
      long r = j%i;
      j=i;
      i=r;
    }
    return j;
  }
}