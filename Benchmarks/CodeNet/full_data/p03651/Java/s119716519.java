import java.util.Scanner;

public class Main {
	static long euclid(long x, long y) {
		if (y == 0) {
			return x;
		} else {
			return euclid(y, x%y);
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long gcd=a[0];
		long lcm=a[0];
		for (int i = 1; i < n; i++) {
			gcd=euclid(lcm,a[i]);
			lcm=lcm/gcd*a[i];
		}
		for(int i=0;i<n;i++) {
			if(a[i]>=k&&(a[i]-k)%gcd==0) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
		
	}
}
