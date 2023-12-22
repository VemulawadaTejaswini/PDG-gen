import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Entry>
	{

		@Override
		public int compare(Entry o1, Entry o2) 
		{
			long val = o1.dis-o2.dis;
			if(val<0)return -1;
			else if(val > 0)return 1;
			else return 0;
		}
		
	}
	
	static class Entry
	{
		long dis;
		int node;
		int ori;
		
		public Entry(int o, int n, long d)
		{
			ori = o;
			dis = d;
			node = n;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[][] indis = new long[n][n];
		long[][] dis = new long[n][n];
		
		long[][] pdis = new long[n][n];
		
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				indis[i][j] = sc.nextLong();
				if(i>j)sum+=indis[i][j];
			}
			dis[i] = indis[i].clone();
			pdis[i] = indis[i].clone();
		}
		
		for(int k = 0; k < n; k++)
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
				{
					if(dis[i][j] > dis[i][k] + dis[k][j])
					{
						System.out.println(-1);
						return;
					}
					else if(dis[i][j] == dis[i][k] + dis[k][j] && j != k && i != k && i > j)
					{
						sum-=dis[i][j];
					}
				}
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
			{
				if(i!=j)
					pdis[i][j] = 999999999999999l;
				else pdis[i][j] = 0;
			}
		

//		System.out.println(sum);
		
		C c = new C();
		PriorityQueue<Entry> q = new PriorityQueue<>(c);
		q.add(new Entry(0,0,0));
		long br = 0;
		
		boolean[] inprim = new boolean[n];
		while(!q.isEmpty())
		{
			Entry e = q.poll();
			if(inprim[e.node])continue;
			
			//add node n
			pdis[e.ori][e.node] = Math.min(pdis[e.ori][e.node], e.dis);
			pdis[e.node][e.ori] = Math.min(pdis[e.node][e.ori], e.dis);
			inprim[e.node] = true;
			br += e.dis;
//			System.out.println("add " + e.ori + " " + e.node);
			
			for(int i = 0; i < n; i++)
			{
				if(pdis[i][e.node] > pdis[i][e.ori] + pdis[e.ori][e.node])
				{
					pdis[i][e.node] = pdis[i][e.ori] + pdis[e.ori][e.node];
					pdis[e.node][i] = pdis[i][e.node];
				}
			}
			
			//see unsatisfieds
			boolean unsat = true;
			while(unsat)
			{
				unsat = false;
				PriorityQueue<Entry> q2 = new PriorityQueue<>(c);
				for(int i = 0; i < n; i++)
				{
					if(pdis[i][e.node] > indis[i][e.node] && inprim[i])
					{
						q2.add(new Entry(i, e.node, indis[i][e.node]));
						unsat = true;
					}
				}
				
				if(!q2.isEmpty())
				{
					Entry en = q2.poll();
					pdis[en.ori][en.node] = indis[en.ori][en.node];
					pdis[en.node][en.ori] = indis[en.ori][en.node];
					br += en.dis;
					
					for(int i = 0; i < n; i++)
					{
						if(pdis[i][en.node] > pdis[i][en.ori] + pdis[en.ori][en.node])
						{
							pdis[i][en.node] = pdis[i][en.ori] + pdis[en.ori][en.node];
							pdis[en.node][i] = pdis[i][en.node];
						}
					}
				}
			}
			
			//consider edges out of n
			for(int j = 0; j < n; j++)
			{
				q.add(new Entry(e.node, j, indis[e.node][j]));
			}
			
			
			
		}
		
		System.out.println(br);
	}

}
