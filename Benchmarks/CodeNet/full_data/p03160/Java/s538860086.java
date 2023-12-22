import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(func_rec(arr,n-1));
	}
	static int func(int n,int arr[]) {
		int dp[] = new int[n];
		dp[0] = 0;
		for(int i=1;i<n;i++) {
			int ans = 0;
			if(i-1>=0) {
				ans = Math.abs(arr[i]-arr[i-1])+dp[i-1];
			}
			if(i-2>=0) {
				ans = Math.min(ans, Math.abs(arr[i]-arr[i-2])+dp[i-2]);
			}
			dp[i] = ans;
		}
		return dp[n-1];
	}
	static int func_rec(int arr[],int i) {
		if(i==0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		if(i-2>=0) {
			ans = func_rec(arr,i-2)+Math.abs(arr[i]-arr[i-2]);
		}
		int ans1 = Integer.MAX_VALUE;
		if(i-1>=0) {
			ans1 = func_rec(arr,i-1)+Math.abs(arr[i]-arr[i-1]);
		}
		return Math.min(ans1,ans);
	}

}
