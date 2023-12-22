import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args)
	{
		FastScanner in=new FastScanner();
		int n=in.nextInt();
		int m=in.nextInt();
		ArrayList<Integer>[] adj=(ArrayList<Integer>[])new ArrayList[n];
		for(int i=0;i<n;i++)
			adj[i]=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			int a=in.nextInt()-1;
			int b=in.nextInt()-1;
			adj[a].add(b);
		}
		int[] dist =new int[n];
		for(int i=0;i<n;i++)
		{
				DFS(adj,i,dist);
		}
		
		int max=0;
		for(int i: dist)
			max=Math.max(max, i);
		System.out.println(max);
	}
	
	public static void DFS(ArrayList<Integer>[] adj,int s,int[] dist)
	{
		boolean bool[]=new boolean[adj.length];
		Stack<Integer> Q=new Stack<>();
		bool[s]=true;
		Q.push(s);
		while(!Q.isEmpty())
		{
			int u=Q.pop();
			int flag=0;
			for(int i=0;i<adj[u].size();i++)
			{
					dist[adj[u].get(i)]=Math.max(dist[u],dist[u]+1);
					Q.push(adj[u].get(i));
					bool[adj[u].get(i)]=true;
			}
		}
	}

static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
