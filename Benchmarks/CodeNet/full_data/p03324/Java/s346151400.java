import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();

		if (D == 0) {
			System.out.println(N);
		} else if (D == 1) {
			System.out.println(N * 100);
		} else if (D == 2) {
			System.out.println(N * 10000);
		}

		sc.close();

	}

}