
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int num = 0;
		int money = 0;
		int money1 = 0;
		int money2 = 0;
		int money3 = 0;

		for (int i = 0; i < a + 1; i++) {
			money1 = i * 500;
			money = money +money1;
			for (int j = 0; j < b + 1; j++) {
				money2 = j * 100;
				money = money1 + money2;
				for (int k = 0; k < c + 1; k++) {
					money3 = k * 50;
					money = money1 + money2 + money3;
					if (money == x) {
						num++;
					}
					money = 0;
				}
			}
		}

		System.out.println(num);
	}

}
