

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int h = n / 100;
		int t = (n % 100) / 10;
		int o = n % 10;

		if (h == 7 || t == 7 || o == 7) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		scanner.close();
	}

}
