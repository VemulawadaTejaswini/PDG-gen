import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a;
			int b,t;
			int n,m;
			String result;
			a = sc.nextInt();
			b = sc.nextInt();
			t = sc.nextInt();
			n=t/a;
			m=n*b;
			// 出力

			System.out.println(m);
	}
}