import java.util.Scanner;

public class Main {
	public static final String str = "AC";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		String S = scanner.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for (int i = 0; i < Q; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}
//		for (int i = 0; i < Q; i++) {
//			String s2 = new String(S.substring(l[i] - 1, r[i]));
//			int ans = judgeAndChange(s2);
//			System.out.println(ans);

//		}
		scanner.close();
		int[] ans = new int[N + 1];
		for (int i = 1; i < N; i++) {
//			System.out.println(ans[i]);
			if (S.charAt(i) == 'C' && S.charAt(i - 1) == 'A') {
				ans[i + 1] = ans[i] + 1;
			} else {
				ans[i + 1] = ans[i];
			}
		}
//		for (int i : ans) {
//			System.out.print(i);
//		}
//		System.out.println();
		for (int i = 0; i < Q; i++) {
//			System.out.println("ans[" + r[i] + "]-ans[" + l[i] + "]");
			System.out.println(ans[r[i]] - ans[l[i]]);
		}
	}

//	public static int judgeAndChange(String s) {
//		int ans = 0;
//		while (s.contains(str)) {
//			s = s.replaceFirst(str, "XX");
//			ans++;
//		}
//		return ans;
//	}
}
