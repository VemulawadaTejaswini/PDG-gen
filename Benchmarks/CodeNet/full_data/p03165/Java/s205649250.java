import java.util.Scanner;

class Main{
	static int N;
	static int M;
	static char[] s, t;

	static char[][][] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		s = sc.next().toCharArray();
		t = sc.next().toCharArray();
		N = s.length;
		M = t.length;

		memo = new char[N][M][3000];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				memo[i][j][0] = '_';
			}
		}

		String ans = dp(0, 0);

		System.out.println(ans);
		sc.close();
	}

	static String dp(int i, int x) {
		if(i >= N|| x >= M)
			return "";
		if(memo[i][x][0] == '_') {
			String str1 = "", str2 = dp(i + 1, x);
			char a = s[i];
			for(int j = x; j < M; j++)
				if(a == t[j]) {
					str1 = a + dp(i + 1, j + 1);
					break;
				}
			if(str1.length() < str2.length())
				memo[i][x] = str2.toCharArray();
			else
				memo[i][x] = str1.toCharArray();
		}
		return new String(memo[i][x]);
	}
}