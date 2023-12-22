import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[][] ques = new int[q][2];
		for (int i = 0; i < q; i++) {
			ques[i] = new int[] { sc.nextInt(), sc.nextInt() };
		}
		sc.close();

		// 累積和
		int[] ruiseki = new int[n];
		for (int i = 1; i <= n; i++) {
			String tmp = s.substring(0, i);
			ruiseki[i - 1] = (tmp.length() - tmp.replace("AC", "").length()) / 2;
		}

		for (int i = 0; i < q; i++) {
			System.out.println(ruiseki[ques[i][1] - 1] - ruiseki[ques[i][0] - 1]);
		}
	}
}