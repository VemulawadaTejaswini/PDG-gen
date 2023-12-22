import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		long sum = 0;
		int mmin = 1;
		int min = 1000000;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			for (int j = i; j < a.length; j++) {
				if (min > a[j])
					min = a[j];
				if (min == mmin) {
					sum += (a.length - j) * mmin;
					break;
				}

				sum += min;
			}
			if (mmin == a[i])
				mmin++;
		}
		System.out.println(sum);

	}
}