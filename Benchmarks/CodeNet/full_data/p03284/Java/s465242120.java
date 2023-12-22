import java.util.Scanner;

public class A105 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = a%b;

		int h = a%b + a;
		if(g >= h) {
			System.out.println(h);
		}else {
			System.out.println(g);
		}
	}

}