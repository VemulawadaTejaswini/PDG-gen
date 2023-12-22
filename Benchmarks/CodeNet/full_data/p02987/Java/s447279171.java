import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		int cnt = 0;
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 1; i < p.length - 1; i++) {
			if (p[i - 1] < p[i] && p[i] < p[i + 1]
					|| p[i - 1] > p[i] && p[i] > p[i + 1]) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}
}