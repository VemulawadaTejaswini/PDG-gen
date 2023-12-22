import java.io.*;
import java.util.*;
 
public class Main{
	
	class Node{
		ArrayList<Path> next;
		int idx;
		int cost = Integer.MAX_VALUE;
		int flg = 0;
		public Node(int idx){
			this.idx = idx;
			next = new ArrayList<>();
		}
	}
	
	class Path{
		Node from;
		Node to;
		int c;
		public Path(int c, Node from, Node to){
			this.c = c;
			this.from = from;
			this.to = to;
		}
	}
	int N;
	int M;
	Node[] nodes;
	
	public void solve(){
		N = nextInt();
		M = nextInt();
		nodes = new Node[N];
		for(int i = 0; i < N; i++){
			nodes[i] = new Node(i);
		}
		for(int i = 0; i < M; i++){
			int p = nextInt() - 1;
			int q = nextInt() - 1;
			int c = nextInt() - 1;
			nodes[p].next.add(new Path(c, nodes[p], nodes[q]));
			nodes[q].next.add(new Path(c, nodes[q], nodes[p]));
		}
		ArrayDeque<Node> queue = new ArrayDeque<>();
		nodes[0].cost = 0;
		queue.add(nodes[0]);
		while(!queue.isEmpty()){
			Node n = queue.removeFirst();
			if(n.idx == N - 1) break;
			int c = n.cost;
			for(Path p : n.next){
				recur(queue, p, c + 1);
			}
			
		}
		if(nodes[N - 1].cost == Integer.MAX_VALUE){
			out.println(-1);
		}else{
			out.println(nodes[N - 1].cost);
		}
	}
	
	public void recur(ArrayDeque<Node> queue, Path p, int cost){
		Node n = p.to;
		if(n.flg == 1){
			return;
		}
		n.flg = 1;
		if(n.cost >= cost){
			n.cost = cost;
			queue.add(n);
			for(Path pp : n.next){
				if(pp.c == p.c){
					recur(queue, pp, cost);
				}
			}
		}
		n.flg = 0;
	}
	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}