import java.io.*;
import java.util.*;
public class Main{
	static class node implements Comparable<node>{
		private int deg;
		private int id;
		public node(int deg, int id) {
			this.deg = deg;
			this.id = id;
		}
		public int compareTo(node node) {
			Integer a = this.deg;
			Integer b = node.deg;
			return a.compareTo(b);
		}
	}
	public static int n, m;
	public static List<Integer> adj[];
	public static int dist[];
	public static int ord[];
	public static node nodes[];
	public static List<Integer> rpar[];
	public static int dp[];
    public static void main(String[] args) throws IOException{
    	FastScanner sc = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	n = sc.nextInt();
    	m = sc.nextInt();
    	dist = new int[n];
    	rpar = new ArrayList[n];
    	dp = new int[n];
    	adj = new ArrayList[n];
    	nodes = new node[n];
    	ord = new int[n];
    	for(int i=0; i<n; i++) {
    		nodes[i] = new node(0,i);
    		rpar[i] = new ArrayList<>();
    		adj[i] = new ArrayList<>();
    	}
    	for(int i=0; i<m; i++) {
    		int a = sc.nextInt()-1;
    		int b = sc.nextInt()-1;
    		adj[a].add(b);
    		rpar[b].add(a);
    		nodes[b].deg++;
    	}
    	int ans = 0;
    	topsort();
    	for(int i=0; i<n; i++) {
    		if(rpar[ord[i]].size()==0) {
    			dp[ord[i]]=0;
    		}else {
    			int max = 0;
    			for(int j:rpar[ord[i]]) {
    				max = Math.max(dp[j]+1, max);
    			}
    			dp[ord[i]] = max;
    		}
    		ans = Math.max(dp[ord[i]], ans);
    	}
    	out.println(ans);
    	out.close();
    }
    public static void topsort() {
    	int idx = 0;
    	PriorityQueue<node> pq = new PriorityQueue<>();
    	for(int i=0; i<n; i++) {
    		if(nodes[i].deg==0) {
    			pq.add(nodes[i]);
    		}
    	}
    	while(!pq.isEmpty()) {
    		node curr = pq.poll();
    		ord[idx] = curr.id;
    		for(int i:adj[curr.id]) {
    			nodes[i].deg--;
    			if(nodes[i].deg==0) pq.add(nodes[i]);
    		}
    		idx++;
    	}
    }
    public static class FastScanner {
    	BufferedReader br;
    	StringTokenizer st;

    	public FastScanner(String s) {
    		try {
    			br = new BufferedReader(new FileReader(s));
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
    	}

    	public FastScanner() {
    		br = new BufferedReader(new InputStreamReader(System.in));
    	}
    	
    	String nextToken() {
    		while (st == null || !st.hasMoreElements()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    		return st.nextToken();
    	}

    	String nextLine() {
    		st = null;
    		try {
    			return br.readLine();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}

    	int nextInt() {
    		return Integer.parseInt(nextToken());
    	}

    	long nextLong() {
    		return Long.parseLong(nextToken());
    	}

    	double nextDouble() {
    		return Double.parseDouble(nextToken());
    	}
    }
}
