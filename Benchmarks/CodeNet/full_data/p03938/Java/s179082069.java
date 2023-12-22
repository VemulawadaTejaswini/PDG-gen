import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}
		int[] a = new int[n];
		int[] b = new int[n];
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			r[p[i]] = i;
		}
		for (int i = 0; i < n; i++) {
			a[i] = 30000 * i;
			b[i] = 30000 * (n - i) + r[i];
		}
		sb.append(a[0]);
		for (int i = 1; i < n; i++) {
			sb.append(" " + a[i]);
		}
		sb.append("\n");

		sb.append(b[0]);
		for (int i = 1; i < n; i++) {
			sb.append(" " + b[i]);
		}
		sb.append("\n");
		System.out.print(sb);
	}
}