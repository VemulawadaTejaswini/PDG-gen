import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static class Node
	{
		int a, b;
		boolean rooty = true;
		HashSet<Node> e = new HashSet<>();
		int cache=-100;
		
		public Node(int a0, int b0)
		{
			a = a0;
			b = b0;
		}
		
		int visrun = -1;
	}

	static int n;
	static Node[][] nd;
	static int run = 0;
	static int abortrun = -1;
	
	static int big = 3000000;
	
	static int maxh(Node pos, int dep)
	{
//		System.out.println("Traverse " + pos.a + " " + pos.b);
		if(pos.cache >= 0)return pos.cache;
		if(dep >= big)
		{
//			System.out.println(pos.a + " " + pos.b + " ABORT");
			abortrun = run;
		}
		
//		System.out.println("go to " + pos.a + " " + pos.b);
		if(abortrun >= run)return -1;
		pos.visrun = run;
		int ma = 1;
		for(Node e : pos.e)
		{
			ma = Math.max(ma, 1 + maxh(e, dep+1));
		}
		pos.cache = ma;
		return ma;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		nd = new Node[n][n];
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
			{
				nd[i][j] = new Node(i,j);
			}
		
		for(int i = 0; i < n; i++)
		{
			Node prev = null;
			for(int j = 0; j < n-1; j++)
			{
				int b0 = sc.nextInt()-1;
				int a = Math.min(i, b0);
				int b = Math.max(i, b0);
				Node curn = nd[a][b];
				
				if(prev != null)
				{
					prev.e.add(curn);
					curn.rooty = false;
				}
				prev = curn;
			}
		}
		
		HashSet<Node> roots = new HashSet<>();
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
			{
				if(nd[i][j].rooty)roots.add(nd[i][j]);
			}
		
		if(roots.size() <= 0)
		{
			System.out.println(-1);
			return;
		}
		
		int max = 0;
		for(Node r : roots)
		{
//			System.out.println("start from " + r.a + " " + r.b);
			run++;
			max = Math.max(max, maxh(r, 0));
			if(abortrun >= run)
			{
				System.out.println("CYC");
				System.out.println(-1);
				return;
			}
		}
		System.out.println(max);
		
	}

}
