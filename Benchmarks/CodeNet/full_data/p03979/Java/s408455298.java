import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
	static void dump(int[]a){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++)
	s.append(a[i]).append(" ");out.println(s.toString().trim());}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d ",a[i]);out.println();}
	static void dump(long[]a){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++)
	s.append(a[i]).append(" ");out.println(s.toString().trim());}
	static void dump(char[]a){for(int i=0;i<a.length;i++)out.print(a[i]);out.println();}
	static long pow(long a,int n){long r=1;while(n>0){if((n&1)==1)r*=a;a*=a;n>>=1;}return r;}
	static String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	static void sort(int[]a){m_sort(a,0,a.length,new int[a.length]);}
	static void sort(int[]a,int l){m_sort(a,0,l,new int[l]);}
	static void sort(int[]a,int l,int[]buf){m_sort(a,0,l,buf);}
	static void sort(int[]a,int s,int l,int[]buf){m_sort(a,s,l,buf);}
	static void m_sort(int[]a,int s,int sz,int[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];
	} /* qsort(3.5s)<<msort(9.5s)<<<shuffle+qsort(17s)<Arrays.sort(Integer)(20s) */
	static void sort(long[]a){m_sort(a,0,a.length,new long[a.length]);}
	static void sort(long[]a,int l){m_sort(a,0,l,new long[l]);}
	static void sort(long[]a,int l,long[]buf){m_sort(a,0,l,buf);}
	static void sort(long[]a,int s,int l,long[]buf){m_sort(a,s,l,buf);}
	static void m_sort(long[]a,int s,int sz,long[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];}
	static void swap(long[] a,int i,int j){final long t=a[i];a[i]=a[j];a[j]=t;}
	static void swap(int[] a,int i,int j){final int t=a[i];a[i]=a[j];a[j]=t;}
	static int binarySearchSmallerMax(int[]a,int v)// get maximum index which a[idx]<=v
	{int l=-1,r=a.length-1,s=0;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	static int binarySearchSmallerMax(int[]a,int v,int l,int r)
	{int s=-1;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	@SuppressWarnings("unchecked")
	static List<Integer>[]createGraph(int n)
    {List<Integer>[]g=new List[n];for(int i=0;i<n;i++)g[i]=new ArrayList<>();return g;}
	void solve() throws IOException{
		int h = in.nextInt();
		int w = in.nextInt();
		char[][] map = new char[h][];
		final int s = h*w*2;
		final int t = h*w*2+1;
		MaxFlow mf = new MaxFlow(h*w*2+2, s, t);
		final int inf = 1000;
		for(int i=0; i<h; i++){
			map[i] = in.nextToken().toCharArray();
			for(int j=0; j<w; j++){
				if(map[i][j]=='X'){
					mf.edge(s, (i*w+j)*2, inf);
					mf.edge((i*w+j)*2, (i*w+j)*2+1, inf);
				}
				else mf.edge((i*w+j)*2, (i*w+j)*2+1, 1);
			}
		}
		for(int i=0; i<h; i++){
			if(map[i][0]=='X' || map[i][w-1]=='X'){
				System.out.println(-1);
				return;
			}
			mf.edge(i*w*2+1, t, 1);
			mf.edge((i*w+w-1)*2+1, t, 1);
		}
		for(int i=0; i<w; i++){
			if(map[0][i]=='X' || map[h-1][i]=='X'){
				System.out.println(-1);
				return;
			}
			mf.edge(i*2+1, t, 1);
			mf.edge(((h-1)*w+i)*2+1, t, 1);
		}
		final int[] dx = {1, 0, -1, 0};
		final int[] dy = {0, 1, 0, -1};
		for(int i=1; i<h-1; i++){
			for(int j=1; j<w-1; j++){
				for(int d=0; d<4; d++){
					final int ny = i+dy[d];
					final int nx = j+dx[d];
					mf.edge((i*w+j)*2+1, (ny*w+nx)*2, 1);
				}
			}
		}
		System.out.println(mf.solve());
	}
}

class MaxFlow{
	int n, s, t;
	List<Edge>[] node;
	MaxFlow(int n, int s, int t) {
		this.n=n;this.s=s;this.t=t;node=new List[n];
		for(int i=0;i<n;i++)node[i]=new ArrayList<>();
		used = new BitSet(n);
	}
	void edge(int a, int b, int c){
		Edge ae = new Edge(b, c);
		Edge be = new Edge(a, 0);
		ae.rev = be;
		be.rev = ae;
		node[a].add(ae);
		node[b].add(be);
	}
	void edge(int a, int b, int c, int rc){
		Edge ae = new Edge(b, c);
		Edge be = new Edge(a, rc);
		ae.rev = be;
		be.rev = ae;
		node[a].add(ae);
		node[b].add(be);
	}
	final static int inf = Integer.MAX_VALUE/2;
	int solve(){
		int res = 0;
		while(true){
			used.clear();
			int flow = flow(s, inf);
			if(flow == 0) break;
			res += flow;
		}
		return res;
	}
	BitSet used;
	int flow(int from, int flow){
		if(from == t) return flow;
		if(used.get(from)) return 0;
		used.set(from);
		for(Edge e: node[from]){
			final int cap = e.cap;
			if(cap==0) continue;
			int f = flow(e.to, Math.min(flow, cap));
			if(f == 0) continue;
			e.cap -= f;
			e.rev.cap += f;
			return f;
		}
		return 0;
	}
	class Edge{
		int to,cap;
		Edge rev;
		Edge(int t, int c){to=t;cap=c;}
	}
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public MultiSet<T> merge(MultiSet<T> set)
	{MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
}
@SuppressWarnings("serial")
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