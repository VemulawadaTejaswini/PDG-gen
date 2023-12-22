import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input > ");

		int a = Integer.parseInt(scanner.next());
		int b = Integer.parseInt(scanner.next());
		int c = Integer.parseInt(scanner.next());

		String answer = null;
		if (c >= a) {
			if (c <= b) {
				answer = "Yes";
			} else {
				answer = "No";
			}
		} else {
			answer = "No";
		}

		System.out.println(answer);
		scanner.close();
	}
}
