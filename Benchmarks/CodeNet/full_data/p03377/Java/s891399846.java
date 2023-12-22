import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		if (a+b < x) {
			System.out.println("NO");
		} else if (a>x) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

}