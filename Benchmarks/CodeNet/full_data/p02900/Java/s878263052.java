import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();

		long g = gcd(A, B);
		int count = 1;

		if(g%2 == 0) {
			count++;
			while(g%2 == 0)g/=2;
		}
		if(g%3 == 0) {
			count++;
			while(g%3 == 0)g/=3;
		}

		boolean b = false;
		for(int i = 5; i <= Math.sqrt(g); i += (b = !b) ? 2 : 4) {
			if(g%i == 0) {
				count++;
				while(g%i == 0)g/=i;
			}
		}
		if(g != 1)count++;

		System.out.println(count);
	}
	static long gcd(long n, long m) {
		if(n>m)return gcd(m,n);
		if(n == 0)return m;
		return gcd(n, m%n);
	}
}