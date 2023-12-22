import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong();
		for (int i=0;i<N-1;i++) {
			long t = sc.nextLong();
			T = T/Main.gcd(T, t)*t;
		}
		System.out.println(T);
	}

	public static long gcd (long a,long b) {
		if (a<b) {
			return gcd(b,a);
		}
		if (b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
