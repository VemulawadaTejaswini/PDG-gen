import java.util.*;

public class Main {

	public static long solve() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int len = S.length();
		long K = sc.nextLong();
		char start = S.charAt(0);

		boolean all_same = true;
		for (int i = 0; i < len; i++) if (S.charAt(i) != start) all_same = false;

		//Sの全文字が同じ場合
		if (all_same) {
			sc.close();
			return len * K / 2;
		}

		//連続する文字数
		ArrayList<Integer> list = new ArrayList<Integer>();
		char prev = S.charAt(0);
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			char c = S.charAt(i);
			if (c == prev) cnt++;
			else {
				list.add(cnt);
				cnt = 1;
			}
			prev = c;
		}
		if (cnt != 1) list.add(cnt);

		long ans = 0;
		//Sに対する答え
		for (int i : list) ans += i / 2;
		ans *= K;
		//Sの先頭と末尾が同じ場合
		if (S.charAt(0) == S.charAt(len - 1)) {
			int a = list.get(0);
			int b = list.get(list.size() - 1);
			ans -= (K - 1) * (a / 2 + b / 2 - (a + b) / 2);
		}

		sc.close();
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(solve());
	}
}
