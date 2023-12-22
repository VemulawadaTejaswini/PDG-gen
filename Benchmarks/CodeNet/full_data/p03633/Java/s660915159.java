


import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		long[] a=new long[kosu];
		for(int i=0; i<kosu; i++) {
			a[i]=sc.nextLong();
		}
		long ans=1;

		for(int i=0; i<kosu; i++) {
			ans=lcm(ans,a[i]);
		}
		System.out.println(ans);

	}


	public static long lcm(long m, long n) {
		return m / gcd(m, n)*n;
	}
	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}