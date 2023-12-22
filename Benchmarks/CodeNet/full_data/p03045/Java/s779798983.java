import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static int[] par;
	static int[] rank;
	
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
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		par = new int[n];
		rank = new int[n];
		int[] found = new int[n];
		for(int i = 0; i < n; i++)
			par[i] = i;
		
		for(int i = 0; i < m; i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();
			union(a,b);
		}
		
		int qt = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++)
		{
			set.add(root(i));
		}
		System.out.println(set.size());

	}

}
