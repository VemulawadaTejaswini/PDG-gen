import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static Scanner s=new Scanner(System.in);

	void solve(){
		int n=gInt(),k=gInt();
		
		long v=0,w=countinmodi(n,0,k);
		if(k%2==0) {
			v=countinmodi(n,k/2,k);
		}
		System.err.println(v+" "+w);
		System.out.println(v*v*v+w*w*w);
	}
	long countinmodi(int n,int i,int m) {
		return (n+i)/m;
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
		return new Range(i);
	}
	Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	Range rep(int f,int t){
		return rep(f,t,1);
	}
	Range rrep(int f,int t){
		return rep(t,f,-1);
	}

	IntStream REP(int n){
		return REP(0,n-1);
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
	int t;
	Supplier<T> supplier;

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
}
