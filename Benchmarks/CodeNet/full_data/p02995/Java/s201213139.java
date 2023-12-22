import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();

    sc.close();

    long ansA = func(A-1,C,D);

    long ansB = func(B,C,D);

    System.out.println((long)(ansB - ansA));
    
  }

  public static long func(long x, long c, long d){

    long gcd = gcd(c,d);
    
    long lcm = c / gcd * d;
    
    long ans = x - x/c - x/d + x/lcm;

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