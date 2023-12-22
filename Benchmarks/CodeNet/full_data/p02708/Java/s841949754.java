import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;
	public static long total(int n) {
		return ((long)n * (long)(n + 1)) / (long)2;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.close();
		long ans = 0, min = 0, max = 0, total = total(n);
		for (int i = k; i <= n + 1; ++i) {
			min = total(i - 1);
			max = total - total(n - i);
			// System.out.println("[\n" + min + "\n" + max + "\n" + i + " ]");
			ans += max - min + 1;
			ans %= r;
			// System.out.println(ans);
		}
		System.out.println(ans);
	}
}
