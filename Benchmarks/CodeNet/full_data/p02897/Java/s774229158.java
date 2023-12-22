import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(2.0 / a);
		} else {
			System.out.println((double) ((int) ((a / 2) + 1) / a));
		}

	}
}