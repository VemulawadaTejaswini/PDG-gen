


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		long x =lcm(n,m);
		boolean ok = true;
		for (int i=0;i<n;i++) {
			if ((x/n*i)%(x/m)==0 && s.charAt(i)!=t.charAt((int)(x/n*i/(x/m)))) {
				ok=false;
			}
		}
		for (int i=0;i<m;i++) {
			if ((x/m*i)%(x/n)==0 && t.charAt(i)!=s.charAt((int)(x/m*i/(x/n)))) {
				ok=false;
			}
		}
		
		System.out.println(ok?x:-1);
	}
	
	static long lcm(int n, int m) {
		return (n*m)/gcd(n,m);
	}
	static int gcd(int n, int m) {
		if (n<m) {
			return gcd(m,n);
		}
		if (n%m==0) {
			return m;
		}
		return gcd(m,n%m);
	}
}
