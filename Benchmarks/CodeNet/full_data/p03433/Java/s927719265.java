import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int rest = n % 5;

		if (rest == 0) {
			System.out.println("Yes");
		} else if (a < rest) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
