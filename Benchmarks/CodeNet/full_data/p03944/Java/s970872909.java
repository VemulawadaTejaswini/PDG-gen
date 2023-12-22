import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 入力を読み込む
		Scanner sc = new Scanner(System.in);

		// 取得
		int maxX = sc.nextInt();
		int maxY = sc.nextInt();
		int squearNum = sc.nextInt();
		
		// 長方形作成
		boolean[][] squear = new boolean[maxX][maxY];
		// 長方形の色を塗っていく
		int x;
		int y;
		int positionPaint;
		for (int i = 0; i < squearNum; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			positionPaint = sc.nextInt();
			
			// 条件によって色を塗る
			switch (positionPaint) {
			case 1 :
				paintX(squear, x, 0, maxY);
				break;
			case 2 :
				paintX(squear, maxX, x, maxY);
				break;
			case 3 :
				paintY(squear, y, 0, maxX);
				break;
			case 4 :
				paintY(squear, maxY, y, maxX);
				break;
			default :
			}
			
		}
		int count = 0;
		// 塗られていない箇所を求める
		for (int i = 0; i < maxX; i++) {
			for (int j = 0; j < maxY; j++) {
				if (!squear[i][j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void paintX(boolean[][] square, int maxX, int x, int maxY) {
		for (int i = x; i < maxX; i++) {
			for (int j = 0; j < maxY; j++) {
				// 塗りつぶす
				square[i][j] = true;
			}
		}
	}
	
	public static void paintY(boolean[][] square, int maxY, int y, int maxX) {
		for (int i = 0; i < maxX; i++) {
			for (int j = y; j < maxY; j++) {
				// 塗りつぶす
				square[i][j] = true;
			}
		}
	}

}
