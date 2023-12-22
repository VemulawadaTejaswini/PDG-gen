import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int X = sc.nextInt();
		sc.close();

		int answer = 0;

		int fivehundred = X / 500 ;
		int five = (X - fivehundred*500) / 5;

		System.out.println(fivehundred*1000 + five*5);
	}

}
