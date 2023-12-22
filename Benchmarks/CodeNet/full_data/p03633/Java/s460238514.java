import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		long ans = 1;
		for(int i=0;i<N;i++) {
			T[i] = sc.nextLong();
			ans = lcm(ans,T[i]);
			System.out.println(T[i]+" "+ans);
		}
		System.out.println(ans);
	}

	public static long gcd(long a,long b) {
		if(b == 0) return a;
		else return gcd(b,a%b);
	}

	public static long lcm(long a,long b) {
		if(a > b) return (a/gcd(a,b))*b;
		else return (b/gcd(a,b))*a;
	}
}
