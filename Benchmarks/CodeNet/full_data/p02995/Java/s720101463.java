import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();

    sc.close();

    long lcm_ = lcm(C, D);

    long A1 = A / C;
    long B1 = B / C;
    long AB1 = B1 - A1;
    if (A % C == 0) {
      AB1++;
    }

    long A2 = A / D;
    long B2 = B / D;
    long AB2 = B2 - A2;
    if (A % D == 0) {
      AB2++;
    }

    long A3 = A / lcm_;
    long B3 = B / lcm_;
    long AB3 = B3 - A3;
    if (A % lcm_ == 0) {
      AB3++;
    }

    long AB = AB1 + AB2 - AB3;

    System.out.println(B - A + 1 - AB);

  }

  public static long gcd(long x, long y){

    if (y == 0) {
      return x;
    }
    
    return gcd(y, x % y);
    
  }

  public static long lcm(long x, long y) {

		return x / gcd(x, y) * y;
  
  }

}