import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static long gcd(long a, long b) {
		if(a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if(b == 0)return 1;
		long r = a % b;
		if(r == 0)return b;
		return gcd(b, r);
	}
	
	public static long lcm(long t[]) {
		int n = t.length;
		long ans = t[0];
		for(int i = 0; i < n; ++i) {
			long g = gcd(t[i], ans);
			long tmp = ans;
			if(tmp <= 0)tmp = 1;
			ans = t[i] / g;
			ans *= tmp;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		long t[];
		n = sc.nextInt();
		t = new long[n];
		for(int i = 0; i < n; ++i)t[i] = sc.nextLong();
		sc.close();
		
		Arrays.sort(t);
		long ans = lcm(t);
		System.out.println(ans);;
		
	}

}
