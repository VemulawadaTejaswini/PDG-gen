import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();

			int sum = 0;
			for (int n = 1; n <= N; n++) {
				sum += n;
			}

			System.out.println(sum);
		}
	}
}
