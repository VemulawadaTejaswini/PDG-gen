import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//対象の文字列をセット
		String strTgt = sc.next();

		//文字の位置をセット
		long lngCharPos = sc.nextLong();

		char charResult = 0;
		for(int i = 0;  i < lngCharPos; i++) {

			//i番目の文字を取得
			charResult = strTgt.charAt(i);

			//「1」以外の場合
			if(charResult != '1') {
				break;
			}

		}

		//アウトプット
		System.out.println(charResult);

	}

}
