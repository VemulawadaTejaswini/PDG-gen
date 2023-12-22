import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			double[] array = new double[N];

			double result = 0;
			for (int i = 0; i < N; i++) {
				array[i] = scanner.nextInt();
			}
			for (int i  = 0; i < N; i++) {
				double tmp = 1.0 / array[i];
				result += tmp;
			}

			System.out.println(1 / result);
		}
	}
}