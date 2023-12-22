import java.util.*;

public class Main{
	public static void main(String args[]){

		// 定数
		// 入力値取得
		double need = 0;
		double d = 1;
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		// 判定
		// 同じ場合

		if(b == 0){
			System.out.println((int)need);
		}else{
			if(a >= b){
				need = 1.0;
				// System.out.println((int)Math.ceil(need));
			}
			// Aの方が足りない場合
			else{
				for(int i = 1;i<=b;i++){
					d = d -1 + a;
					if(d >= b){
						need = i + 1;
						break;
					}
				}
			}
			System.out.println((int)need);
		}	

	}
}