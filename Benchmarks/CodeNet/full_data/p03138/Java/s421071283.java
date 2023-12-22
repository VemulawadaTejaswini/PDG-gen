import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		
		
		long cnt1[] = new long[61];//各桁の1の数
		for(int i=60;i>=0;i--) {
			for(int j=0;j<N;j++) {
				if((A[j]>>i&1)==1) cnt1[i]++; 
			}
		}
		
		long dp[][] = new long[62][2]; //dp[決まった桁数][未満フラグ]
		
		dp[0][0]=0;
		for(int d=0;d<=60;d++) {
			long cnt = cnt1[60-d];
			long apply = cnt * (long)Math.pow(2, 60-d);
			long N2 = N * (long)Math.pow(2, 60-d);
			if((K>>(60-d)&1)==1) {
				
				dp[d+1][1] = Math.max(dp[d][0]+apply,  dp[d][1]+Math.max(apply, N2-apply));
				
				dp[d+1][0] = dp[d][0] + (N2-apply);

			}
			else {
				//0しか選べない
				dp[d+1][0] = dp[d][0] + apply;
				dp[d+1][1] = dp[d][1] + apply;
			}
		}
		
		System.out.println(Math.max(dp[61][0] ,dp[61][1]));
	}
}
