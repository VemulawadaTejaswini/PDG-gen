import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] ave = new double[n];

		for (int i = 0; i < n; i++) {
			int roll = sc.nextInt();
			ave[i] = 1.000000 / 2 / roll * (roll + 1) * roll;
			System.out.println(roll + " " + ave[i]);
		}

		double sum;
		double max = 0;

		for (int i = 0; i < n - k + 1; i++) {
			sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += ave[j];
			}
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(max);

	}

}
