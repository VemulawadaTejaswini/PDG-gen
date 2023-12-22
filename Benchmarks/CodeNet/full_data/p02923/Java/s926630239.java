import java.util.*;
public class Main{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long A[]=new long[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextLong();
		}
		
		long dp[]=new long[n];
		for(int i=n-2;i>=0;i--){
			if(A[i]>=A[i+1]){
				dp[i]=dp[i+1]+1;
			}
			else dp[i]=0;
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(dp[i]+" ");
//		}
		long max=0;
		for(int i=0;i<n;i++){
			if(max<dp[i]){
				max=dp[i];
			}
		}

		System.out.println(max);
	}


}