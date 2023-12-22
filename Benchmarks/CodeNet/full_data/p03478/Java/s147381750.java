import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// N
		int a = sc.nextInt();// A
		int b = sc.nextInt();// B


		// 各桁の数の和がa以上b以下ならカウントアップ
		int Num = 0;
		for(int i = 1; i <= n; i++){
			if(a <= sumEach(i) && sumEach(i) <= b){
				Num = Num + i;
			}
		}

		// 出力
		System.out.println(Num);
	}

	// 各桁の数の和を算出
	static int sumEach(int n){
		
		String s = String.valueOf(n);

		int sum = 0;
		for(int i = 0; i < s.length(); i++){
			sum = sum + Integer.parseInt(s.substring(i, i + 1));
		}
		return sum;
	}

}


