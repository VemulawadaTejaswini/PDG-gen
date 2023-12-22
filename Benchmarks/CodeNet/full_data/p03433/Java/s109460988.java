import java.util.Iterator;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{

	static class Pair<A extends Comparable<A>,B extends Comparable<B>> implements Comparable<Pair<A,B>>{
		A	a;
		B	b;
		public Pair(A a,B b){
			this.a=a;
			this.b=b;
		}

		@Override
		public int hashCode(){
			final int prime=31;
			int result=1;
			result=prime*result+((a==null)?0:a.hashCode());
			result=prime*result+((b==null)?0:b.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj){
			if(this==obj) return true;
			if(!(obj instanceof Pair))
				return false;
			Pair<?,?> other=(Pair<?,?>)obj;
			return Objects.equals(a,other.a)&&Objects.equals(b,other.b);
		}

		public Pair<B,A> swapped(){
			return new Pair<>(b,a);
		}

		@Override
		public int compareTo(Pair<A,B> o){
			int v;
			v=a.compareTo(o.a);
			if(v!=0)
				return v;
			v=b.compareTo(o.b);
			return v;
		}
	}

	private void solve(){
		System.out.println(gInt()%500<=gInt()?"Yes":"No");
	}

	public static void main(String[]$){
		new Main().solve();
	}

	Scanner s=new Scanner(System.in);

	int abs(int v){
		return (v^(v>>31))-(v>>31);
	}
	long abs(long v){
		return (v^(v>>63))-(v>>63);
	}

	int gInt(){
		return Integer.parseInt(s.next());
	}
	long gLong(){
		return Long.parseLong(s.next());
	}
	double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplierIterator<Integer> ints(int n){
		return new SupplierIterator<>(n,this::gInt);
	}
	SupplierIterator<Long> longs(int n){
		return new SupplierIterator<>(n,this::gLong);
	}
	SupplierIterator<Double> doubles(int n){
		return new SupplierIterator<>(n,this::gDouble);
	}
	SupplierIterator<String> strs(int n){
		return new SupplierIterator<>(n,s::next);
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
		return rep(f,t,-1);
	}

	IntStream REP(int v){
		return IntStream.range(0,v);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return REP(n).map(i->gInt());
	}
	Stream<String> STRS(int n){
		return REP(n).mapToObj(i->s.next());
	}

}

class SupplierIterator<T> implements Iterable<T>,Iterator<T>{
	int			t;
	Supplier<T>	supplier;

	SupplierIterator(int t,Supplier<T> supplier){
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

