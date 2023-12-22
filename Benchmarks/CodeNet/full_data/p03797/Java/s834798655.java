import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long c = sc.nextLong();

		if(s * 2 > c ) {

			System.out.print(s);
		}else{

			long  plus = c - s * 2;
			long change = 0;
			if(plus > 3) {
				change = plus / 4;
			}
			System.out.print(s + change);
		}


		sc.close();
	}

}