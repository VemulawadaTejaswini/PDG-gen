import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {
			int a = Integer.parseInt(sc.next());

			if (a < 1200) {
				System.out.println("ABC");
			} else if (a < 2800) {
				System.out.println("ARC");
			} else if (a >= 2800) {
				System.out.println("AGC");
			}
		}

	}
}
