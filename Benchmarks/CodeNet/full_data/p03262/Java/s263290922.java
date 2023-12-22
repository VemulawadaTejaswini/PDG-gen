import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		long[] a=new long[kosu];
		int initial=sc.nextInt();
		long GCD=0;
		for(int i=0; i<kosu; i++) {
			a[i]=Math.abs(sc.nextLong()-initial);
		}
		if(kosu==1) {
			System.out.println(a[0]);
			System.exit(0);
		}
		else if(kosu==2) {
			GCD=gcd(a[0],a[1]);
			System.out.println(GCD);
			System.exit(0);
		}
		else {
			GCD=gcd(a[0],a[1]);

			for(int i=2; i<kosu; i++) {
				GCD=gcd(GCD,a[i]);
			}
		}
		System.out.println(GCD);
	}

private static long gcd(long m, long n) {
	if(m < n) return gcd(n, m);
	if(n == 0) return m;
		return gcd(n, m % n);
	}
}
