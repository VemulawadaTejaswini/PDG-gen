import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();

		if (b.equals("+")) {
			System.out.print(a + c);

		} else if (b.equals("-")) {

			System.out.print(a - c);
		}

	}
}
