import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		quick_sort(A, 0, N - 1);
		
		int kn = 1;
		int[] knc = new int[N];
		knc[0] = 1;
		for (int i = 1; i < N; i++) {
			if (A[i] == A[i - 1]) {
				knc[kn-1]++;
			} else {
				kn++;
				knc[kn-1] = 1;
			}
		}

		int tar = kn - K;
		if (tar <= 0) {
			System.out.println(0);
			return;
		}

		quick_sort(knc, 0, kn - 1);
		int sum = 0;
		int i = 0;
		while (tar > 0) {
			sum += knc[i];
			i++;
			tar--;
		}

		System.out.println(sum);

	}


	public static void quick_sort(int[] d, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = d[(left + right) / 2];
		int l = left, r = right, tmp;
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

}
