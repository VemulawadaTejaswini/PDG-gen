import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t[] = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			total = total + temp;
			t[i] = temp;
		}
		int m = scan.nextInt();
		int p[] = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = total - t[scan.nextInt() - 1] + scan.nextInt();
		}
		for (int ans : p) {
			System.out.println(ans);
		}

	}
}