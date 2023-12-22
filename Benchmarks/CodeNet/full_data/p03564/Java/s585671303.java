import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 1;
		for (int i = 0; i < n; i++) {
			int tmp = Math.min(result * 2, result + k);
			result = tmp;
		}
		System.out.println(result);
		sc.close();
	}
}