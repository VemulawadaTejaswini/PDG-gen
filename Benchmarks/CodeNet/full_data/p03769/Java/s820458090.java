import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		long N=nextLong();
		ArrayList<Integer> ans=solve(N+1);
		out.println(2*ans.size());
		for(int i:ans)
			out.print(i+" ");
		for(int i=1;i<=ans.size();i++)
			out.print(i+" ");
	}
	ArrayList<Integer> solve(long N)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		if(N==1)
			return ans;
		if(N%2==0)
		{
			ArrayList<Integer> curr=solve(N/2);
			curr.add(curr.size()+1);
			ans=curr;
		}
		else
		{
			ArrayList<Integer> curr=solve(N-1);
			ans.add(curr.size()+1);
			ans.addAll(curr);
		}
		return ans;
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