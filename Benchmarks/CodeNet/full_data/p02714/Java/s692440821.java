import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long cntR = 0;
		long cntG = 0;
		long cntB = 0;
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == 'R') {
				++cntR;
			} else if (s.charAt(i) == 'G') {
				++cntG;
			} else {
				++cntB;
			}
		}

		long ans = cntR * cntG * cntB;

		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				int k = 2 * j - i;
				if (k >= n) {
					continue;
				}

				char ci = s.charAt(i), cj = s.charAt(j), ck = s.charAt(k);
				if (ci != cj && cj != ck && ck != ci) {
					--ans;
				}
			}
		}

		System.out.println(ans);
	}

}
