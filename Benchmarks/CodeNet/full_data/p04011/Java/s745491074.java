import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		if (n <= k) {
			result = x * n;
		} else {
			for (int i = 0; i < k; i++) {
				result += x;
			}
			int h = n - k;
			for (int j = 0; j < h; j++) {
				result += y;
			}
		}
		System.out.println(result);
	}
}