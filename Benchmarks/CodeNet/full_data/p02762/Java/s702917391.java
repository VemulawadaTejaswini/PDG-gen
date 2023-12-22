import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

class DisjointSet
{
	private int[] parent;
	private int[] size;
	
	public DisjointSet(int n)
	{
		parent = new int[n];
		size = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			parent[i] = i;
			size[i] = 1;
		}
	}
	public int find(int v)
	{
		int u = v;
		while(u != parent[u])
			u = parent[u];
		v = parent[v];
		while(v != parent[v])
		{
			int temp = parent[v];
			parent[v] = u;
			size[v] = 1;
			v = temp;
		}
		return u;
	}
	public void union(int a, int b)
	{
		a = find(a);
		b = find(b);
		if(a != b)
		{
			if(size[a] < size[b])
			{
				int temp = a;
				a = b;
				b = temp;
			}
			parent[b] = a;
			size[a] += size[b];
		}
	}
	public int size(int v)
	{
		v = find(v);
		return size[v];
	}
	public boolean isInTheSameSet(int a, int b)
	{
		return find(a) == find(b);
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n, m, k;
		int[] ans, direct;
		n = scanner.nextInt();
		m = scanner.nextInt();
		k = scanner.nextInt();
		DisjointSet dsu = new DisjointSet(n + 1); 
		ans = new int[n + 1];
		direct = new int[n + 1];
		for(int i = 0, u, v ; i < m ; i++)
		{
			u = scanner.nextInt();
			v = scanner.nextInt();
			direct[v] += 1;
			direct[u] += 1;
			dsu.union(u, v);
		}
		for(int v = 1 ; v <= n ; v++)
		{
			ans[v] = dsu.size(v) - direct[v] - 1;
		}
		for(int i = 0, u, v ; i < k ; i++)
		{
			u = scanner.nextInt();
			v = scanner.nextInt();
			if(dsu.isInTheSameSet(u, v))
			{
				ans[u] -= 1;
				ans[v] -= 1;
			}
		}
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}
}