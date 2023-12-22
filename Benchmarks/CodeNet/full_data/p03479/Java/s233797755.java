import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Solve s = new Solve();
		s.solve();
	}

}

class Solve {


	public void solve() {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();

		int count = 0;

//		long add = X;
//		while (add <= Y) {
//			count++;
//			add = add*2;
//		}

		while ((X<<count) <= Y) {
			count++;
		}

		// 出力
		System.out.println(count);
		sc.close();
	}
}