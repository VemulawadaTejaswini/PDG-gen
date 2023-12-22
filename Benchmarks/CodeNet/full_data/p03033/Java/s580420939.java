import java.io.*;
import java.util.*;
import java.util.function.*;

class FastScanner{
	private final BufferedInputStream	in;
	private static final int			bufSize	=1<<16;
	private final byte					buf[]	=new byte[bufSize];
	private int							i		=bufSize,k=bufSize;
	private final StringBuilder			str		=new StringBuilder();

	FastScanner(InputStream in){
		this.in=new BufferedInputStream(in,bufSize);
	}
	int nextInt(){
		return (int)nextLong();
	}
	long nextLong(){
		int c;
		long x=0;
		boolean sign=true;
		while((c=nextChar())<=32)
			;
		if(c=='-'){
			sign=false;
			c=nextChar();
		}
		if(c=='+'){
			c=nextChar();
		}
		while(c>='0'){
			x=x*10+(c-'0');
			c=nextChar();
		}
		return sign?x:-x;
	}
	private int nextChar(){
		if(i==k){
			try{
				k=in.read(buf,i=0,bufSize);
			}catch(IOException e){
				System.exit(-1);
			}
		}
		return i>=k?-1:buf[i++];
	}
	String next(){
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1)
			return null;
		while(c>32){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
	String nextLine(){
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1)
			return null;
		while(c!='\n'){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}

}

class LazySegmentTree<T,A>{
	public static class Monoid<T,R> implements BiFunction<T,T,R>{
		T identity;

		BiFunction<T,T,R> f;
		public Monoid(T identity,BiFunction<T,T,R> f){
			this.identity=identity;
			this.f=f;
		}
		@Override
		public R apply(T t,T u){
			return f.apply(t,u);
		}
	}

	private T[]	array;
	private A[]	lazy;
	int			size;
	private int	highestbit,len[];

	/**
	 * a+0=a
	 * a+(b+c)=(a+b)+c
	 */
	private Monoid<T,T>				merger;
	/**
	 * (v,lazy)->v
	 */
	private BiFunction<T,A,T>		applyer;
	/**
	 * (apply,apply)->apply
	 */
	private Monoid<A,A>				unifyer;
	/**
	 * (v,lazy)->v
	 */
	private BiFunction<A,Integer,A>	multiplier;

	LazySegmentTree(int size,
			Monoid<T,T> merger,
			BiFunction<T,A,T> applyer,
			Monoid<A,A> unifyer,
			BiFunction<A,Integer,A> multiplier){
		this.size=size;
		this.highestbit=Integer.highestOneBit(size);
		this.merger=merger;
		this.applyer=applyer;
		this.unifyer=unifyer;
		this.multiplier=multiplier;
		initArray();
		Arrays.fill(array,merger.identity);
		Arrays.fill(lazy,unifyer.identity);
		for(int i=len.length-1;i>=0;--i)
			len[i]=i>=size?1:len[i<<1]+len[i<<1|1];
	}
	@SuppressWarnings("unchecked")
	private void initArray(){
		array=(T[])new Object[size*2];
		lazy=(A[])new Object[size*2];
		len=new int[size*2];
	}

	private void set(int i,A laz){
		array[i]=applyer.apply(array[i],
				multiplier.apply(laz,len[i]));
		if(i<size)
			lazy[i]=unifyer.apply(lazy[i],laz);
	}

	/**
	 * [l, r)
	 */
	void apply(int l,int r,A value){
		int l0=l+=size,r0=r+=size;
		for(;l<r;l>>=1,r>>=1){
			if((l&1)>0) set(l++,value);
			if((r&1)>0) set(--r,value);
		}
		updateParents(l0);
		updateParents(r0-1);
	}
	private void updateParents(int p){
		while(p>1){
			p>>=1;
			array[p]=applyer.apply(
					merger.apply(array[p<<1],array[p<<1|1]),
					multiplier.apply(lazy[p],len[p]));
		}
	}

	/**
	 * [l, r)
	 */
	T query(int l,int r){
		T res=merger.identity;
		spreadLazy(l+=size);
		spreadLazy((r+=size)-1);
		for(;l<r;l>>=1,r>>=1){
			if((l&1)>0) res=merger.apply(res,array[l++]);
			if((r&1)>0) res=merger.apply(res,array[--r]);
		}
		return res;
	}
	private void spreadLazy(int p){
		for(int s=highestbit;s>0;s>>=1){
			int i=p/s;
			if(!unifyer.identity.equals(lazy[i])){
				set(i<<1,lazy[i]);
				set(i<<1|1,lazy[i]);
				lazy[i]=unifyer.identity;
			}
		}
	}
}

class Main{

	public static void main(String[] $){
		FastScanner s=new FastScanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		int[] l=new int[n];
		int[] r=new int[n];
		int[] x=new int[n];
		for(int i=0;i<n;++i){
			l[i]=s.nextInt();
			r[i]=s.nextInt()-1;
			x[i]=s.nextInt();
		}
		int d[]=new int[q];

		LazySegmentTree.Monoid<Integer,Integer> m=new LazySegmentTree.Monoid<>(2000000000,Math::min);
		LazySegmentTree<Integer,Integer> e=new LazySegmentTree<>(
				q,
				m,
				m,
				m,
				(i,j)->i);

		for(int p=0;p<q;++p)
			d[p]=s.nextInt();

		for(int i=0;i<n;++i){
			int b=Arrays.binarySearch(d,l[i]-x[i]);
			int c=Arrays.binarySearch(d,r[i]-x[i]);
			if(b<0) b=~b;
			if(c<0) c=~c-1;
			if(b<=c)
				e.apply(b,c+1,x[i]);
		}
		for(int i=0;i<q;++i) {
			int t=e.query(i,i+1);
			System.out.println(t==2000000000?-1:t);
		}
	}
}