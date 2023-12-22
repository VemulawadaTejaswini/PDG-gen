import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int x[]=new int[n+1];
		for(int i=1;i<=n;i++)
			x[i]=nextInt();
		int d[]=new int[n+1];
		for(int i=1;i<=n;i++)
			d[i]=x[i]-x[i-1];
		int m=nextInt();
		long k=nextLong();
		int swap[]=new int[n+1];
		for(int i=1;i<=n;i++)
			swap[i]=i;
		for(int i=1;i<=m;i++)
		{
			int a=nextInt();
			int temp=swap[a];
			swap[a]=swap[a+1];
			swap[a+1]=temp;
		}
		Permutations perm=new Permutations();
		swap=perm.exp(swap,k);
		d=perm.multiply(d,swap);
		double curr=0;
		for(int i=1;i<=n;i++)
			out.println(curr+=d[i]);
	}
	class Permutations
	{
		int[] exp(int a[],long k)
		{
			int n=a.length-1;
		    int ret[]=new int[n+1];
		    for(int i=1;i<=n;i++)
		    	ret[i]=i;
		    while(k>0)
		    {
		        if(k%2==1)
		            ret=multiply(ret,a);
		        a=multiply(a,a);
		        k=k/2;
		    }
		    return ret;
		}
		int[] multiply(int a[],int b[])
		{
			int n=a.length-1;
			int c[]=new int[n+1];
			for(int i=1;i<=n;i++)
				c[i]=a[b[i]];
			return c;
		}
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}