import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();

		//Bの入力を受け取る
		ArrayList<Integer> aryB = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			aryB.add(sc.nextInt());
		}

		//Aの入力を二次元配列にする　縦N,横M
		int[][] aryA = new int[N][M];
		if(N < M){
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					aryA[j][i] = sc.nextInt();
				}
			}
		}else{
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					aryA[i][j] = sc.nextInt();
				}
			}
		}

		//縦の分、計算を行う
		int cnt = 0;	//要件を満たす件数
		for (int i = 0; i < N; i++) {
			//その行の合計　行ごとに初期化
			float sum = 0;

			//その行の横の数を足しこむ
			for (int j = 0; j < M; j++) {
				sum = sum + (aryB.get(j) * aryA[i][j]);
			}

			//最後にCを足す
			sum = sum + C;

			//0より大きければカウント
			if(sum > 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
