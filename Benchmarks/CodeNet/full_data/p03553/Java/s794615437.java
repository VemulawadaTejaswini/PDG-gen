import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main{
	static class System{
		private static final InputStream in=java.lang.System.in;
		private static final PrintWriter out=new PrintWriter(java.lang.System.out,false);
	}
	public static void main(String[]$){
		new Main().solve();
		System.out.flush();
	}
	static Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static int gInt(){return s.nextInt();}
	static long gLong(){return s.nextLong();}
	static long gDouble(){return s.nextLong();}

	static IntStream ints(int n){return REPS(n).map(i->gInt());}
	static Stream<String> strs(int n){return REPS(n).mapToObj(i->s.next());}

	int n=gInt();
	long a[]=ints(n).asLongStream().toArray();
	PrimeIterator pw=new PrimeIterator(100);

	private void solve(){
		for(int d=n;d>=1;--d){
			long cdsum=0;
			for(int i=d-1;i<n;i+=d)
				cdsum+=a[i];
			if(cdsum<0){
				for(int i=d-1;i<n;i+=d)
					a[i]=0;
			}
		}
		System.out.println(Arrays.stream(a).sum());
	}

	static class PrimeIterator implements Iterable<Integer>,PrimitiveIterator.OfInt{
		private BitSet	bs;
		private int		curv,limit;

		//todo
		//public PrimeIterator(int from,int limit);
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

			int i=2;
			while(sieve(i=bs.nextSetBit(i)))
				i++;
		}
		protected boolean sieve(int v){
			final long sievestart=1L*v*v;
			if(4>sievestart||sievestart>limit)
				return false;
			IntStream.iterate(v*v,i->i+v).limit(limit/v-v+1).forEach(bs::clear);
			return true;
		}
		@Override
		public boolean hasNext(){
			final int r=getNextValue();
			return 0<=r&&r<=limit;
		}
		private int getNextValue(){
			return bs.nextSetBit(curv+1);
		}
		@Override
		public int nextInt(){
			final int r=getNextValue();
			if(r<0||limit<r) throw new NoSuchElementException();
			return curv=r;
		}
		@Override
		public OfInt iterator(){
			return this;
		}
		public BitSet getClonedBitSet(){
			return bs.get(0,limit+1);
		}
	}
}