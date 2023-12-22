import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
	static Scanner s=new Scanner(System.in);

	void solve(){
		int n=gInt();
		long a[]=INTS(n).asLongStream().toArray();
		long[] odd=new long[n/2+1];
		long[] evn=new long[(n+1)/2+1];
		for(int i=0;i<n;++i){
			if(i%2==0)
				evn[i/2+1]=a[i];
			else
				odd[i/2+1]=a[i];
		}
		System.err.println(Arrays.toString(odd));
		System.err.println(Arrays.toString(evn));
		Arrays.parallelPrefix(odd,Long::sum);
		Arrays.parallelPrefix(evn,Long::sum);

		int oml=0,omr=0;
		for(int l=0;l<odd.length;++l){
			for(int r=l+1;r<odd.length;++r){
				if(odd[omr]-odd[oml]<odd[r]-odd[l]){
					omr=r;
					oml=l;
				}
			}
		}
		int eml=0,emr=0;
		for(int l=0;l<evn.length;++l){
			for(int r=l+1;r<evn.length;++r){
				if(evn[emr]-evn[eml]<evn[r]-evn[l]){
					emr=r;
					eml=l;
				}
			}
		}

		int l,r;
		if(odd[omr]-odd[oml]>evn[emr]-evn[eml]){
			System.out.println(odd[omr]-odd[oml]);
			l=oml*2+1;
			r=(omr-1)*2+1;
		}else{
			System.out.println(evn[emr]-evn[eml]);
			l=oml*2;
			r=omr*2;
		}
		System.err.println(l+" "+r);
		System.out.println(n-1-r+l+(r-l+1)/2);
		for(int i=n-1;i>r;--i){
			System.out.println(i+1);
		}
		for(int i=0;i<l;++i){
			System.out.println(1);
		}
		for(int i=0;i<(r-l+1)/2;++i)
			System.out.println(2);
	}
	public static void main(String[] $){
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
