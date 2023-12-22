import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		Long[] v = new Long[N];
		for(int i=0; i<N; i++)
			v[i] = sc.nextLong();
		
		Arrays.sort(v);
//		, new Comparator<Long>(){
//			public int compare(Long l1, Long l2) {
//				return -Long.compare(l1, l2);
//			}
//		});
		long[][] dp = new long[51][51];
	    dp[0][0] = 1;
	    dp[1][0] = 1;
	    dp[1][1] = 1;
		for(int i=2; i<51; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
			for(int j=1; j<i; j++) {
				dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
			}
		}
		double maxAve = 0;
		long sum = 0;
		for(int i=1; i<=A; i++)
			sum += v[N-i];
		maxAve = (double)sum/(double)A;
		
		long ans = 0;
		if(A==N) {
			ans = 1;
		} else {
			if(v[N - A] > v[N - A - 1]) {
				ans = 1;
			} else {
				int K = 0,L = 0;
				for(int i=0; i<N; i++)
					if(v[i]==v[N-A])
						K++;
				for(int i=N-A; i<N; i++)
					if(v[i]==v[N-A])
						L++;


				if(v[N-1]==v[N-A])
					for(int i=A; i<=B; i++)
						ans += dp[K][i];
				else
					ans = dp[K][L];
			}
		}		
		System.out.println(maxAve);
		System.out.println(ans);
		
		sc.close();
	}
}