import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[] = new int[n];
		Arrays.fill(x, -1);

		boolean can = true;
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (x[s - 1] != -1 && x[s - 1] != c) can = false;
			x[s - 1] = c;
		}

		if (x[0] == 0 || !can) {
			System.out.println(-1);
		} else if (x[0] == -1) {
			x[0] = 1;
			System.out.println(Arrays.toString(x).replace("-1", "0").replace("[", "").replace("]", "").replace(", ", ""));
		} else {
			System.out.println(Arrays.toString(x).replace("-1", "0").replace("[", "").replace("]", "").replace(", ", ""));
		}

		sc.close();

	}

}