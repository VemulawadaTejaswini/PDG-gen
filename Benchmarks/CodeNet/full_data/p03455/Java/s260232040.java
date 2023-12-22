import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		//正整数を判定
		if(0 < numberA && 0 < numberB) {
			//積を求める
			int multipl = numberA * numberB;
			//奇数文字列・偶数文字列　変数宣言
			String strNum;
			//偶数・奇数を判定　文字列に代入
			if(multipl % 2 == 0) {
				strNum = "Even";
			}else {
				strNum = "Odd";
			}
			//標準出力
			System.out.print(strNum);
		}
	}
}