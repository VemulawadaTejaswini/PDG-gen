import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt()-1;
		int t = sc.nextInt()-1;
		ArrayList<ArrayList<Edge>> GA = new ArrayList<>();
		ArrayList<ArrayList<Edge>> GB = new ArrayList<>();
		for(int i = 0; i < n; i++){
			GA.add(new ArrayList<Edge>());
			GB.add(new ArrayList<Edge>());
		}
		for(int i = 0; i < m; i++){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int a = sc.nextInt();
			int b = sc.nextInt();
			GA.get(u).add(new Edge(u, v, a));
			GA.get(v).add(new Edge(v, u, a));
			GB.get(u).add(new Edge(u, v, b));
			GB.get(v).add(new Edge(v, u, b));
		}
		
		long[] routeA = dijkstra(GA, s);
		long[] routeB = dijkstra(GB, t);
		ArrayList<Node> list = new ArrayList<>();
		for(int i = 0; i < n; i++){
			list.add(new Node(i, routeA[i] + routeB[i]));
		}
		
		Collections.sort(list, (n1, n2)->(n1.cost == n2.cost) ? 0 : (n1.cost < n2.cost) ? -1 : 1);
		boolean[] canUse = new boolean[n];
		Arrays.fill(canUse, true);
		int index = 0;
		for(int i = 0; i <= n-1; i++){
			System.out.println((long)1e15 - list.get(index).cost);
			canUse[i] = false;
			while(!canUse[list.get(index).index] && index < n-1) index++;
		}
	}
	
	long[] dijkstra(ArrayList<ArrayList<Edge>> G, int start){
		long[] dist = new long[G.size()];
		Arrays.fill(dist, Long.MAX_VALUE / 2);
		dist[start] = 0;
		PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>((n1, n2)->(n1.cost == n2.cost) ? 0 : (n1.cost < n2.cost) ? -1 : 1);
		priorityQueue.add(new Node(start, 0));
		
		while(!priorityQueue.isEmpty()){
			Node node = priorityQueue.poll();
			if(dist[node.index] < node.cost) continue;
			for(Edge e : G.get(node.index)){
				if(dist[e.to] > dist[node.index] + e.cost){
					dist[e.to] = dist[node.index] + e.cost;
					priorityQueue.add(new Node(e.to, dist[e.to]));
				}
			}
		}
		
		return dist;
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class Node{
	int index;
	long cost;
	public Node(int i, long c){
		index = i; cost = c;
	}
}

class Edge implements Comparable<Edge>{
	int from;
	int to;
	long cost;
	public Edge(int f, int t, long c){
		from = f;
		to = t;
		cost = c;
	}
	@Override
	public int compareTo(Edge o) {
		if(this.cost == o.cost) return 0;
		else{
			return (this.cost < o.cost) ? -1 : 1;
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}