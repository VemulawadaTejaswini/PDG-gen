import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		double answer = 0;
		List<Double> nums = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			double num = scan.nextDouble();
			nums.add(num);
		}

		double result = 0;
		for (int i = 0; i < K; i++) {
			result += nums.get(i);
		}

		for (int i = 1; i <= N - K; i++) {
			result = result - nums.get(i - 1) + nums.get(i + K - 1);
			if (answer < result) answer = result;
		}

		System.out.println((answer + K) / 2l);
	}
}