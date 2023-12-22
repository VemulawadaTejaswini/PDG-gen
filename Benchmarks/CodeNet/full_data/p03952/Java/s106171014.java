import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		int cnt = 0;
		if (x == 1 || x == 2 * n - 1) {
			System.out.println("No");
		} else if (x == 2) {
			sb.append("Yes\n");
			for (int i = 1; i <= 2 * n - 1; i++) {
				if (x - 1 == i || x == i || x + 1 == i || x + 2 == i) {
				} else if (cnt == n - 2) {
					sb.append(x + 1 + "\n");
					sb.append(x + "\n");
					sb.append(x - 1 + "\n");
					sb.append(x + 2 + "\n");
					cnt++;
					i--;
				} else {
					sb.append(i + "\n");
					cnt++;
				}
			}
		} else {
			sb.append("Yes\n");
			for (int i = 1; i <= 2 * n - 1; i++) {
				if (x - 1 == i || x == i || x + 1 == i || x - 2 == i) {
				} else if (cnt == n - 2) {
					sb.append(x - 1 + "\n");
					sb.append(x + "\n");
					sb.append(x + 1 + "\n");
					sb.append(x - 2 + "\n");
					cnt++;
					i--;
				} else {
					sb.append(i + "\n");
					cnt++;
				}
			}
		}
		System.out.print(sb);
	}
}