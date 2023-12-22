import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l, r, cnt = 0;
		int gate[] = new int[n];
		for (int i = 0; i < m; i++) {
			l = sc.nextInt() - 1;
			r = sc.nextInt() - 1;
			for (int j = l; j <= r; j++) {
				gate[j]++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (gate[i] == m) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
