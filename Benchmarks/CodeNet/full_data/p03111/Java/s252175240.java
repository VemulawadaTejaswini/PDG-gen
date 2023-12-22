import java.text.ParseException;
import java.util.Scanner;

class Main {
	static int n;
	static int a;
	static int b;
	static int c;
	static int[] bamboo;

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		bamboo = new int[n];

		for (int i = 0; i < n; i++) {
			bamboo[i] = sc.nextInt();
		}

		int cur = 0, ba = 0, bb = 0, bc = 0;

		int mp = dfs(cur, ba, bb, bc);

		System.out.println(mp);

		sc.close();
	}

	private static int dfs(int cur, int ba, int bb, int bc) {
		// TODO 自動生成されたメソッド・スタブ
		if (cur == n) {
			if (Math.min(ba, Math.min(bb, bc)) > 0) {
				return Math.abs(ba - a) + Math.abs(bb - b) + Math.abs(bc - c) - 30;
			} else {
				return 1000000000;
			}
		}

		int ret0 = dfs(cur + 1, ba, bb, bc);
		int ret1 = dfs(cur + 1, ba + bamboo[cur], bb, bc) + 10;
		int ret2 = dfs(cur + 1, ba, bb + bamboo[cur], bc) + 10;
		int ret3 = dfs(cur + 1, ba, bb, bc + bamboo[cur]) + 10;

		return Math.min(ret0, Math.min(ret1, Math.min(ret2, ret3)));
	}

}
