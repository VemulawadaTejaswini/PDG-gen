import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void solve() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 0;
		int id = 0;
		for (int i = 0; i < n; i++) {
			if (id == 1) {
				System.out.println(cnt);
				return;
			}
			cnt++;
			id = a[id] - 1;
		}
		System.out.println(-1);
		return;
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}