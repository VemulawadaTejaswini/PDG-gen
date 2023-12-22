import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean result = true;

		int left = 0;
		int mid = sc.nextInt();	// 1個目
		int right = 0;

		for (int i = 0; i < N - 1; i++) {
			right = sc.nextInt();

			if (mid - 1 > right) {
				result = false;
				break;
			} else if (mid - 1 == right && left > mid - 1) {
				result = false;
				break;
			}

			if (left == mid) {
				left = mid;
				mid = right;
			} else {
				left = mid - 1;
				mid = right;
			}
		}

		System.out.println(result ? "Yes" : "No");
	}
}