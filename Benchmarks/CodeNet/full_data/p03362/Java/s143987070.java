import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static Scanner s=new Scanner(System.in);
	
	public static class PrimeIterator implements Iterable<Integer>,PrimitiveIterator.OfInt{
		BitSet	bs;
		private int		curv,limit;

		public PrimeIterator(int limit){
			curv=0;
			bs=new BitSet(limit+1);
			this.limit=limit;
			constructBS();
		}
		private final void constructBS(){
			bs.set(0,limit+1);
			bs.clear(0);
			bs.clear(1);
			if(limit<2) return;

			int i=1;
			while(sieve(i=bs.nextSetBit(i+1)))
				;
		}
		protected boolean sieve(int v){
			if((long)v*v>limit)
				return false;
			for(int i=v*v;i<=limit;i+=v)
				bs.clear(i);
			return true;
		}
		@Override
		public boolean hasNext(){
			int r=getNextValue();
			return 0<=r&&r<=limit;
		}
		private int getNextValue(){
			return bs.nextSetBit(curv+1);
		}
		@Override
		public int nextInt(){
			int r=getNextValue();
			if(r<0||limit<r) throw new NoSuchElementException();
			return curv=r;
		}
		@Override
		public OfInt iterator(){
			return this;
		}
		public BitSet getClonedBitSet(){
			return (BitSet)bs.clone();
		}
	}

	void solve(){
		PrimeIterator p=new PrimeIterator(55555);
		ArrayList<Integer>res=new ArrayList<>();
		res.add(2);
		p.bs.stream().filter(o->o%5==1).forEach(res::add);
//		System.err.println(res);
//		System.err.println(res.size());
		System.out.println(
				res.stream()
				.limit(gInt())
				.map(String::valueOf)
				.collect(Collectors.joining(" "))
				);
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
