import java.util.Scanner;
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
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	};
	public static void main(String[] __){
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		
		if(a==b&&b==c&&a%2==0) {
			System.out.println(-1);
			return;
		}
		
		for(int i=0;i<10000000;i++) {
			if(a%2+b%2+c%2>0) {
				System.out.println(i);
				return;
			}
			final int ba=b/2+c/2;
			final int bb=c/2+a/2;
			final int bc=a/2+b/2;
			a=ba;
			b=bb;
			c=bc;
		}
	}
}
