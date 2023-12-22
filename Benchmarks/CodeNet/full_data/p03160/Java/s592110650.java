import java.util.*;
import java.io.*;
class Main {
	static int n,arr[];
	static long dp[];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=1;
//		Integer.parseInt(br.readLine().trim());
		StringBuilder printans=new StringBuilder();
		while(t-->0)
		{
			n=Integer.parseInt(br.readLine().trim());
			arr=new int[n];
			int sum=0;
			StringTokenizer tok=new StringTokenizer(br.readLine()," ");
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(tok.nextToken());
				sum+=arr[i];
			}
			dp=new long[n];
			memset();
			
			printans.append(call());
		    
		}
		System.out.println(printans);

	}
	static void memset() {
		
			
		
	}
	static long call() {
		for(int i=0;i<n;i++) {
			if(i<2) {
				dp[0]=0;
				dp[1]=Math.abs(arr[1]-arr[0]);
			}
			else {
				dp[i]=Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]),dp[i-2]+Math.abs(arr[i]-arr[i-2]));
			}
		}
		return dp[dp.length-1];
	}

}
