import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A;
		for (int i = 0; i < N; i++) {
			A = scanner.nextInt();
			if (A % 2 == 0) {
				if (A % 3 != 0 && A % 5 != 0) {
					System.out.println("DENIED");
					return;
				}
			}
		}
		System.out.println("APPROVED");
	}

}
