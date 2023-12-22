import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n + 2];
		long d = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(sc.next());
			d += Math.abs(a[i] - a[i - 1]);
		}
		d += Math.abs(a[n]);
		for (int i = 1; i <= n; i++)
			System.out.println(d - (Math.abs(a[i] - a[i - 1]) + Math.abs(a[i + 1] - a[i])) + Math.abs(a[i + 1] - a[i - 1]));
	}
}