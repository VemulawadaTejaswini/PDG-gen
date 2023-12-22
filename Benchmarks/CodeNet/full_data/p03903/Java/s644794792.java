import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	static ContestScanner in;static Writer out;
	public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
	void solve() throws NumberFormatException, IOException{
		final int n = in.nextInt();
		final int m = in.nextInt();
		List<Edge>[] node = new List[n];
		Pair[] vs = new Pair[n];
//		Queue<Integer>[] query = new Queue[n];
		for(short i=0; i<n; i++){
//			query[i] = new ArrayDeque<>();
			vs[i] = new Pair(0, i);
			node[i] = new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			final short a = (short)(in.nextInt()-1);
			final short b = (short)(in.nextInt()-1);
			final int c = in.nextInt();
			Edge ea = new Edge(b, c);
			Edge eb = new Edge(a, c);
			ea.rev = eb;
			eb.rev = ea;
			node[a].add(ea);
			node[b].add(eb);
		}
		mst = Prim.getMst(node);
		final long cost = Prim.cost;
		final int q = in.nextInt();
		long[] st = new long[q];
		final long mask = (1L<<30)-1;
		for(int i=0; i<q; i++){
			final int s = in.nextInt()-1;
			final int t = in.nextInt()-1;
			st[i] = (long)s<<30 | t;
//			query[s].add(i);
//			query[t].add(i);
			vs[s].a++;
			vs[t].a++;
		}
		int[][] query = new int[n][];
		for(int i=0; i<n; i++){
			query[i] = new int[vs[i].a];
			vs[i].a = 0;
		}
		for(int i=0; i<q; i++){
			final short s = (short)(st[i]>>30);
			final short t = (short)(st[i]&mask);
			query[s][vs[s].a++] = i;
			query[t][vs[t].a++] = i;
		}
		short[] table = new short[n];
		Arrays.sort(vs);
		for(short i=0; i<n; i++){
			table[vs[i].b] = i;
		}
		best = new int[n];
		BitSet used = new BitSet(q);
		for(int i=n-1; i>=0; i--){
			final short v = vs[i].b;
			if(vs[i].a == 0) continue;
			dfs(v, (short)-1, 0);
			for(int qid: query[v]){
//			while(!query[v].isEmpty()){
//				final int qid = query[v].poll();
				if(used.get(qid)) continue;
				used.set(qid);
				final int t = (int)((st[qid]&mask)==v ? st[qid]>>30 : st[qid]&mask);
				vs[table[t]].a--;
				st[qid] = cost-best[t];
			}
		}
		for(int i=0; i<q; i++){
			out.println(st[i]);
		}
	}
	
	int[] best;
	List<Edge>[] mst;
	void dfs(short cur, short par, int max){
		best[cur] = max;
		for(Edge e: mst[cur]){
			if(e.to == par) continue;
			dfs(e.to, cur, Math.max(max, e.c));
		}
	}
}

class Prim{
	static long cost;
	static List<Edge>[] getMst(List<Edge>[] node){
		final int n = node.length;
		Queue<Edge> qu = new PriorityQueue<>();
		List<Edge>[] res = new List[n];
		for(int i=0; i<n; i++) res[i] = new ArrayList<>();
		for(Edge e: node[0]) qu.add(e);
		boolean[] used = new boolean[n];
		used[0] = true;
		cost = 0;
		while(!qu.isEmpty()){
			Edge e = qu.poll();
			if(used[e.to]) continue;
			used[e.to] = true;
			final int from = e.rev.to;
			res[from].add(e);
			res[e.to].add(e.rev);
			cost += e.c;
			for(Edge ne: node[e.to]){
				qu.add(ne);
			}
		}
		return res;
	}
}

class Edge implements Comparable<Edge>{
	short to;
	int c;
	Edge rev;
	Edge(short to, int c){
		this.to = to;
		this.c = c;
	}
	@Override
	public int compareTo(Edge o) {
		return Integer.compare(c, o.c);
	}
}

class Pair implements Comparable<Pair>{
	int a; short b;final int hash;Pair(int a,short b){this.a=a;this.b=b;hash=(a<<16|a>>16)^b;}
	public boolean equals(Object obj){Pair o=(Pair)(obj);return a==o.a&&b==o.b;}
	public int hashCode(){return hash;}
	public int compareTo(Pair o){if(a!=o.a)return a<o.a?-1:1;else if(b!=o.b)return b<o.b?-1:1;return 0;}
}
class Writer extends PrintWriter{
	public Writer(String filename)throws IOException
	{super(new BufferedWriter(new FileWriter(filename)));}
	public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
	private BufferedReader in;private int c=-2;
	public ContestScanner()throws IOException 
	{in=new BufferedReader(new InputStreamReader(System.in));}
	public ContestScanner(String filename)throws IOException
	{in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
	public String nextToken()throws IOException {
		StringBuilder sb=new StringBuilder();
		while((c=in.read())!=-1&&Character.isWhitespace(c));
		while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public String readLine()throws IOException{
		StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
		while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public long nextLong()throws IOException,NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt()throws NumberFormatException,IOException
	{return(int)nextLong();}
	public double nextDouble()throws NumberFormatException,IOException 
	{return Double.parseDouble(nextToken());}
	public void close() throws IOException {in.close();}
}