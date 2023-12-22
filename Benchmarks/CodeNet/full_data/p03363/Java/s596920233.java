import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no1();
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			long[] a = new long[n];

			long sum = 0;
			int count = 0;
			long tmp = 0;

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
				sum = sum + a[i];
				if (sum == 0) {
					count++;
				}
				tmp = sum;
				for (int j = 0; j < i; j++) {
					tmp = tmp - a[j];
					if (tmp == 0) {
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}

}
