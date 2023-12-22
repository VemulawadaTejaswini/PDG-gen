import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int k=nextInt();
		long sum=0;
		for(int i=1;i<=k;i++)
			for(int j=1;j<=k;j++)
				for(int l=1;l<=k;l++)
					sum+=gcd(gcd(i,j),l);
		out.println(sum);
	}
	int gcd(int a,int b){
	    if(a==0)
	        return b;
	    return gcd(b%a,a);
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