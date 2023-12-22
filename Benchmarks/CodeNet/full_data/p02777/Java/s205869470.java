import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc= new Scanner(System.in);

		//ボールに書かれた文字列
		String s = sc.next();
		//
		String t = sc.next();

		//ボールの数
		int a = sc.nextInt();
		int b = sc.nextInt();

		//捨てるボールに書かれた文字列
		String u = sc.next();

		if(u.equals(s)) {
			a--;
		}
		else {
			b--;
		}

		System.out.println(a + " " + b);
		sc.close();

	}

}
