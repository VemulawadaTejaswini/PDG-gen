import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();

		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			int L = s.nextInt();
			int R = s.nextInt();

			if (L > min) {
				min = L;
			}
			if (R < max) {
				max = R;
			}
		}
		System.out.println(max - min+1);

	}
}