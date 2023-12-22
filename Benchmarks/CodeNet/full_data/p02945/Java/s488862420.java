

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int A = Integer.parseInt(lines[0]);
		int B = Integer.parseInt(lines[1]);

		int plus = A + B;
		int minus = A - B;
		int astarisc = A * B;
		int max = -10000;
		if (max < plus) {
			max = plus;
		}
		if (max < minus) {
			max = minus;
		}
		if (max < astarisc) {
			max = astarisc;
		}

		System.out.println(max);
	}

}
