
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(), k = scanner.nextLong();
		long ans = k;
		for (long i = 1; i < n; i++) {
			ans *= (k-1);			
		}
		System.out.println(ans);
		scanner.close();
	}
}