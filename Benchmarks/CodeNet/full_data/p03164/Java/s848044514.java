
import java.util.*;



import java.io.*;
public class Main {

//	public static void max_self(int a,int b) {
//		a=Math.max(a, b);
//	}
	public static void main(String[] args) {
	FastScanner sc=new FastScanner();
	int n=sc.nextInt(),w=sc.nextInt();
	int a[][]=new int[n][2];
	int sum_val=0;
	for(int i=0;i<n;i++) {
		a[i][0]=sc.nextInt();
		a[i][1]=sc.nextInt();
	sum_val+=a[i][1];
	}
	
	
	long dp[]=new long[sum_val+1];
	for(int i=0;i<n;i++) {
	
		for(int value_taken=sum_val-a[i][1];value_taken>=0;value_taken--) {
			dp[value_taken+a[i][1]]=Math.min(dp[value_taken+a[i][1]], dp[value_taken]+a[i][0]);
		}
		
	}
	long ans=0;
	for(long i:dp) 
		if(i<=w)
		ans=Math.max(ans, i);
	
	
	System.out.println(ans);


	}
	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}
	

}

