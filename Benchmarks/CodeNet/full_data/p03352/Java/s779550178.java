package rensyu;

import java.util.Scanner;

public class HeihouRoot {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        double k;
        int a = sc.nextInt();
        int heiho = (int) Math.floor(Math.sqrt(a));
        System.out.println(heiho * heiho);
	}

}