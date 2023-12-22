import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		ArrayList<int[]> list = new ArrayList<int[]>();
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			int[] add = {i, A[i]};
			list.add(add);
		}
		Collections.sort(list, (o1, o2)->Integer.compare(o2[1], o1[1]));

		long[][] dp = new long[N+1][N+1];
		for (int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				if (i+j>=N) continue;
				int[] tmp = list.get(i+j);
				if (i+1<=N) dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]+(long)tmp[1]*Math.abs(tmp[0]-i));
				if (j+1<=N) dp[i][j+1] = Math.max(dp[i][j+1], dp[i][j]+(long)tmp[1]*Math.abs((N-1-j)-tmp[0]));
			}
		}
		long ans = 0L;
		for (int i=0;i<N+1;i++) {
			ans = Math.max(ans, dp[i][N-i]);
		}
		System.out.println(ans);
	}
}