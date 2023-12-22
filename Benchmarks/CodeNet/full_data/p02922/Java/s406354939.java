import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 電源タップの口数
		int a = sc.nextInt();
		// 余った電源タップ
		int b = sc.nextInt();
		//タップの個数
		int total = 0;
		//タップ穴の総数
		int sum= 1;
		sc.close();

		do {
			total++;
			sum--;
			sum += a;

		} while(sum < b);

		// 出力
		System.out.println(total);
	}

}
