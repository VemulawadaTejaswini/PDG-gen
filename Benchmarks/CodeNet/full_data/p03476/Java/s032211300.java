import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		boolean[] flag = new boolean[100001];
		flag[0] = flag[1] = true;
		int[] dp = new int[100001];
		dp[0] = dp[1] = 0;
		for(int i = 2; i < 100001; i++) {
			if(flag[i]) {
				dp[i] = dp[i - 1];
				continue;
			}
			if(!flag[(i + 1) / 2]) {
				dp[i] = dp[i - 1] + 1;
			} else {
				dp[i] = dp[i - 1];
			}
			for(int j = i * 2; j < 100001; j += i) {
				flag[j] = true;
			}
		}
		for(int i = 0; i < q; i++) {
			System.out.println(dp[r[i]] - dp[l[i] - 1]);
		}
	}
}
