
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//標準入力から文字列を取得する(行単位)
		String s = sc.nextLine();
		//文字列を一文字に分解する
		String[] aryStr = s.split("");

		int money = 700;

		for(int i = 0; i < aryStr.length; i++) {
			if(aryStr[i].equals("o")) {
				money += 100;
			}
		}
		System.out.println(money);
	}
}
