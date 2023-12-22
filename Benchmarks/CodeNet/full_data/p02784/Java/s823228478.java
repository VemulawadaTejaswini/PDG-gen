import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int N = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			H -= scanner.nextInt();
			if (H <= 0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		return;
	}

}
