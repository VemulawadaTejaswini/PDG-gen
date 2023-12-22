import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int c = sc.nextInt();

		if(s * 2 >= c ) {
			System.out.print(s);
		}else if(s * 2 < c) {

			int  plus = c - s * 2;
			int change = 0;
			if(plus > 2) {
				change = plus / 4;
			}
			System.out.print(s + change);

		}else {
			System.out.print(0);
		}


		sc.close();
	}

}