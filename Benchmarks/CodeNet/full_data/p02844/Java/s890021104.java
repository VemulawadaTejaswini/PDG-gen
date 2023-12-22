import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int n = sc.nextInt();
		sc.nextLine();
		char[] s = sc.nextLine().toCharArray();
		int[] dp1 = new int[10];
		int[][] dp2 = new int[10][10];

		Set<String> counted = new HashSet<>();
		long answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					String t = String.valueOf(d[j]) + d[k] + s[i];
					if (dp2[j][k] > 0 && !counted.contains(t)) {
						counted.add(t);
						answer++;
					}
				}
			}
			for (int j = 0; j < 10; j++) {
				if (dp1[d[j] - '0'] > 0) {
					dp2[j][s[i] - '0']++;
				}
			}

			dp1[s[i] - '0']++;
		}

		System.out.println(answer);
	}
}
