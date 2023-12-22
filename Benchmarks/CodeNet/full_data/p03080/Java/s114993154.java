import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int N = sc1.nextInt();
		String s = sc1.next();
		int r = 0;
		int b = 0;

		for ( int i = 0 ; i < N ; i++ ) {
			if (s.charAt(i) == 'R') {
				r++;
			}
			else {
				b++;
			}
		}

		if ( r > b ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc1.close();

	}

}
