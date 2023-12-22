import java.util.*;
public class Main {
	
	public static long gcd(long m, long n) {
        return n == 0 ? m : gcd(n, m % n);
    }
	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] x=new long[n];
		long[] y=new long[n];
		long c = 0;
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = x[i];
		}
		long t = 0;
		for(int i=0;i<n-1;i++) {
			t = lcm(x[i],x[i+1]);
			x[i+1] = t;
		}
		for(int i=0;i<n;i++) {
			c+=t/y[i];
			c%=(int)1e9+7;
		}
		System.out.print(c);
	}
}