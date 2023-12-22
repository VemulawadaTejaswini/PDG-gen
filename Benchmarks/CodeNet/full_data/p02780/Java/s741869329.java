import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double n = scan.nextDouble()
				, k = scan.nextDouble();

		double ans = 0;
		double startIndex = n - k;
		for (double i = 0; i < n; i++) {
			long input = scan.nextLong();
			if (i < startIndex) {
				continue;
			}
			ans = input / (long) 2;
		}

		scan.close();

		System.out.println(ans);
	}

}
