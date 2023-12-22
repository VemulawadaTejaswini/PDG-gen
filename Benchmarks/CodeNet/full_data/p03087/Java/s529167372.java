import java.util.Scanner;

public class Main {
	public static final String str = "AC";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		String S = new String(scanner.next());
		int[] l = new int[Q];
		int[] r = new int[Q];
		for (int i = 0; i < Q; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}
		for (int i = 0; i < Q; i++) {
			String s2 = new String(S.substring(l[i] - 1, r[i]));
			int ans = judgeAndChange(s2);
			System.out.println(ans);
		}
		scanner.close();
	}

	public static int judgeAndChange(String s) {
		int ans = 0;
		while (s.contains(str)) {
			s = s.replaceFirst(str, "XX");
			ans++;
		}
		return ans;
	}
}