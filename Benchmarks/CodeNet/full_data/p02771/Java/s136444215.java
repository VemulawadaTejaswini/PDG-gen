package 競プロ;

import java.util.Scanner;

public class Main {

	public static void main {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if(A==B && A!=C) {
			System.out.println("Yes");
		}
		else if(B==C && A!=C) {
			System.out.println("Yes");
		}
		else if(A==C && A!=B) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
