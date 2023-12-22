import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	static class Edge
	{
		Node nd;
		long dis; //that node is dis to the right of this one.
		boolean vis = false;
		
		public Edge(Node n, long d)
		{
			nd = n;
			dis = d;
		}
	}
	
	static class Node
	{
		int i;
		HashSet<Edge> e = new HashSet<Edge>();
		long x = 0;
		boolean vis = false;
		
		public Node(int id)
		{
			i = id;
		}
	}
	
	static int n, m;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();

		Node[] nd = new Node[n];
		
		for(int i = 0; i < n; i++)
			nd[i] = new Node(i);
		
		for(int i = 0; i < m; i++)
		{
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			long d = sc.nextInt();
			
			nd[l].e.add(new Edge(nd[r], d));
			nd[r].e.add(new Edge(nd[l], -d));
		}

		for(int start = 0; start < n; start++)
		{
			
			Stack<Node> q = new Stack<>();
			if(nd[start].vis)continue;
			else q.add(nd[start]);
			
			while(!q.isEmpty())
			{
				Node pos = q.pop();
				
				//assign x
				if(!pos.vis)pos.x = 0;
				
				for(Edge e : pos.e)
				{
					//do e
					if(!e.vis)
					{
						if(e.nd.vis)
						{
							if(e.nd.x != pos.x + e.dis)
							{
								System.out.println("No");
								return;
							}
						}
						else e.nd.x = pos.x + e.dis;
						
						e.vis = true;
						
						//add node
						if(!e.nd.vis)
						{
							q.add(e.nd);
							e.nd.vis = true;
						}
					}
				}
			}
			
		}
		System.out.println("Yes");
	}

}
