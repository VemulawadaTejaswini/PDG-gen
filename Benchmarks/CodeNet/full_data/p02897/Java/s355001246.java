import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double result = 0.0;

		if (n % 2 == 0) {
			result = 0.5;
		} else {
			result = n + 1 / 2 / n;
		}
		System.out.println(result);
		sc.close();
	}

}
