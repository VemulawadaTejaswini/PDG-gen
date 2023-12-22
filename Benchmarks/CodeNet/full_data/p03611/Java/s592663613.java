import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[100001];

		for (int i = 0; i < n; i++) {

			int m = sc.nextInt();
			a[m]++;

		}

		int max = 0;
		for (int i = 1; i < a.length - 1; i++) {
			int sum = a[i - 1] + a[i] + a[i + 1];
			if (sum > max)
				max = sum;
		}

		System.out.println(max);

		sc.close();

	}

}
