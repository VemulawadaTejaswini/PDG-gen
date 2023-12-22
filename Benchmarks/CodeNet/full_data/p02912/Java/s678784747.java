import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int[] price = new int[n];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(sc.next());
		}

		int maxInd;
		for (int i = 0; i < m; i++) {
			maxInd = 0;
			for (int j = 1; j < n; j++) {
				if (price[maxInd] < price[j]) {
					maxInd = j;
				}
			}
			price[maxInd] /= 2;
		}

		for(int num : price) {
			sum += num;
		}
		System.out.println(sum);

	}
}