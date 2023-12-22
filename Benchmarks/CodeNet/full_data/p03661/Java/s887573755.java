import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INS(int n){
		return REPS(n).map(i->getInt());
	}
	static int getInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[]$){
		long[]v=INS(getInt()).asLongStream().toArray();
		long sum=Arrays.stream(v).sum();
		Arrays.parallelPrefix(v,Long::sum);
		System.out.println(Arrays.stream(v).limit(v.length-1).map(i->Math.abs((sum-i)-i)).min().getAsLong());
	}
}
