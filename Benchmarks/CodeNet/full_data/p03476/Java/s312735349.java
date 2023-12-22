import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

class Main{
	private static final int n=1000001;
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		BitSet rabbit=new PrimeIterator(n).bs;
		TreeSet<Integer>treeone=new TreeSet<>();

		IntStream.range(1,n)
		.filter(i->i%2==1&&rabbit.get(i)&&rabbit.get((i+1)/2))
		.forEach(treeone::add);

		for(int q=gInt();q>0;--q)
			System.out.println(treeone.subSet(gInt(),gInt()+1).size());
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
			return (BitSet)bs.clone();
		}
	}
}
