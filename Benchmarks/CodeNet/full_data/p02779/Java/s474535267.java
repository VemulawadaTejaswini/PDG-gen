
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		for (long i = 0; i < n; i++) {
			int input = scan.nextInt();
			sb.append(input);
			if (sb.toString().indexOf(String.valueOf(input)) > 0) {
				System.out.println("NO");
				scan.close();
				return;
			}
		}

		scan.close();
		System.out.println("YES");
	}

}
