import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int wk;
		if (a2 > a3) {
			wk = a2;
			a2 = a3;
			a3 = wk;
		}

		int cost = Math.abs(a2 -a1) + Math.abs(a3 - a2);
		// 出力
		System.out.println(cost);
	}