import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long s = sc.nextInt();
		long c = sc.nextInt();

		if(s * 2 >= c ) {
			System.out.print(s);
		}else if(s * 2 < c) {

			long  plus = c - s * 2;
			long change = 0;
			if(plus > 3) {
				change = plus / 4;
			}
			System.out.print(s + change);

		}else {
			System.out.print(0);
		}


		sc.close();
	}

}
