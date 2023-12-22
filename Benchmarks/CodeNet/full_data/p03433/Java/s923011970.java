import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		boolean check = false;

		for (int i = 1; i <= A; i++) {
			if ((N - 1 * i) % 500 == 0) {
				check = true;
			}
		}

		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
