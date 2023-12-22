import java.util.*;
public class Main{

	public static void min(String[] args){

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		long dp[]=new long[n];
		for(int i=n-2;i>=0;i--){
			if(dp[i]>=dp[i+1]){
				dp[i]=dp[i+1]+1;
			}
		}

		long max=0;
		for(int i=0;i<n;i++){
			if(max<dp[i]){
				max=dp[i];
			}
		}

		System.out.println(max);
	}

}