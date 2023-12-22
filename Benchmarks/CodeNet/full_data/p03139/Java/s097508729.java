import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b) {
			System.out.print(b);
		} else {
			System.out.print(a);
		}
		System.out.print(" ");
		if (n >= a + b) {
			System.out.print("0");
		} else {
				System.out.print((a + b) - n);
		}

		scanner.close();
	}

}