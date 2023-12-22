import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			String n = sc.next();
			String m = sc.next();

			StringBuffer sb = new StringBuffer(n);
			sb.reverse();

			if (n.equals(m) ||sb.toString().equals(m)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}
}
