import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer[] = new int[n];
		Arrays.fill(answer, 0);

		for (int i = 1; i <= m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (answer[s - 1] != 0 && answer[s - 1] != c) {
				System.out.println(-1);
				return;
			}
			answer[s - 1] = c;
		}

		if (answer[0] != 0) {
			System.out.println(Arrays.toString(answer).replace("[", "").replace("]", "").replace(",", ""));
		} else {
			System.out.println(-1);
		}

		sc.close();

	}

}
