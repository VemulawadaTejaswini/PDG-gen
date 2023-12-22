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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
	static void dump(int[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d ",a[i]);out.println();}
	static void dump(long[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
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
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		int[] y = new int[n];
		int[] x = new int[n];
		int[] v = new int[n];
		for(int i=0; i<n; i++){
			y[i] = in.nextInt()-1;
			x[i] = in.nextInt()-1;
			v[i] = in.nextInt();
		}
		if(!ok(x, y, v, r, c)){
			System.out.println("No");
			return;
		}
	    if(!ok(y, x, v, c, r)){
	    	System.out.println("No");
	    	return;
	    }
		if(-tmp+v[0]<0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
	
	int tmp;
	boolean ok(int[] x, int[] y, int[] v, int r, int c){
		TreeMap<Integer, Group> xs = new TreeMap<>();
		final int n = y.length;
		for(int i=0; i<n; i++){
			Group g;
			if(xs.containsKey(y[i])){
				g = xs.get(y[i]);
			}else{
				g = new Group();
				xs.put(y[i], g);
			}
			g.list.add(new Pair(x[i], i));
		}
		TreeMap<Integer, Group> ys = new TreeMap<>();
		for(int i=0; i<n; i++){
			Group g;
			if(ys.containsKey(x[i])){
				g = ys.get(x[i]);
			}else{
				g = new Group();
				ys.put(x[i], g);
			}
			g.list.add(new Pair(y[i], i));
		}
		List<Group> xgs = new ArrayList<>();
		xgs.addAll(xs.values());
		List<Group> ygs = new ArrayList<>();
		ygs.addAll(ys.values());
		
		List<Integer>[] node = graph(xgs, ygs, n);
		int[] diff = new int[c];
		boolean[] see = new boolean[c];
		Queue<Integer> qu = new ArrayDeque<>(n);
		boolean[] used = new boolean[n];
		for(int i=0; i<n; i++){
			if(used[i]) continue;
			used[i] = true;
			int next = i;
			int preD = 0;
			int preDmax = 0;
			int dmax = 0;
			while(next>=0){
				preDmax = Math.max(preDmax, preD);
				qu.add(next);
				next = -1;
				while(!qu.isEmpty()){
					int p = qu.poll();
					for(int np: node[p]){
						if(used[np]) continue;
						if(y[p] != y[np]){
							if(next==-1){
								next = np;
								preD += v[p]-v[np];
								used[np] = true;
							}
							continue;
						}
						used[np] = true;
						if(see[x[np]]){
							if(-v[np] != diff[x[np]] + preD) return false;
						}else{
							see[x[np]] = true;
							diff[x[np]] = diff[x[p]] + v[p]-v[np];
							dmax = Math.max(dmax, diff[x[np]]);
						}
						qu.add(np);
					}
				}
			}
			tmp = Math.max(tmp, dmax+preDmax);
		}
		return true;
	}
	
	List<Integer>[] graph(List<Group> xs, List<Group> ys, int n){
		List<Integer>[] res = new List[n];
		for(int i=0; i<n; i++){
			res[i] = new ArrayList<>();
		}
		for(Group g: xs){
			g.init();
			List<Pair> list = g.list;
			int pre = list.get(0).b;
			for(int i=1; i<list.size(); i++){
				int id = list.get(i).b;
				res[pre].add(id);
				res[id].add(pre);
				pre = id;
			}
		}
		for(Group g: ys){
			g.init();
			List<Pair> list = g.list;
			int pre = list.get(0).b;
			for(int i=1; i<list.size(); i++){
				int id = list.get(i).b;
				res[pre].add(id);
				res[id].add(pre);
				pre = id;
			}
		}
		return res;
	}
}

class Group implements Comparable<Group>{
	List<Pair> list = new ArrayList<>();
	int top;
	void init(){
		top = list.get(0).a;
		Collections.sort(list);
	}
	@Override
	public int compareTo(Group o) {
		return top-o.top;
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