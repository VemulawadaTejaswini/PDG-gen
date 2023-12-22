import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		long a=s.nextLong()-1;
		long b=s.nextLong();
		long c=s.nextLong();
		long d=s.nextLong();

		long w=b-a;
		System.err.println(w);
		long x=b/c-a/c;
		System.err.println(x);
		long y=b/d-a/d;
		System.err.println(y);
		long z=b/gcd(c,d)-a/gcd(c,d);
		System.err.println(z);
		System.out.println(w-x-y+z);
	}

	private static long gcd(long c,long d){
		return c*d/lcm(c,d);
	}

	private static long lcm(long c,long d){
		return d==0?c:lcm(d,c%d);
	}
}
