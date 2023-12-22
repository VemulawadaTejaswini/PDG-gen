import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			new Main().exec(sc);
		}
	}

	public void exec(Scanner sc) {
		int n = sc.nextInt();
		double sum = 0;
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			double xi = sc.nextDouble();
			list.add(xi);
			sum += xi;
		}
		int ave = (int) Math.round(sum / list.size());
		long result = 0;
		for (Double d : list) {
			result += Math.pow(d - ave, 2);
		}

		System.out.println(result);
	}
}
