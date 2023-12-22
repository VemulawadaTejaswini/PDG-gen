import java.util.Scanner;

public class atCoder_61_A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (A <= C && C <= B) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}