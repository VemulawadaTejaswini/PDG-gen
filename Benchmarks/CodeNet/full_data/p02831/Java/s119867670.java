
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		return lcm(A, B);
	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		} else {
			int absA = Math.abs(a);
			int absB = Math.abs(b);
			int mx = Math.max(absA, absB);
			int mn = Math.min(absA, absB);
			return gcd(mx % mn, mn);
		}
	}

	public static int lcm(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		else {
			int gcd = gcd(a, b);
			return Math.abs(a * b) / gcd;
		}
	}
}
