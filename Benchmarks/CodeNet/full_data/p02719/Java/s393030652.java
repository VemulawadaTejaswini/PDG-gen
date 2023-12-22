import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long k = scan.nextLong();
		if(n % k == 0) {
			System.out.println(0);
			return;
		}
		n %= k;
		System.out.println(Math.min(n, k - n));
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
