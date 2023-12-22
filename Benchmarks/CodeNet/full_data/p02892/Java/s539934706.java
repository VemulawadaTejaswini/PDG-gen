import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static class Node
	{
		int i;
		int mark = -999;
		int run = -999;
		HashSet<Node> e = new HashSet<Node>();
		
		public Node(int id)
		{
			i = id;
		}
	}
	
	static int best = -1;
	static int run;
	static int cur = 0;
	static boolean quit = false;
	
	static void go(Node pos)
	{
		pos.run = run;
		
		int minadj = 9999999;
		int a = 0;
		int b = 0;
		for(Node e : pos.e)
		{
			if(e.run != run)
			{

			}
			else
			{
				if(e.mark < minadj)
				{
					if(minadj==9999999)
					{
						minadj = e.mark;
						a++;
					}
					else
					{
						if(minadj-e.mark!=2 || b>0)
						{
//							if(run == 4)
//								System.out.println("Collide " + pos.i + " " + e.i);
							quit = true;
							return;
						}
						else
						{
							minadj = e.mark;
							b = a;
							a++;
						}
					}
				}
				else if(e.mark == minadj)a++;
				else if(e.mark == minadj+2)b++;
				else
				{
//					if(run == 4)
//						System.out.println("Collide " + pos.i + " " + e.i);
					quit = true;
					return;
				}
			}
		}
		
		if(minadj == 9999999)minadj = 0;
		pos.mark = minadj+1;
//		System.out.println(pos.i + " becomes " + pos.mark + ", minadj "+  minadj);
		cur = Math.max(cur, pos.mark);
		for(Node e : pos.e)
		{
			if(e.run != run)
			{
				e.mark = pos.mark+1;
				
				go(e);
			}
		}
	}

	static Node[] nd;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nd = new Node[n];
		
		for(int i = 0; i<n;i++)
		{
			nd[i]=new Node(i);
		}
		for(int i = 0; i < n; i++)
		{
			String s = sc.next();
			for(int j = 0; j < n; j++)
			{
				if(s.charAt(j) == '1')
					nd[i].e.add(nd[j]);
			}
		}
		
		for(run = 0; run < n; run++)
		{
//			System.out.println("\n\n\n go " + run);
			quit = false;
			cur = 0;
			nd[run].run = run;
			nd[run].mark = 1;
			go(nd[run]);
			if(!quit)best = Math.max(best, cur);
//			System.out.println("end with " + cur);
		}
		
		System.out.println(best);
	}

}
