import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();

		if (x < a) {
			System.out.println("NO");
		} else if (a + b < x) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

}
