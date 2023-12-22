import java.util.Scanner;

public class Main {
	static void quick_sort(int[] d, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = d[(left + right) / 2];
		int l = left, r = right;
		int tmp;
		while (l <= r) {
			while (d[l] < p) {
				l++;
			}
			while (d[r] > p) {
				r--;
			}
			if (l <= r) {
				tmp = d[l];
				d[l] = d[r];
				d[r] = tmp;
				l++;
				r--;
			}
		}
		quick_sort(d, left, r); // ピボットより左側をクイックソート
		quick_sort(d, l, right); // ピボットより右側をクイックソート
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int address[] = new int[N];
		for (int i = 0; i < N; i++) {
			address[i] = sc.nextInt();
		}
		if (N == 1) {
			System.out.println(0);
		} else {

			quick_sort(address, 0, N - 1);
			int sum = 0;
			int min = 0;
			for (int i = 0; i < N; i++) {
				min += address[i] * address[i];
			}

			for (int i = 1; i <= 100; i++) {
				for (int j = 0; j < N; j++) {
					sum += (address[j] - i) * (address[j] - i);
				}
				if (sum < min) {
					min = sum;
				}
				sum = 0;
			}

			System.out.println(min);
		}
	}
}
