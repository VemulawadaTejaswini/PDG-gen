import java.io.*;
import java.util.*;

public class Main{

	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		int [][]a=new int [m][2];
		for(int i=0;i<m;i++)
			for(int j=0;j<2;j++)
				a[i][j]=sc.nextInt()-1;
		DSU dsu=new DSU(n);
		long []ans=new long [m];
		long pairs=n*1L*(n-1)/2;
		for(int i=m-1;i>=0;i--) {
			int u=a[i][0],v=a[i][1];
			ans[i]=(pairs);
			pairs-=dsu.unionSet(u, v);
		}
		for(long x:ans)
			out.println(x);
		out.close();

	}
	static class DSU {                                              
		int[] p, rank, setSize;
		int numSets;

		public DSU(int N) 
		{
			p = new int[numSets = N];
			rank = new int[N];
			setSize = new int[N];
			for (int i = 0; i < N; i++) {  p[i] = i; setSize[i] = 1; }
		}

		public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }

		public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

		public long unionSet(int i, int j) 
		{ 
			if (isSameSet(i, j)) 
				return 0;
			numSets--; 
			int x = findSet(i), y = findSet(j);
			long a=setSize[x],b=setSize[y];
			if(rank[x] > rank[y]) { p[y] = x; setSize[x] += setSize[y]; }
			else
			{	p[x] = y; setSize[y] += setSize[x];
				if(rank[x] == rank[y]) rank[y]++; 
			} 
			return a*b;
		}

		public int numDisjointSets() { return numSets; }

		public int sizeOfSet(int i) { return setSize[findSet(i)]; }
	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
		
	}
}
