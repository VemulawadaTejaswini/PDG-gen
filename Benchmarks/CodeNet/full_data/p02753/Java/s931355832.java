import java.util.Scanner;

// https://atcoder.jp/contests/abc158/tasks/abc158_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		S = S.replace("A", "");
		int ans = S.length();

		if(ans==3||ans==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}



	}
}
