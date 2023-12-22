import java.util.*;

public class Main {
  
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
 
    long lcm = (C * D) / gcd(D, C);
    
    System.out.println(count(B, C, D, lcm) - count(A-1, C, D, lcm));
  }
  
  private static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }
  
  private static long count(long n, long C, long D, long lcm) {
    return n - n/C - n/D + n/lcm;
  }
}