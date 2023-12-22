import java.util.Scanner;

public class Main {
	
	private static int dp[];
	private static int util(int arr[],int start,int end) {
		
		if(start >= end-1) return 0;
		
		if(dp[start] != 0) return dp[start];
		if(start + 2 < end) {
			return dp[start] = Math.min(Math.abs(arr[start] - arr[start + 1]) + util(arr,start + 1,end) , Math.abs(arr[start] - arr[start + 2]) + util(arr,start + 2,end));
		}else {
			return dp[start] = Math.abs(arr[start] - arr[start + 1] ) + util(arr,start + 1,end);
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp = new int[n+1];
		System.out.println(util(arr,0,n));
		sc.close();
	}

}
