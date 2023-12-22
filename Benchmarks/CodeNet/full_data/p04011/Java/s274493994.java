import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = 0;

		int n = sc.nextInt();
		int k = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();

		for(int day = 1; day <= n; day++) {

			if(day <= k) {
				money += x;
			} else {
				money += y;
			}
		}

		System.out.println(money);
	}

}