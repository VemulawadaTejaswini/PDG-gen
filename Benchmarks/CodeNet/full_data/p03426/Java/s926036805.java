import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h;			// 列
		int w;			// 行
		int d;			// 移動量
		int testNum;	// 実技試験を行う回数
		int magicPower;	// 消費する魔力
		int[] xy_Ary;	// マスのxy座標
		// 整数と対応するマスを保管するマップ
		HashMap<Integer, int[]> cellMap = new HashMap<>();

		// H・W・Dの値を標準入力から取得
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		d = sc.nextInt();

		// 標準入力で受け取った整数をキーにして、対応する座標の配列を保管
		for (int x = 1; x <= h; x++) {
			for (int y = 1; y <= w; y++) {
				xy_Ary = new int[2];
				xy_Ary[0] = x;
				xy_Ary[1] = y;
				cellMap.put(sc.nextInt(), xy_Ary);
			}
		}

		// 実技試験の回数分、LとRのペア配列をリストに追加
		testNum = sc.nextInt();
		for (int i = 0; i < testNum; i++) {
			int l = sc.nextInt();	// 初期値L
			int r = sc.nextInt();	// 目的地R
			int addL = l;			// j回移動したL
			magicPower = 0;

			// （目的地R - 初期値L） / 移動量D = 瞬間移動する回数
			for (int j = 0; j < (r - l) / d; j++, addL += d) { // D>0なので0割り算は発生しない
				if (l == r)
					break; // 同じ整数の場合は差を計算する必要が無いのでスキップ
				int[] start;
				int[] gall;
				start = cellMap.get(addL);
				gall = cellMap.get(addL + d);
				int x = gall[0] - start[0];
				int y = gall[1] - start[1];
				// 移動距離は絶対値なので、負の数の場合は符号を変える
				if (x < 0) {
					x *= -1;
				}
				if (y < 0) {
					y *= -1;
				}
				magicPower += (x + y);
			}
			// コンソールに答えを表示
			System.out.println(magicPower);

		}

		sc.close();

	}
}
