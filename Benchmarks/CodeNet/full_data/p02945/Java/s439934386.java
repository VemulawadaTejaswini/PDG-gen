import java.util.Scanner;

public class Main {
	private static String text;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		String[] lines = line.split(" ");
		int A = Integer.parseInt(lines[0]);
		int B = Integer.parseInt(lines[1]);
		if (A > 0 && B > 0)
			System.out.println(A * B);
		else if (B >= 0)
			System.out.println(A + B);
		else
			System.out.println(A - B);
	}
}