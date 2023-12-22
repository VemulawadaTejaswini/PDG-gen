import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (b[i] > b[j]) {
					int tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		String ans = "Yes";
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum > b[i]) {
				ans = "No";
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
