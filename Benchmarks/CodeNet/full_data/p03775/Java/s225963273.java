import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String B;
		long n = Long.MAX_VALUE;

		for(int i = 1; i <= Math.sqrt(N); i++) {
			if(N % i == 0) {
				B = String.valueOf(N / i);
				n = B.length();
			}
		}
		System.out.println(n);
		sc.close();
	}
}
