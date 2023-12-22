import java.util.Arrays;
import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;

class Main{
	private static final int n=1000001;
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		BitSet p=new PrimeIterator(n).bs;

		int[]a=new int[n];
		for(int i=1;i<n;i+=2)
			if(p.get(i)&&p.get((i+1)/2))
				a[i]=1;
		Arrays.parallelPrefix(a,Integer::sum);
		for(int q=gInt();q>0;--q)
			System.out.println(-a[gInt()-1]+a[gInt()]);
	}
	public static class PrimeIterator implements Iterable<Integer>,PrimitiveIterator.OfInt{
		private BitSet	bs;
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
			return bs.get(0,limit+1);
		}
	}
}
