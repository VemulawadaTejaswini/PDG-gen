

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
	//Ford-Fulkerson algorithm implementation practice
	//problem link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_7_A
	static int v;
	
	static class Node
	{
		int id;
//		ArrayList<Edge> edges = new ArrayList<>();
		
		HashMap<Integer, Integer> resflow = new HashMap<>();
		
		void incflow(int i, int flow)
		{
			if(resflow.containsKey(i))
				resflow.put(i, resflow.get(i)+flow);
			else
				resflow.put(i, flow);
		}
		
		public Node(int i)
		{
			id = i;
		}
	}
	
	static class Edge
	{
		Node node;
		int flow = 0;
		int resflow = 0;
		
		public Edge(int fl)
		{
			flow = fl;
			resflow = fl;
		}
	}
	
	static Node[] node;

	public static void main(String[] args) 
	{
//		System.out.println("Aygreets!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//do here
		int[] rx = new int[n];
		int[] ry = new int[n];
		int[] bx = new int[n];
		int[] by = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			rx[i] = sc.nextInt();
			ry[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			bx[i] = sc.nextInt();
			by[i] = sc.nextInt();
		}
		
		int x = n;
		int y = n;
//		e = sc.nextInt();
		
		v = 2*n+2;
		node = new Node[v];
		
		for(int i = 0; i < v; i++)
			node[i] = new Node(i);
		
		//0 is source
		//
		for(int a = 0; a < n; a++)
		{
			for(int b = 0; b < n; b++)
			{
				if(rx[a]<bx[b]&&ry[a]<by[b])
				{
					int flow = 1; //flow that can still flow through this edge.
					
					node[a+1].incflow(n+b+1, flow);
					node[n+b+1].incflow(a, 0);
//					System.out.println("Flow " + a + " " + b);
				}
				else
				{
//					System.out.println("No flow " + a + " " + b + ", " + rx[b] + " " + ry[b]);
				}
			}
		}
		
		for(int i = 1; i < x+1; i++)
		{ //add flow from source to x
			node[0].incflow(i, 1);
		}
		
		for(int i = x+1; i < v-1; i++)
		{ //add flow from y to sink
			node[i].incflow(v-1, 1);
		}
		
		//This part is the same as standard Ford-Fulkerson
		int[] par = new int[v];
		
		//Traverse.
		boolean keepgoing = true;
		int sunk = 0;
		
		while(keepgoing)
		{ //keep finding augmenting paths until it's determined that there isn't one.
			keepgoing = false;
			int pos = -1;
			
			boolean[] visited = new boolean[v];
			int[] flowing = new int[v];
			
			Stack<Integer> stack = new Stack<>();
			stack.add(0);
			flowing[0] = 999999999;
			//DFS
			while(!stack.isEmpty())
			{
				pos = stack.pop();
				Node nd = node[pos];
				
				if(!visited[pos])
				{
					visited[pos] = true;
					
					if(pos == v-1)
					{ //reached sink
						keepgoing = true;
						int backpos = pos;
						int flow = flowing[pos];
						sunk += flow;
						
						while(backpos != 0)
						{ //backtrack; update residual capacities.
							node[backpos].incflow(par[backpos], flow);
							node[par[backpos]].incflow(backpos, -flow);
							backpos = par[backpos];
						}
						
						break;
					}
					
					for(int ed : nd.resflow.keySet())
					{ //find unvisited nodes that can have flow flow from this node
						int res = nd.resflow.get(ed);
						if(res > 0 && !visited[ed])
						{ //can flow here
							stack.add(ed);
							flowing[ed] = Math.min(flowing[pos], res);
							par[ed] = pos;
						}
					}
				}
			}
		}
		
		System.out.println(sunk);
	}

}
