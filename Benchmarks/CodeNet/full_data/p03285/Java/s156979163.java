import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		boolean can = false;

		for (int i = 0; i*4 <= N; i++) {
			for (int j = 0; i*4 + j*7 <= N; j++) {
				if ((N - i*4) % 7 == 0 ) {
					can = true;
					break;
				}
			}
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
