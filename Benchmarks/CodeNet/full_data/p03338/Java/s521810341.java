import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int ans = 0;
		for (int i = 0; i < S.length(); i++) {
			char[] first = S.substring(0, i + 1).toCharArray();
			char[] last = S.substring(i + 1, S.length()).toCharArray();
			int[] alpha_f = new int[26];
			int[] alpha_l = new int[26];
			for (int j = 0; j < first.length; j++) {
				alpha_f[first[j] - 'a']++;
			}
			for (int j = 0; j < last.length; j++) {
				alpha_l[last[j] - 'a']++;
			}
			int count = 0;
			for (int j = 0; j < 26; j++) {
				if (alpha_f[j] > 0 && alpha_l[j] > 0) {
					count++;
				}
			}
			ans = Math.max(ans, count);

		}
		System.out.println(ans);
		sc.close();
	}
}