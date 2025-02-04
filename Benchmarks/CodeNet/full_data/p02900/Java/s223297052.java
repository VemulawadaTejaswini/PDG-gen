import java.util.*;

class Main{
	public static long gcd(long a, long b) {
		return a%b==0 ? b : gcd(b, a % b);
	}

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		long a=s.nextLong(),b=s.nextLong(),r=1;
		PrimeIterator pi=new PrimeIterator(10_000_000);
		for(long i:pi) {
			if(a%i==0&&b%i==0) {
				while(a%i==0)
					a/=i;
				while(b%i==0)
					b/=i;
				++r;
			}
			if(i*i>a||i*i>b) {
				if(gcd(a,b)>1)
					++r;
				break;
			}
		}
		System.out.println(r);
	}
}

class PrimeIterator implements Iterable<Integer>,PrimitiveIterator.OfInt{
	BitSet		bitset;
	private int	currentvalue,limit;

	public PrimeIterator(int limit){
		currentvalue=0;
		bitset=new BitSet(limit+1);
		this.limit=limit;
		construct();
	}
	/** Atkin's sieve */
	private final void construct(){
		int sqLim=(int)Math.sqrt(limit+0.5);
		{
			int n;
			for(int z=1;z<=5;z+=4){
				for(int y=z;y<=sqLim;y+=6){
					int ysq=y*y;
					for(int x=1;x<=sqLim&&(n=4*x*x+ysq)<=limit;++x)
						bitset.flip(n);
					for(int x=y+1;x<=sqLim&&(n=3*x*x-ysq)<=limit;x+=2)
						bitset.flip(n);
				}
			}
			for(int z=2;z<=4;z+=2){
				for(int y=z;y<=sqLim;y+=6){
					int ysq=y*y;
					for(int x=1;x<=sqLim&&(n=3*x*x+ysq)<=limit;x+=2)
						bitset.flip(n);
					for(int x=y+1;x<=sqLim&&(n=3*x*x-ysq)<=limit;x+=2)
						bitset.flip(n);
				}
			}
			for(int y=3;y<=sqLim;y+=6){
				int ysq=y*y;
				for(int z=1;z<=2;++z)
					for(int x=z;x<=sqLim&&(n=4*x*x+ysq)<=limit;x+=3)
						bitset.flip(n);
			}
		}
		{
			//remove square
			for(int n=5;n<=sqLim&&n!=-1;n=bitset.nextSetBit(n+1)){
				int nsq=n*n;
				for(int k=nsq;k<=limit;k+=nsq)
					bitset.clear(k);
			}
		}
		bitset.set(2);
		bitset.set(3);
	}

	@Override
	public boolean hasNext(){
		int r=getNextValue();
		return 0<=r&&r<=limit;
	}
	private int getNextValue(){
		return bitset.nextSetBit(currentvalue+1);
	}
	@Override
	public int nextInt(){
		int r=getNextValue();
		if(r<0||limit<r) throw new NoSuchElementException();
		return currentvalue=r;
	}
	@Override
	public OfInt iterator(){
		return this;
	}
	public BitSet getClonedBitSet(){
		return (BitSet)bitset.clone();
	}
}
