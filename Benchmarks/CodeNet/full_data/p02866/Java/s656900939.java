import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i ++) {
			array[i] = sc.nextInt();
		}

		int result = 1;
		int beforeCount = 1;

		for (int i= 0;i < n; i++) {
			int count = 0;
			for (int k : array) {
				if (i == k) {
					count ++;
				}
			}

			result = (int) (result * (Math.pow(beforeCount, count) % 998244353) % 998244353);

			beforeCount = count;
		}

		System.out.println(result);
	}

}