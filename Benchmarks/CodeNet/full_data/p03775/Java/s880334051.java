import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = Long.MAX_VALUE;
		
		for (long a = 1; a*a <= n; a++) {
			if (n%a==0) {
				long b = n / a;
				long calc = f(a,b);
				ans = Math.min(ans,calc);
			} else {
				continue;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
	
	static int f (long a, long b) {
		long max = Math.max(a,b);
		String str = String.valueOf(max);
		return str.length();
	}
	
}
