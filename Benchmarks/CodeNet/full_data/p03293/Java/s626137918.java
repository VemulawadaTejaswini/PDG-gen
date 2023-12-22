import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			String s = sc.next();
			String t = sc.next();

			t = t + t;
			System.out.println(t.contains(s) ? "Yes" : "No");

		}

	}
}
