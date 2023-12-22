import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int[]a=new int[114];
		++a[getInt()];
		--a[getInt()];
		++a[getInt()];
		--a[getInt()];
		Arrays.parallelPrefix(a,Integer::sum);
		System.out.println(Arrays.stream(a).filter(i->i==2).count());
	}
}