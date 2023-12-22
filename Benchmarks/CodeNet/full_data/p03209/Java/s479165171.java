import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long x = sc.nextLong();

		System.out.println(countP(n, x));

	}

	private static long countP(int n, long x) {
		long pCount = 0;

		if(x <= n) {
			// 下からn枚は全部パン！
			return 0;
		}

		if(n == 0) {
			// レベル0は肉一枚！
			return 1;
		}


		// 真ん中まで入ってるか
		long half = (long)Math.pow(2, n+1) - 2;
		if(x > half) {
			// 入ってる
			// 入ってるレベルの分をカウント
			pCount += (long)Math.pow(2,n) - 1;
			if(x != half) {
				// ピッタリじゃなければ
				// 真ん中のPをカウント
				pCount++;
				long nX = x - half -1;
				// 残りを再起呼び出し
				pCount += countP(n-1, nX);
			}
		} else {
			// 入ってない
			// レベルを下げてもう一回!
			// 一番下のパンの分を1枚引く
			return countP(n-1, x-1);
		}

		return pCount;

	}



}

