
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int[][] dp=new int[n][k+1];
		for(int i=0;i<n;i++)
			Arrays.fill(dp[i], -1);
		System.out.println(rec(arr,0,k,dp));
		
	}
	public static int rec(int[] arr, int i,int k,int[][] dp) {
		if(k<0) {
			return 0;
		}
		if(i==arr.length) {
			if(k==0)
				return 1;
			else
				return 0;
		}
		if(dp[i][k]!=-1)
			return dp[i][k];
		int res=0;
		for(int j=0;j<=arr[i];j++) {
			res+=rec(arr,i+1,k-j,dp);
			res=res%1000000007;
		}
		dp[i][k]=res%1000000007;
		return res;
	}
	
}
