import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		String s=" "+nextLine();
		int n=s.length()-1;
		int k=nextInt();
		ArrayList<String> list=new ArrayList<>();
		for(int i=1;i<=n;i++)
			for(int j=1;j<=5 && i+j-1<=n;j++)
				list.add(s.substring(i,i+j));
		Collections.sort(list);
		String prev="#";
		for(String i:list)
		{
			if(i.equals(prev))
				continue;
			else
			{
				k--;
				prev=i;
				if(k==0)
				{
					out.println(i);
					return;
				}
			}
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