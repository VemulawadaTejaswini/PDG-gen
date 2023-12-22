
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=1;i<=Math.sqrt(n);i++) {
			list.add(i);
		}
		for (int i=(int)Math.floor(Math.sqrt(n));i>=1;i--) {
			if (list.get(list.size()-1)<n/i) {
				list.add(n/i);
			}
		}
		//System.out.println(list);
		
		int m = list.size();
		long[] dp = new long[m];
		long[] dp2 = new long[m];
		
		for (int i=0;i<m;i++) {
			dp[i]=1;
		}
		
		for (int j=0;j<k;j++) {
			dp2[m-1]=dp[0];
			for (int i=m-2;i>=0;i--) {
				dp2[i]=(dp2[i+1]+(list.get(m-1-i)-list.get(m-2-i))*dp[m-i-1])%MOD;
			}
			long[] tmp = dp;
			dp = dp2;
			dp2 = tmp;
		//	System.out.println(Arrays.toString(dp));
		}
		
		System.out.println(dp[0]);
	}



}


