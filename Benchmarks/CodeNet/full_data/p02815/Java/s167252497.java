import java.util.*;

public class Main{
	public static long gcd(long a, long b) {
		return a%b==0 ? b : gcd(b, a % b);
	}
	public static long lcm(long a, long b) {
		return a/gcd(a,b)*b;
	}

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		long lcm=1;
		for(int i=0;i<n;++i) {
			lcm=lcm(lcm,s.nextInt()/2);
			if(m<lcm) {
				System.out.println(0);
				return;
			}
		}
		System.err.println(lcm*2);
		System.out.println((m/lcm+1)/2);
	}
}
