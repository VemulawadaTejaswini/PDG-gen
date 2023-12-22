import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long g = gcm (a, b);
		int count = 1;
		long n = (long)Math.sqrt(g);
		n++;

		for(int i = 2; i <= n; i++) {
			if(g%i == 0) {
				while(g%i == 0) {
					g = g/i;
				}
				count++;
			}
		}

		if(g > 1) count++;

		System.out.println(count);
		sc.close();
	}
	private static long gcm(long a, long b) {
		if(a<b) return gcm(b, a);
		if(b ==0) return a;
		return gcm(b, a%b);
	}
}