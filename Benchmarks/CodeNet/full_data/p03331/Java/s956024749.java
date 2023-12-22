import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = Long.MAX_VALUE;
		for(int i = 1 ; i * 2 <= n ; i++) {
			long j = n - i;
			long a = func(i);
			long b = func(j);
			ans = Math.min(a + b, ans);

		}
		System.out.println(ans);
	}

	static long func(long x) {
		long ret = 0;
		while(x > 0) {
			ret += x % 10;
			x /= 10;
		}
		return ret;
	}

}
