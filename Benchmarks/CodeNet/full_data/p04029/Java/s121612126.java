package abc043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//スキャナ宣言
		Scanner sc = new Scanner(System.in);

		//子供の人数Nを入力
		int N = sc.nextInt();

		//N人の子供に対して合計何個のキャンディーがいるかを算出する。
		int candySum = 0;
		for (int i = 1; i <= N; i++) {
			candySum = candySum + i;
		}

		//結果の出力
		System.out.println(N + "人の子供に対して必要なキャンディーの個数は" + candySum + "です");
	}

}