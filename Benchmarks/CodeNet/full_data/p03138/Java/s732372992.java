import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long a[];
	static long k;
	
	public static long f(long x) {
		long ans = 0;
		int n = a.length;
		for(int i = 0; i < n; ++i) {
			long tmp = x ^ a[i];
			ans += tmp;
		}
		return ans;
	}
	
	public static long digit(long x) {
		long ans = 0, tmp = x;
		while(tmp != 0) {
			tmp = tmp >> 1;
		++ans;
		}
		return ans;
	}
	
	public static long x() {
		int n = a.length;
		if(n <= 1)return k;
		long digit = digit(k);
		long max = (long)Math.pow(2,  digit - 1);
		if(k == 0)max = 0;
		long ans = a[0];
		for(int i = 1; i < n; ++i) {
			ans = ans & a[i];
		}
		if((ans & max) == 0)ans += max;
		if(ans > k) {
			ans = ans & k;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		k = sc.nextLong();
		a= new long[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextLong();
		sc.close();
		long x = x();
		long max = f(x);
		
		System.out.println(max);
	}

}
