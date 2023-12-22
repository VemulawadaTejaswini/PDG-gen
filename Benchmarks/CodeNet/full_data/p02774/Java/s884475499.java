import java.util.Scanner;

public class Main {

	public static void sort(long set[]) {
		int sz = set.length;
		for (int i = 0; i < sz; i++) {
			for (int j = i; j < sz; j++) {
				if (set[i] > set[j]) {
					long nm = set[i];
					set[i] = set[j];
					set[j] = nm;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int c = N * (N - 1) / 2;
		long set[] = new long[c];
		long number[] = new long[N];
		for (int i = 0; i < N; i++) {
			number[i] = sc.nextLong();
		}
		int k = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (i != j) {
					set[k] = number[i] * number[j];
					k++;
				}
			}
		}

		sort(set);

		System.out.println(set[K - 1]);

	}
}
