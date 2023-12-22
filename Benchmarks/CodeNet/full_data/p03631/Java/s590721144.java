import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if ((n / 100) == (n % 10)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
