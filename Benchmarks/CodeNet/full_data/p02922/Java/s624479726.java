import java.util.Scanner;

// https://atcoder.jp/contests/abc139/tasks/abc139_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int ans = 1;
		int count = 1;

		while(true) {
			count = ans*(A-1) + 1;
			if(count>=B) {
				break;
			}
			ans++;
		}

		System.out.println(ans);

	}

}
