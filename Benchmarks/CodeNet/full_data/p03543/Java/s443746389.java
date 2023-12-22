package atcoder079_a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = x/1000;
		int b = x/100 -a*10;
		int c = x/10 -a*100 + b*10;
		int d = x-a*1000-b*100-c*10;


		if(a==b&&b==c||b==c&&c==d) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}

}
