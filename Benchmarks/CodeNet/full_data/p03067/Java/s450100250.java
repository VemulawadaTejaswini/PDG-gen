

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		if(a<b) {if(a<=c&&c<=b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		}else {
			if(b<=c&&c<=a) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}


	}

}
