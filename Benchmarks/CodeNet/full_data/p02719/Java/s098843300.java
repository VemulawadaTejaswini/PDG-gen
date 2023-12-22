import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

		long ans = Math.min(n % k, Math.abs(n % k - k));
		
		System.out.println(ans);
	}

}