import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrT = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arrT[i] = x;
			total += x;
		}
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			sb.append(total - arrT[p - 1] + x).append("\n");
		}
		System.out.print(sb);
	}
}
