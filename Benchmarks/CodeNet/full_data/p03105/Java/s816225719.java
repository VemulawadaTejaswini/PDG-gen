import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int d = 0;
		for (int i = 1; i * a <= b; i++) {
			d = i;
			if (i == c) {
				break;
			}

		}
		System.out.println(d);

	}

}
