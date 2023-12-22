import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		double ans = (double) count / N;
		System.out.println(String.format("%.6f", ans));
		in.close();
	}
}