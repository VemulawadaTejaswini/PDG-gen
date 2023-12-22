import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int big = n/(a+b);
		int small = n%(a+b);
		int ss = Math.min(small, a);


		int ans = big*a + ss;
		System.out.println(ans);
	}

}
