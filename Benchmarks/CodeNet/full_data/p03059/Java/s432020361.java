import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int t = sc1.nextInt();

		int ans = t / a * b;

		System.out.println(ans);

		sc1.close();

	}

}