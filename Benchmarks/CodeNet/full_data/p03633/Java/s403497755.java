import java.util.*;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long l=1;
		for(int i=0;i<n;++i) {
			l=lcm(l,s.nextLong());
		}
		System.out.println(l);
	}
	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	static long lcm(long a, long b) {
		return a/gcd(a,b)*b;
	}
}