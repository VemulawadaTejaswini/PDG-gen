import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		double exp = (double) 1 / n;
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			int count = 1;
			int tmp = i;
			while (tmp < k) {
				tmp *= 2;
				count *= 2;
			}
			sum += exp / count;
		}

		System.out.println(sum);

	}
}