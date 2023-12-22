import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] ans = new String[] {"k", "e", "y", "e", "n", "c", "e"};
		int anscnt = 0;
		int cnt = 0;
		boolean tyokuzen = false;
		boolean flg = false;
		for ( int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 1).equals(ans[anscnt])) {
				anscnt++;
				tyokuzen = true;
			} else if ( tyokuzen ){
				cnt++;
				tyokuzen = false;
			}
			if (cnt > 2) {
				break;
			}
			if (anscnt == 6) {
				flg = true;
				break;
			}
		}
		if (flg) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
