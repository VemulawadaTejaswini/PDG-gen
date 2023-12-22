import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.LongSupplier;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final void REP(int t,IntConsumer i){
		for(int v=0;v<t;v++)
			i.accept(v);
	}
	static final void REPR(int t,IntConsumer i){
		for(int v=t-1;v>=0;v--)
			i.accept(v);
	}
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	};
	public static void main(String[] __){
		int n=s.nextInt();
		Pair p=new Pair(s.nextInt(),s.nextInt());
		for(int i=1;i<n;i++) {
			p.update(s.nextInt(),s.nextInt());
		//	System.out.println(p.toString());
		}
		System.out.println(p.getValue());
	}
	static class Pair{
		long rmax,rmin,bmax,bmin;
		public Pair(int a,int b){
			rmax=Math.min(a,b);
			rmin=rmax;
			bmax=Math.max(a,b);
			bmin=bmax;
		}
		long getValue() {
			return(rmax-rmin)*(bmax-bmin);
		}
		long getValue(int r,int b) {
			return(Math.max(r,rmax)-Math.min(r,rmin))
					*(Math.max(b,bmax)-Math.min(b,bmin));
		}
		void update(int a,int b){
			if(getValue(a,b)<=getValue(b,a)) {
				rmax=Math.max(rmax,a);
				rmin=Math.min(rmin,a);
				bmax=Math.max(bmax,b);
				bmin=Math.min(bmin,b);
			}else {
				rmax=Math.max(rmax,b);
				rmin=Math.min(rmin,b);
				bmax=Math.max(bmax,a);
				bmin=Math.min(bmin,a);
			}
		}
		@Override
		public String toString(){
			return rmax+" "+rmin+" "+bmax+" "+bmin;
		}
	}
}
