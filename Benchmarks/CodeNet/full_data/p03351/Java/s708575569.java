import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		if ((Math.abs(b - a) <= d && Math.abs(c - b) <= d) || Math.abs(c - a) <= d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
