import java.util.*;

public class Main{
	public static void main(String args[]){

		// 定数
		// 入力値取得
		double need = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 判定
		// 同じ場合
		if(a != 0 && b != 0){
			if(a >= b){
				need = 1.0;
				// System.out.println((int)Math.ceil(need));
			}
			// Aの方が足りない場合
			else{
				need = (double)b / (double)a;

			}
		}
		System.out.println((int)Math.ceil(need));

	}
}