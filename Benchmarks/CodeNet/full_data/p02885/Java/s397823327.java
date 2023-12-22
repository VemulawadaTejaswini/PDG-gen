import java.util.Scanner;

// https://atcoder.jp/contests/abc143/tasks/abc143_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();


		//あまり部分0以上ならば完全に隠れる。
		int result = 2*B - A;
		if(result>=0) {
			System.out.println(0);
		} else {
			System.out.println((-1)*result);
		}



	}
}
