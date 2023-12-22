import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static double max = 0.0;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();

			double[] array = new double[N];
			Map<Double, Boolean> map = new HashMap<Double, Boolean>();
			for (int i = 0; i < N; i++) {
				array[i] = scanner.nextDouble();
			}

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					double tmp1 = (array[i] + array[j]) / 2;
					if (N == 2) {
						max = tmp1;
					}
					for (int k = 0; k < N; k++) {
						if (k != i && k != j) {
							double tmp2 = (tmp1 + array[k]) / 2;
							if (max <= tmp2) {
								max = tmp2;
							}
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}
