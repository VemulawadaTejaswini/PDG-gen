import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// お札の枚数（10000万円札、5000円札、1000円札）
		int y = sc.nextInt();// 合計金額(1000の倍数)

		// 計算
		int[] pattern = new int[3];
		pattern = getPattern(n, 0, 0, 0, y);

		// 出力
		System.out.println(pattern[0] + " " + pattern[1] + " " + pattern[2]);
	}

	// パターン数を再帰的に計算
	static int[] getPattern(int n, int a, int b, int c, int y){

		
		// マッチ
		if(10000 * a + 5000 * b + 1000 * c == y){
			int[] list = {a, b, c};
			return 	list;
		}

		int[] listNoMatch = {-1, -1, -1};

		if(n > 0){
			int[] patternA = getPattern(n - 1, a + 1, b, c, y);
			int[] patternB = getPattern(n - 1, a, b + 1, c, y);
			int[] patternC = getPattern(n - 1, a, b, c + 1, y);

			if(patternA[0] != -1){
				return patternA;
			}
			if(patternB[0] != -1){
				return patternB;
			}
			if(patternC[0] != -1){
				return patternC;
			}
			return listNoMatch;
		}else{
			return listNoMatch;
		}
	}
}


