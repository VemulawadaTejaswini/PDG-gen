import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static Scanner s=new Scanner(System.in);

	class Edge{
		int f,t,jpy,snk;
		public Edge(int f,int t,int jpy,int snk){
			super();
			this.f=f;
			this.t=t;
			this.jpy=jpy;
			this.snk=snk;
		}
	}

	int n=gInt(),m=gInt(),src=gInt()-1,to=gInt()-1;
	void solve(){
		HashMap<Integer,ArrayList<Edge>> g=new HashMap<>(n);

		long[] jpy=new long[n],snk=new long[n];

		for(int i:rep(m)){
			int f=gInt()-1,t=gInt()-1,j=gInt(),sn=gInt();
			g.computeIfAbsent(f,o->new ArrayList<>()).add(new Edge(f,t,j,sn));
			g.computeIfAbsent(t,o->new ArrayList<>()).add(new Edge(t,f,j,sn));
		}
		jpy(g,src,jpy);
		snk(g,to,snk);
		TreeMap<Long,Integer>t=new TreeMap<>();
		for(int i:rep(n))
			t.put(jpy[i]+snk[i],i+1);
		Entry<Long,Integer> o=null;
		for(int i:rep(n)) {
			while(true) {
				o=t.firstEntry();
				if(o.getValue()>i)
					break;
				t.pollFirstEntry();
			}
			System.out.println(1000_000_000_000_000l-o.getKey());
		}
	}
	void jpy(HashMap<Integer,ArrayList<Edge>> g,int s,long[] jpy){
		int[] prev=new int[n];
		Arrays.fill(jpy,Integer.MAX_VALUE/3);
		Arrays.fill(prev,-1);
		jpy[s]=0;
		PriorityQueue<Edge> q=new PriorityQueue<>(Comparator.comparingInt(o->o.jpy));
		for(q.add(new Edge(-2,s,0,0));!q.isEmpty();){
			Edge e=q.poll();
			if(prev[e.t]!=-1) continue;
			prev[e.t]=e.f;
			for(Edge f:g.get(e.t)){
				if(jpy[f.t]>e.jpy+f.jpy){
					jpy[f.t]=e.jpy+f.jpy;
					q.add(new Edge(f.f,f.t,e.jpy+f.jpy,0));
				}
			}
		}
	}
	void snk(HashMap<Integer,ArrayList<Edge>> g,int s,long[] snk){
		int[] prev=new int[n];
		Arrays.fill(snk,Integer.MAX_VALUE/3);
		Arrays.fill(prev,-1);
		snk[s]=0;
		PriorityQueue<Edge> q=new PriorityQueue<>(Comparator.comparingInt(o->o.snk));
		for(q.add(new Edge(-2,s,0,0));!q.isEmpty();){
			Edge e=q.poll();
			if(prev[e.t]!=-1) continue;
			prev[e.t]=e.f;
			for(Edge f:g.get(e.t)){
				if(snk[f.t]>e.snk+f.snk){
					snk[f.t]=e.snk+f.snk;
					q.add(new Edge(f.f,f.t,0,e.snk+f.snk));
				}
			}
		}
	}

	public static void main(String[] A){
		new Main().solve();
	}

	static int gInt(){
		return Integer.parseInt(s.next());
	}
	static long gLong(){
		return Long.parseLong(s.next());
	}
	static double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplyingIterator<Integer> ints(int n){
		return new SupplyingIterator<>(n,Main::gInt);
	}
	SupplyingIterator<Long> longs(int n){
		return new SupplyingIterator<>(n,Main::gLong);
	}
	SupplyingIterator<Double> doubles(int n){
		return new SupplyingIterator<>(n,Main::gDouble);
	}
	SupplyingIterator<String> strs(int n){
		return new SupplyingIterator<>(n,s::next);
	}

	Range rep(int i){
		return Range.rep(i);
	}
	Range rep(int f,int t,int d){
		return Range.rep(f,t,d);
	}
	Range rep(int f,int t){
		return rep(f,t,1);
	}
	Range rrep(int f,int t){
		return rep(t,f,-1);
	}

	IntStream REP(int v){
		return IntStream.range(0,v);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(Main::gInt).limit(n);
	}
	Stream<String> STRS(int n){
		return Stream.generate(s::next).limit(n);
	}

}
class SupplyingIterator<T> implements Iterable<T>,Iterator<T>{
	int			t;
	Supplier<T>	supplier;

	SupplyingIterator(int t,Supplier<T> supplier){
		this.t=t;
		this.supplier=supplier;
	}

	@Override
	public Iterator<T> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return t>0;
	}

	@Override
	public T next(){
		--t;
		return supplier.get();
	}

}

class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{
	int to,cur,d;

	Range(int from,int to,int d){
		this.cur=from-d;
		this.to=to;
		this.d=d;
	}

	Range(int n){
		this(0,n-1,1);
	}

	@Override
	public Iterator<Integer> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return cur+d==to||(cur!=to&&(cur<to==cur+d<to));
	}

	@Override
	public int nextInt(){
		return cur+=d;
	}
	static Range rep(int i){
		return new Range(i);
	}
	static Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	static Range rep(int f,int t){
		return rep(f,t,1);
	}
	static Range rrep(int f,int t){
		return rep(f,t,-1);
	}
}
