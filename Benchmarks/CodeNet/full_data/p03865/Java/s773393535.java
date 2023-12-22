import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		String s=nextLine();
		int n=s.length();
		HashSet<Integer> removable=new HashSet<>();
		int left[]=new int[n];
		int right[]=new int[n];
		for(int i=1;i<n-1;i++)
			if(s.charAt(i-1)!=s.charAt(i+1))
			{
				left[i]=i-1;
				right[i]=i+1;
				removable.add(i);
			}
		int moves=0;
		while(!removable.isEmpty())
		{
			int x=removable.iterator().next();
			removable.remove(x);
			moves++;
			right[left[x]]=right[x];
			left[right[x]]=left[x];
			if(right[x]!=n-1)
			{
				if(removable.contains(right[x]) && s.charAt(left[right[x]])==s.charAt(right[right[x]]))
					removable.remove(right[x]);
				else if(!removable.contains(right[x]) && s.charAt(left[right[x]])!=s.charAt(right[right[x]]))
					removable.add(right[x]);
			}
			if(left[x]!=0)
			{
				if(removable.contains(left[x]) && s.charAt(left[left[x]])==s.charAt(right[left[x]]))
					removable.remove(left[x]);
				else if(!removable.contains(left[x]) && s.charAt(left[left[x]])!=s.charAt(right[left[x]]))
					removable.add(left[x]);
			}
		}
		if(moves%2==0)
			out.println("Second");
		else
			out.println("First");
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