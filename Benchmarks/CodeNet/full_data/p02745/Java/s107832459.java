import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main{
	Scanner s=new Scanner(System.in);

	void solve(){
		String a=s.next();
		String b=s.next();
		String c=s.next();

		int r=Integer.MAX_VALUE;
		r=Math.min(r,f(a,b,c));
		r=Math.min(r,f(a,c,b));
		r=Math.min(r,f(b,a,c));
		r=Math.min(r,f(b,c,a));
		r=Math.min(r,f(c,a,b));
		r=Math.min(r,f(c,b,a));

		System.out.println(r);
	}

	private int f(String a,String b,String c){
		char[] v=new char[a.length()+b.length()];
		a.getChars(0,a.length(),v,0);

		for(int i=0,al=a.length();i<al;++i){
			int I=i;

			if(IntStream.range(i,Math.min(al,i+b.length())).allMatch(j->v[j]==b.charAt(j-I)
					||v[j]=='?'
					||b.charAt(j-I)=='?')){
				for(int j=0,bl=b.length();j<bl;++j){
					if(v[i+j]=='?'||v[i+j]==0)
						v[i+j]=b.charAt(j);
				}
				return g(String.valueOf(v,0,Math.max(al,i+b.length())),c);
			}
		}
		return g(a+b,c);
	}

	private int g(String a,String b){
		//System.err.println(a+" "+b+" "+a.length()+" "+b.length());
		for(int i=0,al=a.length();i<al;++i){
			int I=i;

			if(IntStream.range(i,Math.min(al,i+b.length())).allMatch(j->a.charAt(j)==b.charAt(j-I)
					||a.charAt(j)=='?'
					||b.charAt(j-I)=='?')){
				return Math.max(a.length(),i+b.length());
			}
		}
		return a.length()+b.length();
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
		return (cur+d==to)||(d<0^cur+d<to);
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
