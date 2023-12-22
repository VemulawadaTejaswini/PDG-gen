import java.util.*;
import java.io.*;
import java.math.BigDecimal; 
import java.math.BigInteger; 
class Main
{
	static boolean visited[];
	static long dp[][];
	static long MOD=1000000007L;
	static Hashtable<String , Long>hash=new Hashtable<>();
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		// int n=Integer.parseInt(inp.readLine());
		// String h=inp.readLine();
		// int arr[]=new int[h.length()+1];
		// arr[0]=1;
		// dp=new long[n][n+1];
		// for(int i=0;i<n;i++)
		// {
		// 	for(int j=0;j<=n;j++){dp[i][j]=-1;}
		// }
		// for(int i=0;i<h.length();i++)
		// {
		// 	if(h.charAt(i)=='<')
		// 	{arr[i+1]=1;}
		// }
		// System.out.println(get(0,0,n,arr,new boolean[n+1]));
		String ab=inp.readLine();
		int d=Integer.parseInt(inp.readLine());
		int a[]=gg(ab);
		System.out.println((get(a,d,0,1,0)-1));

	}
		// System.out.println(a);
		
	
	static long get(int i,int pre, int n, int arr[],boolean visited[])
	{
		if(i==n){return 1;}
		long ans=0;
		if(dp[i][pre]!=-1){return dp[i][pre];}
		if(arr[i]==1)
		{
			for(int k=pre+1;k<=n;k++)
			{
				if(!visited[k])
				{
					visited[k]=true;
					ans=(ans%MOD+get(i+1,k,n,arr,visited)%MOD)%MOD;
					visited[k]=false;
				}
			}
			dp[i][pre]=ans;
			return ans;
		}
		for(int k=1;k<pre;k++)
		{
			if(!visited[k])
			{
				visited[k]=true;
				ans=(ans%MOD+get(i+1,k,n,arr,visited)%MOD)%MOD;
				visited[k]=false;
			}
		}
		dp[i][pre]=ans;
		return ans;

	}
	static boolean prime(long n)
	{
		if(n==1){return false;}
        if (n <= 3) 
            return true; 
  
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
	}
	static int[] gg(String y){
		int a[]=new int[y.length()];
		for(int i=0;i<y.length();i++)
		{
			a[i]=(int)y.charAt(i)-(int)'0';
		}
		return a;
	}
	static long get(int a[], int d, int sum, int tight, int i)
	{
		if(i==a.length){if(sum%d==0){return 1;}return 0;}
		// if(dp[i][sum][tight]!=-1){return dp[i][sum][tight];}
		String s=i+" "+sum+" "+tight;
		if(hash.containsKey(i+" "+sum+" "+tight) && tight!=1){return hash.get(i+" "+sum+" "+tight);}
		long ans=0;
		
		int limit=(tight==0?9:a[i]);
			for(int j=0;j<=limit;j++)
			{
				int newt=(a[i]==j?tight:0);

				ans=(ans%MOD+get(a,d,(sum+j)%d,newt,i+1)%MOD)%MOD;
			}
			// dp[i][sum%d][tight]=ans;
			hash.put(s,ans);
			return ans;	
	}


	
	// static long bfs(int src, ArrayList<ArrayList<Integer>>arr)
	// {
	// 	Queue<Pair>q=new LinkedList<>();
	// 	q.add(new Pair(src,1,1));
	// 	visited[src]=true;
	// 	long ans=0;
	// 	while(q.size()!=0)
	// 	{
	// 		ans=0;
	// 		int size=q.size();
	// 		for(int j=0;j<size;j++)
	// 		{
	// 			Pair t=q.poll();
	// 			ans=(ans%MOD+(t.b%MOD+t.c%MOD)%MOD)%MOD;
	// 			for(Integer node:arr.get(t.a))
	// 			{
	// 				if(!visited[node])
	// 				{
	// 					visited[node]=true;
	// 					q.add(new Pair(node,t.b+t.c,t.b));
	// 				}
	// 			}
	// 		}
	// 	}
	// 	return ans%MOD;
	// }
}
class Pair
{
	
	long a;
	long b;
	Pair(long f, long h)
	{
		
		a=f;
		b=h;
	}
}