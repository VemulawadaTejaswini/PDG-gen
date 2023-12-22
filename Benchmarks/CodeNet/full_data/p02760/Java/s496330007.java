import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// ビンゴカード
		int bingoCard[][] = new int[3][3];

		// ビンゴ状態管理
		boolean bingo[][] = new boolean[3][3];

		int N;

		int b[] = new int[10];

		// ビンゴカードの値設定
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				bingoCard[i][j] = scan.nextInt();
			}
		}

		//System.out.println(Arrays.deepToString(bingoCard));
		N = scan.nextInt();

		// ビンゴに使う値の設定
		for(int i = 0; i  < N; i++) {
			b[i] = scan.nextInt();
		}

		// ビンゴの当たり管理
		for(int i = 0; i < 3; i++) {
			//System.out.println(i);
			for(int j = 0; j < 3; j++)
			{
				//System.out.println(j);
				bingo[i][j] = false;
				for(int k = 0; k < N; k++) {

					// ビンゴカードの中で数字が一致したらtrue
					if(bingoCard[i][j] == b[k]) {
						bingo[i][j] =  true;
					}
				}
			}
		}

		String ans  = "No";


		for(int i = 0; i < 3; i++) {
			//行がそろった
			if(bingo[i][0] &&  bingo[i][1] && bingo[i][2]) {
				ans = "Yes";
			}
			//列がそろった
			if(bingo[0][i] &&  bingo[1][i] && bingo[2][i]) {
				ans = "Yes";
			}
		}

		// 左上から斜め
		if(bingo[0][0] && bingo[1][1] && bingo[2][2]) {
			ans = "Yes";
		}

		// 右上から斜め
		if(bingo[0][2] && bingo[1][1] && bingo[2][0]) {
			ans = "Yes";
		}


		System.out.println(ans);

	}

}