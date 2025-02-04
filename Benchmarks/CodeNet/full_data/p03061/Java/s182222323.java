import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];
		
		long[] start = new long[n];
		long[] end = new long[n];
		
		for(int i = 0; i < n; i++)a[i] = sc.nextLong();

		start[0] = a[0];
		end[n-1] = a[n-1];
		
		for(int i = 1; i < n; i++) {
			start[i] = gcd(a[i-1],a[i-1]);
		}
		
		for(int i = n-2; i >= 0; i--) {
			end[i] = gcd(a[i+1],a[i+1]);
		}
		
		long res = 0;
		
		for(int i = 1; i < n; i++) {
			res=Math.max(res, gcd(start[i],end[i]));
		}
		System.out.println(res);
		
	}
	
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}