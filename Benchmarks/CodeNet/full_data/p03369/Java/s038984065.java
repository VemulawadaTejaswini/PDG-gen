import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int c = 0;

		for (int i = 0; i < S.length(); i++) {

			if(S.charAt(i) == 'o') {
				c++;
			}
		}

		System.out.println(700 + c * 100);

		return;
	}

}
