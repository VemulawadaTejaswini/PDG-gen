import java.io.*;
import java.util.*;
public class Main {
	static long [] [] k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int [] wt = new int [n];
		int [] vl = new int [n];
		for(int i=0;i<n;i++)
		{
			st = new StringTokenizer(br.readLine());
			wt[i]=Integer.parseInt(st.nextToken());
			vl[i]=Integer.parseInt(st.nextToken());
		}
		k=new long[n][w];
		for(int i=0;i<n;i++)
		{
			Arrays.fill(k[i],-1);
		}
		System.out.println(knapsack(w,n,vl,wt));
	}
	public static long knapsack(int w , int n , int [] vl, int [] wt )
	{
		if(w==0||n==0)
			return 0;
		if(wt[n-1]>w)
		{
			if(k[n-1][w-1]==-1)
				k[n-1][w-1]=knapsack(w, n-1, vl, wt);
			return k[n-1][w-1];
			
		}
		else
		{
			if(k[n-1][w-1]==-1)
				k[n-1][w-1]=Math.max(vl[n-1]+knapsack(w-wt[n-1], n-1, vl, wt), knapsack(w, n-1, vl, wt));
			return k[n-1][w-1];			
		}
	}
}
