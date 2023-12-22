package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		a.replaceAll("0", "");
			System.out.println(a.length());
	}

}
