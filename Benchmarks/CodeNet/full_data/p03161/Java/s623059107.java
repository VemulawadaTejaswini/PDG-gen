import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int n,k;
	//public static int count;
	public static int[] arr,dp;
	public static int frog2(int pos)
	{
		if(pos>=n-1)
			return 0;
		if(dp[pos]!=-1)
			return dp[pos];
		int cost=Integer.MAX_VALUE;
		for(int i=1;i<=k;i++)
			if(pos+i<n)
			{ cost=Math.min(cost, Math.abs(arr[pos]-arr[pos+i])+frog2(pos+i));
			  //System.out.println((count++)+" "+pos+" "+i+" "+cost);
			}
		return dp[pos]=cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		arr=new int[n];
		dp=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.fill(dp,-1);
		System.out.println(frog2(0));
	
	}

}
