import java.util.*;

public class Main {
	static int r = 998244353;

	public static long mypow(long a, long b) {
		if (a == 1)
			return 1;
		if (b == 1)
			return a % r;
		long ans = 1;
		for (int i = 0; i < b; ++i) {
			ans *= a;
			ans %= r;
		}
		return ans;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n + 1];
		int len[] = new int[n];
		for (int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			d[i + 1] = tmp;
			len[tmp]++;
		}
		sc.close();
		int num = len[1];
		int pre = num;
		long ans = 0;
		if (len[0] != 0) {
			ans = 1;
			for (int i = 2; i < n; ++i) {
				pre = len[i];
				long tmp = mypow((long) num, (long) pre);
				ans *= tmp;
				ans %= r;
				num = len[i];
			}
		}
		System.out.println(ans);
	}
}
