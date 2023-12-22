import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		String s = in.next();

		int r = c > d ? c : d;
		s = s.substring(a - 1, r);

		// 岩2連続以上→不可能
		if ( s.contains("##") ) {
			System.err.println("No");
		} else {

			// 追い越しの必要がない場合
			if ( c < d ) {
				System.err.println("Yes");
			} else
			// 追い越しの必要がある場合
			if ( d < c ) {
				// 追い越し場所ない場合
				if ( !s.contains("...") ) {
					System.err.println("No");
				} else {
					System.err.println("Yes");
				}
			}
		}
		in.close();
	}
}
