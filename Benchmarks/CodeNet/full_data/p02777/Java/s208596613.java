import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		String U = scanner.next();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (S.equals(U)) {
			System.out.println((A - 1) + " " + B);
		} else {
			System.out.println(A + " " + (B - 1));
		}
	}
}	