import java.io.*;
import java.util.*;





public class Main
{

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);	

	static class node implements Comparable<node>
	{
		int data;int indx;

		node(int i,int o)
		{
			data=i;indx=o;
		}
		public int compareTo(node n)
		{
			if(this.indx!=n.indx) return n.indx-this.indx;
			return n.data-this.data;
		}
	}
	
	


	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		// int t=Integer.parseInt(br.readLine());

		String[] s=br.readLine().split(" ");

		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);


		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

		s=br.readLine().split(" ");

		for(int i=0;i<n;i++) pq.add(Integer.parseInt(s[i]));

		node[] a=new node[m];

		for(int i=0;i<m;i++)
		{
			s=br.readLine().split(" ");
			a[i]=new node(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
		}

		Arrays.sort(a);

		for(int i=0;i<m;i++)
		{
			if(pq.peek()<a[i].indx)
			{
				while(pq.peek()<a[i].indx && a[i].data-->0)
				{
					pq.poll();
					pq.add(a[i].indx);
				}
			}
		}

		long sum=0;

		while(pq.size()>0) sum+=pq.poll();

		out.println(sum);
		
		out.close();

	}
}