
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		if (A == B && A == C) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
