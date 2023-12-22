import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long lcm = lcm(c,d);
		
		long aa = (a-1)/d + (a-1)/c - (a-1)/lcm;
		long bb = b/d + b/c - b/lcm;
		
		System.out.println(b - a + 1 - bb + aa);
	}
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}