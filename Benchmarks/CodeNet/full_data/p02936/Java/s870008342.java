import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] tree=null;
	static long [] v = null;
	static long [] vi = null;
	static boolean[] visited = null;
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int q = s.nextInt();
		tree = new ArrayList[n+1];
		visited = new boolean[n+1];
		vi = new long[n+1];
		v = new long[n+1];
		for (int i = 0; i <n-1; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if(tree[a]!=null) {
				ArrayList dat = tree[a];
				dat.add(b);
				tree[a]=dat;
			}else {
				ArrayList dat = new ArrayList<>();
				dat.add(b);
				tree[a]=dat;
			}
			if(tree[b]!=null) {
				ArrayList dat = tree[b];
				dat.add(a);
				tree[b]=dat;
			}else {
				ArrayList dat = new ArrayList<>();
				dat.add(a);
				tree[b]=dat;
			}
		}
		for (int i = 0; i < q; i++) {
			int p = s.nextInt();
			long x = s.nextLong();
			v[p]=v[p]+x;
		}		
		solveDfs(1,0L);
		String sim = "";
		for (int i = 1; i <=n; i++) {
			sim+=vi[i]+" ";
		}
		System.out.println(sim.substring(0,sim.length()-1));
	}
	public static void solveDfs(int x,long value_parent) {
		if(!visited[x]) {
			visited[x]=true;
			long vix = v[x];

			vi[x]=vix+value_parent;
				ArrayList<Integer> vals = tree[x];
				for (int i = 0; i < vals.size(); i++) {
					if(!visited[vals.get(i)])solveDfs(vals.get(i),vix+value_parent);
				}
			
		}
	}
	static class FastReader 
	{ 
	    BufferedReader br; 
	    StringTokenizer st; 

	    public FastReader() 
	    { 
	        br = new BufferedReader(new
	                 InputStreamReader(System.in)); 
	    } 

	    String next() 
	    { 
	        while (st == null || !st.hasMoreElements()) 
	        { 
	            try
	            { 
	                st = new StringTokenizer(br.readLine()); 
	            } 
	            catch (IOException  e) 
	            { 
	                e.printStackTrace(); 
	            } 
	        } 
	        return st.nextToken(); 
	    } 

	    int nextInt() 
	    { 
	        return Integer.parseInt(next()); 
	    } 

	    long nextLong() 
	    { 
	        return Long.parseLong(next()); 
	    } 

	    double nextDouble() 
	    { 
	        return Double.parseDouble(next()); 
	    } 

	    String nextLine() 
	    { 
	        String str = ""; 
	        try
	        { 
	            str = br.readLine(); 
	        } 
	        catch (IOException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	        return str; 
	    } 
	} 
}
