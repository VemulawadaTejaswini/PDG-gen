import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main{
	Scanner s=new Scanner(System.in);

	static final int mod=1000000007;

	public static long modpow(long n,long p){
		if(p==0)
			return 1;
		if(p%2==1)
			return n*modpow(n,p-1)%mod;
		long d=modpow(n,p/2);
		return d*d%mod;
	}

	public static long nCr(long n,long r){
		long res=1;
		for(long i=n-r+1;i<=n;++i){
			res*=i;
			res%=mod;
		}
		for(long i=2;i<=r;++i){
			res*=modpow(i,mod-2);
			res%=mod;
		}
		return res;
	}

	static int d(String n,int i) {
		return n.charAt(i)-'0';
	}

	void solve(){
		System.err.println();
		String n=s.next();
		int k=s.nextInt();

		long r=0;
		if(k==1) {
			r+=nCr(n.length()-1,k)*9;
			r%=mod;
			r+=d(n,0);
			r%=mod;
		}else if(k==2) {
			r+=nCr(n.length()-1,k)*81;//99999
			r%=mod;
			r+=d(n,0)*nCr(n.length()-2,1)*9;//309999
			r%=mod;
			r+=(d(n,0)-1)*9+d(n,1);//31
			r%=mod;
		}else {
			r+=nCr(n.length()-1,k)*729;//99999
			r%=mod;
			r+=d(n,0)*nCr(n.length()-2,2)*81;//300999
			r%=mod;
			r+=d(n,0)*d(n,1)*nCr(n.length()-3,1)*9;//310999
			r%=mod;
			r+=(d(n,0)-1)*81+(d(n,1)-1)*9+d(n,2);//312
			r%=mod;
		}
		System.out.println(r);
	}

	public static void main(String[] A){
		new Main().solve();
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

	SupplyingIterator<Integer> ints(int n){
		return new SupplyingIterator<>(n,this::gInt);
	}
	SupplyingIterator<Long> longs(int n){
		return new SupplyingIterator<>(n,this::gLong);
	}
	SupplyingIterator<Double> doubles(int n){
		return new SupplyingIterator<>(n,this::gDouble);
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
		return IntStream.generate(this::gInt).limit(n);
	}
	LongStream LONGS(int n){
		return LongStream.generate(this::gLong).limit(n);
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