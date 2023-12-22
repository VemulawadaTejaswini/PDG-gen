import java.util.Scanner;

// https://atcoder.jp/contests/abc137/tasks/abc137_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();


		System.out.println(Math.max(a*b,Math.max(a+b,a-b)));
	}

}
