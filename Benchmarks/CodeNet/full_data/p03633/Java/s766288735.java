import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt();
		long l=1;
		for(int i=0;i<n;++i) {
			l=lcm(l,s.nextLong());
		}
		System.out.println(l);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	public static long lcm(long a, long b) {
		return a/gcd(a,b)*b;
	}
}