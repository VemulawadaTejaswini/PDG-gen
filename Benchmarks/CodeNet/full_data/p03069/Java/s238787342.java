import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		String s = sc1.next();

		int a = 0;
		int b = 0;

		for ( int i = 0 ; i < n ; i++) {
			if ( s.charAt(i) == '.' ) {
				a++;
			}
			else {
				b++;
			}
		}

		if ( a > b ) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}

		sc1.close();

	}

}