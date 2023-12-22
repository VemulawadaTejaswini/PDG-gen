import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int values[] = new int[n];

		for(int i = 0; i < n; i++){
			values[i] = sc.nextInt(); // 入力値取得
		}

		// 操作が可能な限り実行する。
		int minNum = NumberOfDevision(values);

		// 出力
		System.out.println(minNum);
	}

	// 偶数かどうかを判定
	static boolean isEven(int n){
		if(n%2 == 0){
			return true;
		}else{
			return false;
		}
	}

	// 2で割り切れる回数を取得
	static int NumberOfDevision(int[] values){
		for(int i = 0; i < values.length; i++){
			if(isEven(values[i])){
				values[i] = values[i]/2;
			}else{
				return 0;
			}
		}
		return 1 + NumberOfDevision(values);
	}
}


