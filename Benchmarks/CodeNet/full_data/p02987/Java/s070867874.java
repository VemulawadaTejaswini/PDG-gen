import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		for (int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			int cnt = 0;
			for (int j=0; j<S.length(); j++) {
				if (c == S.charAt(j)){
					cnt++;
				}
			}
			if (cnt != 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}


}