import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a + b <= b + c && a + b <= a + c) {

			System.out.println(a + b);

		} else if (a + c <= a + b && a + c <= b + c) {

			System.out.println(a + c);

		} else if (b + c <= a + c && b + c <= a + b) {

			System.out.println(b + c);

		}

	}
}
