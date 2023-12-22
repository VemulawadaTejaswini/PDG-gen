import java.util.ArrayDeque;
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
		int n=s.nextInt(),t=s.nextInt(),count=0,w=0;
		ArrayDeque<Integer> d=new ArrayDeque<>(n+1);
		REP(n,i->d.add(s.nextInt()));
		for(int i=0;i<1000300000;i++) {
			if(d.peek()!=null&&d.peek()==i) {
				d.poll();
				w=t;
			}
			if(w-->0)
				count++;
		}
		System.out.println(count);
	}
}
