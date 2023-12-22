
import java.io.*;
import java.util.*;

public class Main {
	
	class Node{
		int idx;
		ArrayList<Node> edge;
		int[] cost;
		int child;
		boolean flg;
		public Node(int idx){
			this.idx = idx;
			cost = new int[N];
			Arrays.fill(cost, -1);
			edge = new ArrayList<>();
		}
	}
	
	int N;
	int K;
	Node[] nodes;
	int ans = Integer.MAX_VALUE;
	
	public void solve(){
		N = nextInt();
		K = nextInt();
		nodes = new Node[N];
		
		for(int i = 0; i < N; i++){
			nodes[i] = new Node(i);
		}
		
		for(int i = 0; i < N - 1; i++){
			int a = nextInt() - 1;
			int b = nextInt() - 1;
			nodes[a].edge.add(nodes[b]);
			nodes[b].edge.add(nodes[a]);
		}
		recur(nodes[0]);
		r2(nodes[0], 0);
		out.println(ans);
		
	}
	
	public int recur(Node n){
		if(n.flg){
			return 0;
		}
		int sum = 0;
		n.flg = true;
		for(Node nn : n.edge){
			sum += recur(nn);
		}
		n.flg = false;
		n.child = sum;
		
		return sum + 1;
	}
	
	public int r2(Node cur, int on){
		if(cur.flg){
			return 0;
		}
		if(ans <= on){
			return 0;
		}

		cur.flg = true;
		for(int i = 0; i <= (K - i); i++){
			for(int j = 0; j < cur.edge.size(); j++){
				if(cur.edge.get(j).flg) continue;
				int sum = r3(cur.edge.get(j), i);
				
				for(int k = 0; k < cur.edge.size(); k++){
					if(j == k) continue;
					sum += r3(cur.edge.get(k), K - i);
				}
				ans = Math.min(ans, sum + on);
			}
		}
		
		for(Node n : cur.edge){
			if(!n.flg){
				r2(n, on + cur.child + 1 - n.child);
			}
		}

		cur.flg = false;
		return 0;
		
	}
	

	public int r3(Node cur, int path){
		if(cur.flg){
			return 0;
		}
		
		if(path == 0){
			return cur.child + 1;
		}
		
		if(path == 1){
			return cur.child;
		}
		if(cur.cost[path] != -1){
			return cur.cost[path];
		}
		
		int sum = 0;
		cur.flg = true;
		for(Node nn : cur.edge){
			sum += r3(nn, path - 1);
		}
		cur.flg = false;
		
		return cur.cost[path] = sum ;
		
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