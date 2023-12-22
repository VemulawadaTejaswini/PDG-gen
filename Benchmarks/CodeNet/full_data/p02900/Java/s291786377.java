import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long gcd = getGCD(a, b);
		int count = 0;
		for (long i = 2; i <= Math.sqrt(gcd); i++) {
		    if (gcd % i == 0) {
		        if (isPrime(i)) {
		            count++;
		        }
		        while (gcd % i == 0) {
		            gcd /= i;
		        }
		    }
		}
		if (gcd > 1) {
		    if (isPrime(gcd)) {
		        count++;
		    }
		}
		System.out.println(count + 1);
    }
    
    static long getGCD(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return getGCD(b, a % b);
        }
    }
    
    static boolean isPrime(long x) {
        for (long i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
