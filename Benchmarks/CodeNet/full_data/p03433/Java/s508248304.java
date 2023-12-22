package atcoder;
import java.util.Scanner;
public class Infinite_Coins {

	public static void main(String[] args) {
		//スキャナ変数の初期化
		Scanner sc = new Scanner(System.in);
		//支払金額を入力から受け取る
		int N = sc.nextInt();
		//1円硬貨の枚数を入力から受け取る
		int A = sc.nextInt();

		//支払金額を500で割った余りを表示
		int C = (N % 500);
		
		//余りがA以下Yes,それ以外はNoを表示する
		if (C <= A ) {
			System.out.print("Yes") ;
		} else  {
			System.out.println("No");
		}

		//scanner閉じ
		 sc.close();
	}

}
