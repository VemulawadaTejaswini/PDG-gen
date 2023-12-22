import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.close();
		int[][][][] dp = new int[101][4][4][4];
		dp[0][3][3][3] = 1;
		int Mod = 1000_000_007;

		//文字列の文字数
		for (int len = 0; len < n; len++)
		{
			//最後から1文字目の文字
			for (int c1 = 0; c1 < 4; c1++)
			{
				//最後から2文字目の文字
				for (int c2 = 0; c2 < 4; c2++)
				{
					//最後から3文字目の文字
					for (int c3 = 0; c3 < 4; c3++)
					{
						//条件に当てはまるものがない場合はcontinue;
						if (dp[len][c1][c2][c3] == 0) continue;

						//新しく追加する文字
						for (int a = 0; a < 4; a++)
						{
							//ダメな5つの条件をカットする
							if (a == 2 && c1 == 1 && c2 == 0) continue;
							if (a == 2 && c1 == 0 && c2 == 1) continue;
							if (a == 1 && c1 == 2 && c2 == 0) continue;
							if (a == 2 && c1 == 1 && c3 == 0) continue;
							if (a == 2 && c2 == 1 && c3 == 0) continue;

							//ダメな条件を抜けたら、aを足した文字列が作れる

							// S = ...... c3 c2 c1
							// nextS = ...... c2 c1 a

							dp[len + 1][a][c1][c2] += dp[len][c1][c2][c3];
							if(dp[len + 1][a][c1][c2]>Mod)dp[len + 1][a][c1][c2] -= Mod;
						}
					}
				}
			}
		}

		int res = 0;

		//長さNの全部の答えを纏める
		//最後から1文字目の文字
		for (int c1 = 0; c1 < 4; c1++)
		{
			//最後から2文字目の文字
			for (int c2 = 0; c2 < 4; c2++)
			{
				//最後から3文字目の文字
				for (int c3 = 0; c3 < 4; c3++)
				{
					res += dp[n][c1][c2][c3];
					if(res > Mod)res-=Mod;
				}
			}
		}
		System.out.println(res);
	}

}