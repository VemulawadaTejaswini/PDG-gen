import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();

    sc.close();

    double ansA = func(A-1,C,D);

    double ansB = func(B,C,D);

    System.out.println((long)(ansB - ansA));
    
  }

  public static double func(long x, long c, long d){

    long gcd = gcd(c,d);
    
    long lcm = c * d / gcd;
    
    double ans = x - Math.floor(x/c) - Math.floor(x/d) + Math.floor(x/lcm);

    return ans;
  
  }

  public static long gcd(long x, long y){

    if (x < y) {
      long t = x;
      x = y;
      y = t;
    }

    while (y > 0) {
      long r = x % y;
      x = y;
      y = r;
    }

    return x;
    
  }

}