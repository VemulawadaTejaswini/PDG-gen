import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int N = sc.nextInt();
		int[] x = new int[N + 1];
		x[0] = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			x[i] = sc.nextInt();
		}
		
		Arrays.sort(x);
		
		long ans = 0;
		for(int i = 1; i <= N; i++) {
			long diff = x[i] - x[i - 1];
			ans = gcd(ans, diff);
		}
		
		System.out.println(ans);
	}
	
	static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}