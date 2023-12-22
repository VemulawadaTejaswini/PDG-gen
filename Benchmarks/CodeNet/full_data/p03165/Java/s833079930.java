import java.util.Scanner;

class Main{
	static int N;
	static int M;
	static char[] s, t;

	static char[][][] memo;
	static boolean[][] memoflag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		s = sc.next().toCharArray();
		t = sc.next().toCharArray();
		N = s.length;
		M = t.length;

		memo = new char[N][M][];
		memoflag = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				memoflag[i][j] = false;
			}
		}

		String ans = new String(dp(0, 0));

		System.out.println(ans);
		sc.close();
	}

	static char[] dp(int i, int x) {
		if(i >= N|| x >= M)
			return new char[0];
		if(!memoflag[i][x]) {
			memoflag[i][x] = true;
			char[] str1 = new char[0], str2 = dp(i + 1, x);
			char a = s[i];
			for(int j = x; j < M; j++)
				if(a == t[j]) {
					char[] tmp = dp(i + 1, j + 1);
					str1 = new char[tmp.length + 1];
					str1[0] = a;
					System.arraycopy(tmp, 0, str1, 1, tmp.length);
					break;
				}
			if(str1.length < str2.length)
				memo[i][x] = str2;
			else
				memo[i][x] = str1;
		}
		return memo[i][x];
	}
}
