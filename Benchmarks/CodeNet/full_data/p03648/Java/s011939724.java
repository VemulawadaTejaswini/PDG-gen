import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		long k=s.nextLong();

		final int n=50;
		long[]r=new long[n];

		for(int i=0;i<n&&k>0;i++) {
			r[i]=n-i;
			--k;
		}

		for(int i=0;i<n;i++)
			r[i]+=k/n;
		k%=n;

		for(int i=0;i<n&&k>0;i++) {
			++r[i];
			--k;
		}

		System.out.println(n);
		System.out.println(Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
	}
}
