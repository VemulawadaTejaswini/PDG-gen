package program_beginner_4.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ//

		Scanner scanner = new Scanner (System.in);


		int S = scanner.nextInt();

		for (int i = 0; i < 4; ++i) {

		if(i=='+') {

			System.out.println(S++);}

			else if (i=='-') {

			System.out.println(S--);
		}

}

}

}