import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main{
	static Scanner s=new Scanner(System.in);
	static long[] fal_rnd(int size){
		AtomicInteger l=new AtomicInteger(-1),r=new AtomicInteger(size);
		long[] res=new long[size];
		INS(size).unordered().parallel().mapToLong(Long::parseLong).forEach(v->res[ThreadLocalRandom.current().nextBoolean()?l.incrementAndGet():r.decrementAndGet()]=v);
		return res;
	}
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static Stream<String> INS(long size){
		return StreamSupport.stream(Spliterators.spliterator(s,size,Spliterator.NONNULL&Spliterator.IMMUTABLE),false).limit(size);
	}
	
	public static void main(String[] __){
		int a=s.nextInt(),b=s.nextInt();
		System.out.println(Math.min(solve(a,b),solve(b,a)));
	}
	private static long solve(long w,long h){
		long r=Integer.MAX_VALUE;
		for(int i=0;i<=w;i++) {
			long sg=h*i;
			
			long sb=(h+1)/2*(w-i);
			long sr=h/2*(w-i);
			r=Math.min(r,Math.abs(Math.max(sg,sb)-Math.min(sg,sr)));
			sb=(w-i+1)/2*h;
			sr=(w-i)/2*h;
			r=Math.min(r,Math.abs(Math.max(sg,sb)-Math.min(sg,sr)));
		}
		return r;
	}
}

