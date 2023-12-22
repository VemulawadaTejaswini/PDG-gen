import java.util.*;
import java.lang.*;
import java.io.*;
 public class Main{
	static int n;
	static int w;
	 static long[][]dp=new long[n+1][w+1];
	static long solve(int n,int w,int[]weight,int[]values){
		if(n==0||w==0)
			return 0;
		if(dp[n][w]!=0)
			return dp[n][w];
		if(weight[n-1]>w)
			return dp[n][w]= solve(n-1,w,weight,values);
		else
			return dp[n][w]=Math.max(solve(n-1,w,weight,values),solve(n-1,w-weight[n-1],weight,values)+values[n-1]);

	}
	public static void main(String[] args)throws IOException {		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[]s1=s.split(" ");
		int n=Integer.parseInt(s1[0]);
		int[]weight=new int[n];
		int[]values=new int[n];
		int w=Integer.parseInt(s1[1]);
		for(int i=0;i<n;i++){
			String d=br.readLine();
			String[]d1=d.split(" ");
			int a=Integer.parseInt(d1[0]);
			weight[i]=a;
			int b=Integer.parseInt(d1[1]);
			values[i]=b;
		}
	System.out.println(solve(n,w,weight,values));
	}
}