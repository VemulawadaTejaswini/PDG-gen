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
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;static StringBuilder sb=new StringBuilder();
	public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
	static void dump(int[]a){sb.setLength(0);for(int i=0;i<a.length;i++)
	sb.append(a[i]).append(" ");out.println(sb.toString().trim());}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d ",a[i]);out.println();}
	static void dump(long[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	static long pow(long a,int n){long r=1;while(n>0){if((n&1)==1)r*=a;a*=a;n>>=1;}return r;}
	static String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	static void sort(int[]a){m_sort(a,0,a.length,new int[a.length]);}
	static void sort(int[]a,int l){m_sort(a,0,l,new int[l]);}
	static void sort(int[]a,int l,int[]buf){m_sort(a,0,l,buf);}
	static void sort(int[]a,int s,int l,int[]buf){m_sort(a,s,l,buf);}
	static void m_sort(int[]a,int s,int sz,int[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int x=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[x++]=a[r++];else b[x++]=a[l++];}
	while(r<re)b[x++]=a[r++];while(l<le)b[x++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];
	} /* qsort(3.5s)<<msort(9.5s)<<<shuffle+qsort(17s)<Arrays.sort(Integer)(20s) */
	static void sort(long[]a){m_sort(a,0,a.length,new long[a.length]);}
	static void sort(long[]a,int l){m_sort(a,0,l,new long[l]);}
	static void sort(long[]a,int l,long[]buf){m_sort(a,0,l,buf);}
	static void sort(long[]a,int s,int l,long[]buf){m_sort(a,s,l,buf);}
	static void m_sort(long[]a,int s,int sz,long[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int x=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[x++]=a[r++];else b[x++]=a[l++];}
	while(r<re)b[x++]=a[r++];while(l<le)b[x++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];}
	static void swap(long[]a,int i,int j){final long t=a[i];a[i]=a[j];a[j]=t;}
	static void swap(int[]a,int i,int j){final int t=a[i];a[i]=a[j];a[j]=t;}
	static int binarySearchSmallerMax(int[]a,int v)// get maximum index which a[idx]<=v
	{int l=-1,r=a.length-1,s=0;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	static int binarySearchSmallerMax(int[]a,int v,int l,int r)
	{int s=-1;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	static List<Integer>[]graph(int n){List<Integer>[]g=new List[n];
	for(int i=0;i<n;i++)g[i]=new ArrayList<>();return g;}
	void solve() throws NumberFormatException, IOException{
		int n = in.nextInt();
		int m = in.nextInt();
		List<Edge>[] node = new List[n];
		Pair[] vs = new Pair[n];
		Queue<Integer>[] query = new Queue[n];
		for(int i=0; i<n; i++){
			query[i] = new ArrayDeque<>();
			vs[i] = new Pair(0, i);
			node[i] = new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			int c = in.nextInt();
			Edge ea = new Edge(b, c);
			Edge eb = new Edge(a, c);
			ea.rev = eb;
			eb.rev = ea;
			node[a].add(ea);
			node[b].add(eb);
		}
		mst = Prim.getMst(node);
		long cost = Prim.cost;
		int q = in.nextInt();
		int[] qs = new int[q];
		int[] qt = new int[q];
		for(int i=0; i<q; i++){
			int s = in.nextInt()-1;
			int t = in.nextInt()-1;
			qs[i] = s;
			qt[i] = t;
			query[s].add(i);
			query[t].add(i);
			vs[s].a++;
			vs[t].a++;
		}
		Arrays.sort(vs);
		best = new int[n];
		boolean[] used = new boolean[q];
		long[] ans = new long[q];
		for(int i=n-1; i>=0; i--){
			final int v = vs[i].b;
			if(vs[v].a == 0) continue;
			dfs(v, -1, 0);
			while(!query[v].isEmpty()){
				final int qn = query[v].poll();
				if(used[qn]) continue;
				used[qn] = true;
				int t;
				if(v == qs[qn]){
					t = qt[qn];
				}else{
					t = qs[qn];
				}
				vs[t].a--;
				ans[qn] = cost-best[t];
			}
		}
		for(int i=0; i<q; i++){
			out.println(ans[i]);
		}
	}
	
	int[] best;
	List<Edge>[] mst;
	void dfs(int cur, int par, int max){
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
	int to, c;
	Edge rev;
	Edge(int to, int c){
		this.to = to;
		this.c = c;
	}
	@Override
	public int compareTo(Edge o) {
		return Integer.compare(c, o.c);
	}
}

class MultiSet<T> extends HashMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public MultiSet<T> merge(MultiSet<T> set)
	{MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
}
class OrderedMultiSet<T> extends TreeMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public OrderedMultiSet<T> merge(OrderedMultiSet<T> set)
	{OrderedMultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	while(!s.isEmpty()){l.add(s.firstEntry().getKey(),s.pollFirstEntry().getValue());}return l;}
}
class Pair implements Comparable<Pair>{
	int a,b;final int hash;Pair(int a,int b){this.a=a;this.b=b;hash=(a<<16|a>>16)^b;}
	public boolean equals(Object obj){Pair o=(Pair)(obj);return a==o.a&&b==o.b;}
	public int hashCode(){return hash;}
	public int compareTo(Pair o){if(a!=o.a)return a<o.a?-1:1;else if(b!=o.b)return b<o.b?-1:1;return 0;}
}
class Timer{
	long time;public void set(){time=System.currentTimeMillis();}
	public long stop(){return time=System.currentTimeMillis()-time;}
	public void print(){System.out.println("Time: "+(System.currentTimeMillis()-time)+"ms");}
	@Override public String toString(){return"Time: "+time+"ms";}
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