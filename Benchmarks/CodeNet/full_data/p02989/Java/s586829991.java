import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		int n = sc.nextInt();
		int cnt[] = new int[LEN + 1];
		int sum[] = new int[LEN + 1];
		Arrays.fill(cnt, 0);
		sum[0] = 0;
		for(int i = 0; i < n; i++) {
			cnt[sc.nextInt()]++;
		}
		for(int i = 1; i <= LEN; i++) {
			sum[i] = sum[i - 1] + cnt[i];
		}
		int ans = 0;
		for(int i = 0; i <= LEN; i++) {
			if(sum[LEN] - sum[i] == sum[i])ans++;
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
