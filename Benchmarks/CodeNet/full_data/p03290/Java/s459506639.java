import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int g = scan.nextInt();

		int[] p = new int[d];
		int[] c = new int[d];

		for(int i = 0; i < d; i++) {
			p[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		scan.close();
		int min = Integer.MAX_VALUE;
		// 今まで計算した中での最小問題数と比較する
		int ansNum = 0;	// 解答問題数
		int sum = 0;		// スコア合計

		// 解答した問題の種類と問題数を示す配列
		int[] answerNums = new int[d];
		for(int i = 0; i < d; i++) {
			answerNums[i] = 0;
		}
		answerNums[0] = 1;

		boolean carryFlg = false;	// 桁上がりフラグ
		boolean continuedFlg = true;

		while(continuedFlg) {
			ansNum = 0;
			sum = 0;
			carryFlg = true;

			// 各桁の計算
			for(int i = 0; i < d; i++ ) {
				ansNum += answerNums[i];
				sum += answerNums[i] * (100 * (i + 1));
				// コンプリートボーナスを付けるかどうか判定
				if(answerNums[i] == p[i]) {
					sum += c[i];
				}
			}

			// 点数合計が目標点数に達しているか
			if(sum >= g) {
				// これまでの最小問題数との比較
				min = Math.min(ansNum, min);
			}

			// 桁上がり処理
			for(int i = 0; i < d && carryFlg; i++) {
				if(answerNums[i] == p[i]) {
					if(i == d - 1) {
						// 処理終了
						carryFlg = false;
						continuedFlg = false;
					}else {
						// 桁上がり発生
						answerNums[i] = 0;
					}
				}else {
					answerNums[i]++;
					// 桁上がり処理終了
					carryFlg = false;
				}
			}
		}
		System.out.println(min);


	}

}
