import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] e = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] S = new String[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.next();
		}
		sc.close();

		int[] cnt = new int[26];
		Arrays.fill(cnt, 1000);
		for (int j = 0; j < S.length; j++) {
			int[] tmp = new int[26];
			for (int i = 0; i < S[j].length(); i++) {
				tmp[S[j].charAt(i) - 'a']++;
			}
			for (int i = 0; i < cnt.length; i++) {
				cnt[i] = Math.min(cnt[i], tmp[i]);
			}
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				buf.append((char) ('a' + i));
			}
		}
		System.out.println(buf.toString());
	}
}
