import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = Integer.parseInt(sc.next());
		int max = 0;
		for (int i = 1; i <= n; i++) {
			int j = i;
			boolean b = false;
			for (int k = 0; k < n; k++) {
				if (p[k] == i - 1 && !b) break;
				if (p[k] == j) {
					b = true;
					j++;
				}
			}
			max = Math.max(max, j - i + 1);
		}
		System.out.println(n - max + 1);
	}
}