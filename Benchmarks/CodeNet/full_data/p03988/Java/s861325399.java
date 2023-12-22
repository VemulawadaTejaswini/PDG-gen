import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			cnt[sc.nextInt()]++;
		}
		sc.close();

		int min = 0;
		for (int i = 0; i < n; i++) {
			if (cnt[i] > 0) {
				min = i;
				break;
			}
		}
		int max = n;
		for (int i = n - 1; i > 0; i--) {
			if (cnt[i] > 0) {
				max = i;
				break;
			}
		}

		if (min != (max + 1) / 2) {
			System.out.println("Impossible");
			return;
		}
		if (max % 2 == 0 && cnt[min] != 1) {
			System.out.println("Impossible");
			return;
		}
		if (max % 2 == 1 && cnt[min] != 2) {
			System.out.println("Impossible");
			return;
		}

		for (int i = min + 1; i <= max; i++) {
			if (cnt[i] < 2) {
				System.out.println("Impossible");
				return;
			}
		}
		System.out.println("Possible");
	}
}
