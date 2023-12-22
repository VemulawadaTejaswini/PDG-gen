import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long x = c / gcd(c, d) * d;
		long aCount = (a - 1) / c + (a - 1) / d - (a - 1) / x;
		long bCount = b / c + b / d - b / x;
		System.out.println(b - a + 1 - (bCount - aCount));
   }
   
   static long gcd(long x, long y) {
       if (x % y == 0) {
           return y;
       } else {
           return gcd(y, x % y);
       }
   }
}
