import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		System.out.println(
				a.substring(0, 1).toUpperCase() + b.substring(0, 1).toUpperCase() + c.substring(0, 1).toUpperCase());

	}
}
