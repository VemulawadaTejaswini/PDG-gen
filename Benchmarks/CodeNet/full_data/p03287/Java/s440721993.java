import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];



		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt() % m;
		}

		long count = 0;

		for(int i = 0; i < n; i++) {
			int tmp = 0;
			for(int j = i; j < n; j++) {
				tmp = tmp + a[j];
				if (tmp % m == 0) {
					count++;
				}
				tmp = tmp % m;
			}
		}
		System.out.println(count);


		scanner.close();
	}

}