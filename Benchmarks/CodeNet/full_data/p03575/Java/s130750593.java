import java.util.*;
import java.io.*;


// class TestClass
public class Main {

    public static int V, E;
    public static Vector<Integer>[] adjList;
    public static boolean[] vis, ap;
    public static int[] disc, low, parent;
    public static PriorityQueue<Pair> bridges;

    public static int cnt1, cnt2;

    public static void main(String args[] ) throws Exception {
        Kattio in = new Kattio(System.in);
        
        V       = in.nextInt();
        E       = in.nextInt();

        adjList = new Vector[V];

        vis     = new boolean[V];
        ap      = new boolean[V];
        
        bridges = new PriorityQueue<Pair>();

        parent  = new int[V];
        disc    = new int[V];
        low     = new int[V];

        for(int i = 0; i < V; i++) {
            adjList[i] = new Vector<Integer>();
            parent[i] = i;
            ap[i] = vis[i] = false;
            disc[i] = 0;
            low[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < E; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;

            adjList[u].add(v);
            adjList[v].add(u);
        }

        cnt1 = cnt2 = 0;
        DFS(0, 0);

        /*in.println(cnt1);
        for(int u = 0; u < V; u++) {
            if(ap[u]) in.print(u+" ");
        } in.println();
		*/		
        
        in.println(cnt2);
        /*while(!bridges.isEmpty()) {
            in.println(bridges.poll());
        }*/


        in.flush();
        in.close();
 	}

    public static void DFS(int u, int time) {
        vis[u] = true;
        disc[u] = low[u] = time+1;
        int child = 0;

        for(Integer v: adjList[u]) {

            if(!vis[v]) {

                ++child;
                parent[v] = u;
                DFS(v, time+1);
                low[u] = Math.min(low[u], low[v]);

                if(parent[u] == u && child > 1) { // the root
                    ap[u] = true;
                    cnt1++;
                } else if(parent[u] != u && low[v] >= disc[u]){
                    ap[u] = true;
                    cnt1++;
                } 

                if(low[v] > disc[u]) {
                    bridges.offer(new Pair(v, u));
                    cnt2++;
                }

            }else if(parent[u] != v) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }


 	private static class Kattio extends PrintWriter {

	    private BufferedReader r;
	    private String line;
	    private StringTokenizer st;
	    private String token;
		
	    public Kattio(InputStream i) {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(i));
	    }
	    public Kattio(InputStream i, OutputStream o) {
			super(new BufferedOutputStream(o));
			r = new BufferedReader(new InputStreamReader(i));
	    }

	    public boolean hasNext() {
	    	return peekToken() != null;
	    }

	    public int nextInt() {
	    	return Integer.parseInt(nextToken());
	    }

	    public double nextDouble() { 
	    	return Double.parseDouble(nextToken());
	    }

	    public long nextLong() {
	    	return Long.parseLong(nextToken());
	    }

	    public String next() {
	    	return nextToken();
	    }
	    
	    public String nextLine() {
	    	token = null;
	    	st = null;
	    	try {
	    		return r.readLine();
	    	} catch (IOException e) {
	    		return null;
	    	}
	    }

	    private String peekToken() {
			if (token == null) 
			    try {
					while (st == null || !st.hasMoreTokens()) {
					    line = r.readLine();
					    if (line == null) return null;
					    st = new StringTokenizer(line);
					}
					token = st.nextToken();
			    } catch (IOException e) { }
			return token;
	    }

	    private String nextToken() {
			String ans = peekToken();
			token = null;
			return ans;
	    }
	}
}


class UnionFind {                                              
  private Vector<Integer> p, rank, setSize;
  private int numSets;

  public UnionFind(int N) {
    p = new Vector<Integer>(N);
    rank = new Vector<Integer>(N);
    setSize = new Vector<Integer>(N);
    numSets = N;
    for (int i = 0; i < N; i++) {
      p.add(i);
      rank.add(0);
      setSize.add(1);
    }
  }

  public int findSet(int i) { 
    if (p.get(i) == i) return i;
    else {
      int ret = findSet(p.get(i)); p.set(i, ret);
      return ret; } }

  public Boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

  public void unionSet(int i, int j) { 
    if (!isSameSet(i, j)) { numSets--; 
    int x = findSet(i), y = findSet(j);
    // rank is used to keep the tree short
    if (rank.get(x) > rank.get(y)) { p.set(y, x); setSize.set(x, setSize.get(x) + setSize.get(y)); }
    else                           { p.set(x, y); setSize.set(y, setSize.get(y) + setSize.get(x));
                                     if (rank.get(x) == rank.get(y)) rank.set(y, rank.get(y) + 1); } } }
  public int numDisjointSets() { return numSets; }
  public int sizeOfSet(int i) { return setSize.get(findSet(i)); }
}




class Pair implements Comparable<Pair> {
	int f, s;

	public Pair(int f, int s) {

        if(f < s) {
            this.f = f;
            this.s = s;
        }else {
            this.s = f;
            this.f = s;
        }
	}

	@Override
	public int compareTo(Pair e) {
		if(this.f == e.f) return this.s - e.s;
        return this.f - e.f;
	} 

    @Override
    public String toString() {
        return f+" "+s;
    }
}