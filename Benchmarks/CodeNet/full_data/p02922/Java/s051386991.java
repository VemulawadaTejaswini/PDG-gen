import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 電源タップの口数
		int a = sc.nextInt();
		// 余った電源タップ
		int b = sc.nextInt();
		int total = 0;
		int sum= 0;
		sc.close();

		do {
			total++;
			sum = a* total;
			sum = sum - total +1;
		} while(sum < b);

		// 出力
		System.out.println(total);
	}

}