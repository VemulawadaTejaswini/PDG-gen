import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer[] = new int[n];
		Arrays.fill(answer, -1);

		for (int i = 1; i <= m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (answer[s - 1] != -1 && answer[s - 1] != c) {
				System.out.println(-1);
				return;
			}
			answer[s - 1] = c;
		}

		int tmp = Integer.valueOf(Arrays.toString(answer).replace("[", "").replace("]", "").replace(",", "").replace(" ", "").replace("-1", "0"));

		if (String.valueOf(tmp).length() == n) {
			System.out.println(tmp);
		} else {
			System.out.println(-1);
		}

		sc.close();

	}

}
