import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int tap = 1;
		int emptyTap = A;

		while (true) {
			if (emptyTap < B) {
				emptyTap = emptyTap + A - 1;
				tap++;
			} else
				break;
		}

		System.out.println(tap);

	}

}
