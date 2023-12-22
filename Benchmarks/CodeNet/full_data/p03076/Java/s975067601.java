import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		int[] ia = new int[5];
		ia[0] = sc.nextInt();
		ia[1] = sc.nextInt();
		ia[2] = sc.nextInt();
		ia[3] = sc.nextInt();
		ia[4] = sc.nextInt();

		int sum = 0;
		int min = 9;
		int ii = 0;

		for (int i = 0; i < 5; i++) {
			if (ia[i] % 10 == 0) {
				continue;
			}
			if (ia[i] % 10 < min) {
				ii = i;
				min = ia[i] % 10;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (i == ii) {
				continue;
			}

			if (ia[i] % 10 == 0) {
				sum += ia[i];
			} else {
				sum += ia[i] + (10 - ia[i] % 10);
			}
		}
		sum += ia[ii];

		System.out.println(sum);
	}
}