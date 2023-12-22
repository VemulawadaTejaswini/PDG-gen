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
		String flag = "C";
		for (int i = 0; i < n; i++) {
			switch (flag) {
			case "A":
				if (String.valueOf(s.charAt(i)).equals("C")) {
					ruiseki[i] = ruiseki[i - 1] + 1;
				} else {
					ruiseki[i] = ruiseki[i - 1];
				}
				flag = "C";
				break;
			case "C":
				if (String.valueOf(s.charAt(i)).equals("A")) {
					flag = "A";
				}
				if (i != 0)
					ruiseki[i] = ruiseki[i - 1];
				break;
			}
			// デバッグ
			// System.out.println(ruiseki[i]);
			// replaceのオーダーがO(|S|)なので死
			// ruiseki[i - 1] = (tmp.length() - tmp.replaceAll("AC", "").length()) / 2;
		}

		for (int i = 0; i < q; i++) {
			System.out.println(ruiseki[ques[i][1] - 1] - ruiseki[ques[i][0] - 1]);
		}
	}
}