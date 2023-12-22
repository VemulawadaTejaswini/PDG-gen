import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int h = sc.nextInt();// 縦のマス数
		int w = sc.nextInt();// 横のマス数

		String[] temp = new String[h];
		for(int i = 0; i < h; i++){
			temp[i] = sc.next();
		}

		String[][] s = new String[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				s[i] = temp[i].split("");
			}
		}

		// 判定
		String[][] o = new String[h][w];
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(s[i][j].equals("#")){
					o[i][j] = "#";
				}else{
					int cnt = 0;
					if(i != h - 1 && s[i + 1][j].equals("#")) cnt++; // 下
					if(i != 0 && s[i - 1][j].equals("#")) cnt++;  // 上
					if(j != w - 1 && s[i][j + 1].equals("#")) cnt++;  // 右
					if(j != 0 && s[i][j - 1].equals("#")) cnt++;  // 左
					if(i != 0 && j != w - 1 && s[i - 1][j + 1].equals("#")) cnt++;  // 右上
					if(i != 0 && j != 0 && s[i - 1][j - 1].equals("#")) cnt++;  // 左上
					if(i != h - 1 && j != w - 1 && s[i + 1][j + 1].equals("#")) cnt++;  // 右下
					if(i != h - 1 && j != 0 && s[i + 1][j - 1].equals("#")) cnt++;  // 左下
					o[i][j] = String.valueOf(cnt);
				}
			}
		}
		// 出力
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(j != 0) System.out.print(" ");
				System.out.print(o[i][j]);
				if(j == w - 1) System.out.println();
			}
		}
	}
}


