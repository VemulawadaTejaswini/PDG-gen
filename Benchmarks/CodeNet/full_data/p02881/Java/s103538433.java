import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n   = Long.parseLong(sc.nextLine());
		long ans = 0;

		for(int i = 1; i < Math.sqrt(n);i++) {

			if(n % i == 0) {

				ans = Math.max(ans, i);
			}

		}

		System.out.println(ans + n / ans - 2);
	}
}
