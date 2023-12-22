import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * author: 31536000
			 * AtCoder Beginner Contest 160 D問題
			 * 考察メモ
			 * iを決め打つと、i->jの距離は次のmin
			 * 1. j-i (iからjへ真っすぐ)
			 * 2. i->X->Y->j, よって|X-i|+|Y-j|+1(X->Yを経由)
			 * ここで|X-i|は定数であり、|Y-j|は凹関数であることを利用すると答えは実は(高々)3本の傾き1の直線で表せる
			 * よって区間加算さえできれば良く、imos法などで解ける
			 * O(N)ですね！
			 *
			 */
			int N = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
			int[] imos = new int[2 * N];
			for (int i = 1;i < X;++ i) {
				// 1. i->jに加算
				++ imos[0];
				-- imos[(X + Y + 1) / 2 - i];
				// 2. i->X->Y->j (j≦Y)に加算、ただしこの際1で数えてる分は除外
				++ imos[X - i];
				-- imos[(X + Y) / 2 - i];
				// 3. i->X->Y->j (j>Y)に加算
				++ imos[X - i + 1];
				-- imos[X - i + N - Y + 1];
			}
			for (int i = X;i < (X + Y + 1) / 2;++ i) {
				// 1. i->jに加算
				++ imos[0];
				-- imos[(Y - X + 1) / 2];
				// 2. i->X->Y->j (j≦Y)に加算、ただしこの際1で数えてる分は除外
				++ imos[i - X];
				-- imos[(Y - X) / 2];
				// 3. i->X->Y->j (j>Y)に加算
				++ imos[i - X + 1];
				-- imos[i - X + N - Y + 1];
			}
			for (int i = (X + Y + 1) / 2;i < N;++ i) {
				// 明らかにXが遠いので、i->jしかない
				++ imos[0];
				-- imos[N - i];
			}
			int[] ans = new int[N - 1];
			System.out.println(ans[0] = imos[0]);
			for (int i = 1;i < ans.length;++ i) 	System.out.println(ans[i] = ans[i - 1] + imos[i]);
		}
	}
}