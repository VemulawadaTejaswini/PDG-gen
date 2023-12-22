import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = Math.min(n, m / 2);
		m -= ans * 2;
		ans += m / 4;
		System.out.println(ans);
	}
}
