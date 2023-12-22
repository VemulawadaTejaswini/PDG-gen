import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int t = 0;
		if (l < 0 && Math.abs(l) >= n) {
			for (int i = 0; i < n - 1; i++) {
				t += l + i;
			}
		} else if (l >= 0) {
			for (int i = 0; i < n - 1; i++) {
				t += l + i + 1;
			}
		} else {
			for (int i = 0; i < n; i++) {
				t += l + i;
			}
		}
		System.out.println(t);
	}

}