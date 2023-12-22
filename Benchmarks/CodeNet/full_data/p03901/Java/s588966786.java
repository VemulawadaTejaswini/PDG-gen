
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;


public class Main {
	
	class Graph {
		Node[] nodes;

		public Graph(int n) {
			nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node(i);
			}
		}

		public void addEdge(int from, int to, int weight) {
			nodes[from].add(new Edge(nodes[from], nodes[to], weight));
		}

		public void addBiEdge(int n1, int n2, int weight) {
			addEdge(n1, n2, weight);
			addEdge(n2, n1, weight);
		}
	}

	class Node extends ArrayList<Edge> {
		int idx;
		int distance = Integer.MAX_VALUE;
		int prev;
		public Node(int idx) {
			this.idx = idx;
		}

	}

	class Edge {
		Node from;
		Node to;
		int weight;

		public Edge(Node from, Node to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}
	long X, P;
	public void solve(){
		X = nextLong();
		P = nextLong();
		out.println((X + 1) / 2);
	}


	//負の値でその集合の数
	class UnionFind{
		int[] tree;
		public UnionFind(int n){
			tree = new int[n];
			for(int i = 0; i < n; i++){
				tree[i] = -1;
			}
		}
		
		public int root(int x){
			if(tree[x] < 0) return x;
			else return tree[x] = root(tree[x]);
		}
		
		public boolean find(int x, int y){
			return root(x) == root(y);
		}
		
		public int union(int x, int y){
			x = root(x);
			y = root(y);
			if(x != y){
				if(tree[x] < tree[y]){
					tree[y] += tree[x];
					tree[x] = y;
					return -tree[y];
				}else{
					tree[x] += tree[y];
					tree[y] = x;
					return -tree[x];
				}
			}
			return -tree[x];
		}
		
		public int size(int x){
			return -tree[root(x)];
		}
	}

	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
		int c;
		while (!isAlNum(c = read())) {
		}
		StringBuilder build = new StringBuilder();
		build.append((char) c);
		while (isAlNum(c = read())) {
			build.append((char) c);
		}
		return build.toString();
	}

	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;

	private static int read() {
		if (bufferLength < 0)
			throw new RuntimeException();
		if (bufferIndex >= bufferLength) {
			try {
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufferLength <= 0)
				return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}