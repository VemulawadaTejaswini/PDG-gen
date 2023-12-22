import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solve(sc.nextLong(),sc.nextLong()));
	}
	
	public static long solve(long n,long s) {
		long sqrtN = sqrtFloor(n);
		for(long b=2;b<=sqrtN;b++) {
			if (f(b,n) == s) {
				return b;
			}
		}

		if (n < s) {
			return -1;
		}
		
		ArrayList<Long> divisors = divisors(n-s);
		long min = Long.MAX_VALUE;
		for(long d: divisors) {
			long b = d + 1;
			if (f(b,n) == s) {
				min = Math.min(min, b);
			}
		}
		
		return min == Long.MAX_VALUE ? -1 : min;
	}
	
	public static long f(long b,long n) {
		long sum = 0;
		while(n > 0) {
			sum += n % b;
			n /= b;
		}
		return sum;
	}
	
	public static long sqrtFloor(long x) {
		long y = (long) Math.sqrt(x);
		return x >= y * y ? y : y - 1;
	}
	
	public static ArrayList<Long> divisors(long x) {
		ArrayList<Long> divisors = new ArrayList<>();
		for(long i=1;i*i<=x;i++) {
			if (x % i == 0) {
				divisors.add(i);
				if (i * i != x) {
					divisors.add(x/i);
				}
			}
		}
		return divisors;
	}
	
}
