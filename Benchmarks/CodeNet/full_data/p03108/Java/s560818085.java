import java.io.*;
import java.util.*;
import java.lang.*;





public class Main {
		
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[m];
		int link[]=new int[m];
		UnionFind UF=new UnionFind(n);
		for (int i = 0; i < m; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int ans=0;
		for (int i = m-1; i>=0; i--) {
			
				if(UF.same(a[i]-1,b[i]-1)) {
					link[i]=0;
					
					UF.union(a[i]-1,b[i]-1);
				}else {
					link[i]=UF.size[UF.find(a[i]-1)]*UF.size[UF.find(b[i]-1)];
					UF.union(a[i]-1,b[i]-1);
					
					
				}
				
	
		
		}
		
		for(int i=0;i<m;i++) {
			ans+=link[i];
			System.out.println(ans);
		}
	
		
				
		
		
	}
	
	

	
	
	
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
	}
	
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}

class UnionFind{
	int parent[];
	int rank[];
	int size[];
	UnionFind(int n) {
		parent=new int[n];
		rank=new int[n];
		size=new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
			rank[i]=0;
			size[i]=1;
		}
	}
	
	void union(int x,int y) {
		int xRoot=find(x);
		int yRoot=find(y);


		if(xRoot!=yRoot) {
			
			if(rank[xRoot]>rank[yRoot]) {
				parent[yRoot]=xRoot;
				size[xRoot]+=size[yRoot];
				
			}else if(rank[xRoot]<rank[yRoot]){
				parent[xRoot]=yRoot;
				size[yRoot]+=size[xRoot];
				
			}else {
				parent[yRoot]=xRoot;
				rank[xRoot]++;
				size[xRoot]+=size[yRoot];
			}
		}
		
	}
	
	int find(int x) {
		if(parent[x]==x) {
			return x;
		}else {
			return find(parent[x]);
		}
		
	}
	
	boolean same(int x,int y) {
		return find(x)==find(y);
	}
	
	
	
}
