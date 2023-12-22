import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int d = sc1.nextInt();
		int n = sc1.nextInt();

		if ( d == 0 ) {
			if (n < 100) {
				System.out.println(n);
			}
			else {
				System.out.println(n + 1);
			}
		}
		else if ( d == 1 ){
			if (n < 100) {
				System.out.println( n * 100);
			}
			else {
				System.out.println( n * 100 + 100);
			}
		}
		else {
			if (n < 100) {
				System.out.println( n * 10000);
			}
			else {
				System.out.println( n * 10000 + 10000);
			}
		}

		sc1.close();

	}

}
