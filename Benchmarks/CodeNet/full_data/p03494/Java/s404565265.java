import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();

		// 各入力値を取得して2で割れる回数を取得。最大回数を算出する。
		int maxNum = 0;
		for(int i = 0; i < n; i++){
			int a = sc.nextInt(); // 入力値取得
			maxNum = max(maxNum, NumberOfDevision(a));
		}

		// 出力
		System.out.println(maxNum);
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
	static int NumberOfDevision(int n){
		if(isEven(n)){
			return 1 + NumberOfDevision(n/2);
		}else{
			return 0;
		}
	}

}


