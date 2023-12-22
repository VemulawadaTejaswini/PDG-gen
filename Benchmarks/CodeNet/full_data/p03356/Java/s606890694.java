import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static int n, m;
	static int[] par;
	static int[] rank;
	
	static class Bag
	{
		HashSet<Integer> con = new HashSet<>();
	}
	
	static void union(int x, int y)
	{
		int rx = root(x);
		int ry = root(y);
		
		if(rank[rx] >= rank[ry])
		{
			par[ry] = rx;
			if(rank[rx] == rank[ry])
				rank[rx]++;
		}
		else par[rx] = ry;
	}
	
	static int root(int x)
	{
		if(par[x] != x)
			par[x] = root(par[x]);
		return par[x];
	}
	
	static int[] ya, xa, a;
	static Bag[] bags;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[n];
		xa = new int[m];
		ya = new int[m];
		bags = new Bag[n];
		
		par = new int[n];
		rank = new int[n];
		
		
		for(int i = 0; i < n; i++)
		{
			par[i] = i;
			a[i] = sc.nextInt()-1;
		}
		
		for(int i = 0; i < m; i++)
		{
			xa[i] = sc.nextInt()-1;
			ya[i] = sc.nextInt()-1;
			
			union(xa[i],ya[i]);
		}
		
		for(int i = 0; i < n; i++)
		{
			bags[i] = new Bag();
		}
		for(int i = 0; i < n; i++)
		{
			bags[root(i)].con.add(i);
		}
		
		int scr = 0;
		for(int i = 0; i < n; i++)
		{
			Bag bag = bags[i];
			for(int c : bag.con)
			{
				if(bag.con.contains(a[c]))scr++;
			}
		}
		System.out.println(scr);
	}

}
