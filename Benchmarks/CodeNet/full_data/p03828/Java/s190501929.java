import java.util.*;
public class Main{
	static Scanner s = new Scanner(System.in);
	private static final int MOD =1_000_000_007;

	public static void main(String[] args) {
		LikePrimeIterator lpi = new LikePrimeIterator();
		ArrayDeque<Long> in = new ArrayDeque<>();
		long result=1;
		{
			long b=1;
			for(int i=s.nextInt();i>1;i--) {
				if(b<1_000_000_000_000L) {
					b*=i;
				}else {
					in.add(b);
					b=i;
				}
			}
			in.add(b);
		}
		{
			long LPI,list,count,size;
			while(!in.isEmpty()) {
				count=1;
				LPI=lpi.next();
				size=in.size();
				for(int i=0;i<size;i++){
					list=in.poll();
					while(list%LPI==0) {
						list/=LPI;
						count++;
					}
					if(list>1)
						in.add(list);
				}
				result*=count;
				result%=MOD;
			}
		}
		System.out.println(result);
	}
}
class LikePrimeIterator implements Iterator<Long>{
	long curValue = 0;
	long nextValue = 2;
	public LikePrimeIterator() {
	}
	@Override
	public boolean hasNext() {
		return nextValue>0;
	}
	@Override
	public Long next() {
		if(hasNext()) {
			long b = (curValue=nextValue)%6;

			if(b==5)
				nextValue+=2;
			else if (b==1)
				nextValue+=4;
			else if(b==2)
				nextValue=3;
			else
				nextValue=5;

			return curValue;

		}else {
			throw new NoSuchElementException();
		}
	}
	public long get() {
		return curValue;
	}
	public void reset() {
		nextValue=2;
	}
}
