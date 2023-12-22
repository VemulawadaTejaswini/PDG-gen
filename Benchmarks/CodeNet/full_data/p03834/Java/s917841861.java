
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		String s = sc.next();
		//入力データを処理して、結果を出力
		s = s.replace(",", " ");
		
		System.out.println(s);

	}
}


