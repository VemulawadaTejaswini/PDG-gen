import java.util.Scanner;

/*
 * AtCoder Beginner Contest 100 A
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (A <= 8 && B <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}

	}

}