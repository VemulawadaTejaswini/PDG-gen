import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[10000000];
		int c = 0;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int max = -1;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if (h[i] >= h[i + 1]) {
				c++;
				max = Math.max(c, max);
			} else {
				c = 0;
			}
		}
		System.out.println(max);
	}
}