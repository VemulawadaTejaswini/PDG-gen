import java.math.BigInteger;
import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long gcd = c * d / gcd(c , d);
		
		long acc = (a - 1) / c;
		long add = (a - 1)  /d;
		long acd = (a - 1) / gcd;
		
		long bcc = b / c;
		long bdd = b / d;
		long bcd = b / gcd;
		
		long ansa = a - (acc + add - acd);
		long ansb = b - (bcc + bdd - bcd);

		
		
		System.out.println(ansb - ansa + 1);
		
		
		
		

		
		
	}
	
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
}

 