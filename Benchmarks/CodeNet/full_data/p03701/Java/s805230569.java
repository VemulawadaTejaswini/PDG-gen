import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,b,d;
		int c = 0;
		// 試験回数の入力
		N = sc.nextInt();
		
		//合計値の計算
		for(int i = 0;i < N;i++){
			b = sc.nextInt();
		    c = b + c;
		}
		//10の倍数か判定
		d = c % 10;
		if(d == 0){
			c = 0;
		}
		
		//結果の出力
		System.out.println(c);
	}
}
