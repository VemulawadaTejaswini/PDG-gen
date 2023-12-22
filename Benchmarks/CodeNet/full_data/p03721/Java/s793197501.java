import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(int size){
		AtomicInteger l=new AtomicInteger(-1),r=new AtomicInteger(size);
		long[] res=new long[size];
		INS(size).unordered().parallel().mapToLong(Long::parseLong).forEach(v->res[ThreadLocalRandom.current().nextBoolean()?l.incrementAndGet():r.decrementAndGet()]=v);
		return res;
	}
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static final Stream<String> INS(long size){
		return StreamSupport.stream(Spliterators.spliterator(s,size,Spliterator.NONNULL&Spliterator.IMMUTABLE),false).limit(size);
	}
	public static void main(String[]__){
		int n=s.nextInt();
		long k=s.nextLong();
		TreeMap<Integer,Long> map=new TreeMap<>();
		for(int i=0;i<n;i++) {
			map.merge(s.nextInt(),s.nextLong(),Long::sum);
		}
		long sum=0;
		for(Entry<Integer,Long> e:map.entrySet()) {
			sum+=e.getValue();
			if(k<=sum) {
				System.out.println(e.getKey());
				return;
			}
		}
	}
}
