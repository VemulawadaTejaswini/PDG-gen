import java.util.Scanner;
public class Main {
	public static long cel(long a, long b) {
		long ans;
		if(a % b == 0)
			return 2 * a - b;
		ans = a / b * 2 * b + cel(b, a % b);
		return ans;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			long n, x, ans;
			n = cin.nextLong();
			x = cin.nextLong();
			ans = n + cel(n - x, x);
			System.out.println(ans);
		}
	}
}
