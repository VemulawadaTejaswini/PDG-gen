import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int h = sc1.nextInt();
		int w = sc1.nextInt();
		int ans = 0;

		ans = (n-h+1) * (n-w+1);

		System.out.println(ans);

		sc1.close();

	}

}