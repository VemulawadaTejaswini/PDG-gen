import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		long[] ts = new long[n];
		for (int i = 0; i < n; i++) {
			ts[i] = sc.nextLong();
		}
		
		long tmp = ts[0];
		long ans = tmp;
		for (int i = 1; i < n; i++) {
			tmp = gcd(ans, ts[i]);
			ans = ans * (ts[i] / tmp);
		}
		
		System.out.println(ans);
	}
	
	private long gcd(long a, long b) {
		if (b == 0) return a;
		
		if (a < b) {
			long tmp = b;
			b = a;
			a = tmp;
		}
		
		return gcd(b, (a % b));
	}
}