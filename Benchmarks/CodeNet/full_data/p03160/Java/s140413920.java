import java.util.Scanner;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	private static int dp[];
	public static int findMinCost(int arr[],int n){
		if(n>=arr.length)
			return Integer.MAX_VALUE;
		if(n==arr.length-1)
			return 0;
		
		if(dp[n]!=Integer.MAX_VALUE)
			return dp[n];
		
		int n1=n+2<arr.length?findMinCost(arr,n+2)+Math.abs(arr[n]-arr[n+2]):Integer.MAX_VALUE;
		int n2=n+1<arr.length?findMinCost(arr,n+1)+Math.abs(arr[n]-arr[n+1]):Integer.MAX_VALUE;
		
		dp[n] = Math.min(n1,n2);
		return dp[n];
	}
	
	public static void main(String []args){
		int n=sc.nextInt();
		int arr[]=new int[n];
		dp=new int[arr.length];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			dp[i]=Integer.MAX_VALUE;
		}
		System.out.println(findMinCost(arr,0));
	}
}