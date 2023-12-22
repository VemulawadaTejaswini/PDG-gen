import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long start = sc.nextLong();
		for (int i = 1; i < N; i++) {
			start = gcd(start, sc.nextLong());
		}
		
		System.out.println(start);
	}
	
	public static long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}
}
