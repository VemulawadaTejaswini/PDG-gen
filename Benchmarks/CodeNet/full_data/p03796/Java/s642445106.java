import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		long mod = 1000000007;
		long k = 1;
		for(long i = 1; i <= N; i++) {
			k *= i;
			k %= mod;
		}
		System.out.println(k);
	}
}