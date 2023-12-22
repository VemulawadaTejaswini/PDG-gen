import java.util.Scanner;
public class Main {
	static long gcd(long a,long b) {
		long temp = 0;
		while(a % b != 0) {
			temp = a;
			a = b;
			b = temp % b;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		int c = sc.nextInt();
		int d = sc.nextInt();
		long p = c > d ? gcd(c,d):gcd(d,c);
		long k = (long)c*d/p;
		
		long ansb = b -(b/c + b/d - b/k);
		long ansa = (a -1) -((a-1)/c+(a-1)/d-(a-1)/k);
		System.out.println(ansb -ansa);

	}

}
