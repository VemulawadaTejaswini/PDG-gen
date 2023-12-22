import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ans = "Good" ;
		String S = scan.next();
		char[] str = S.toCharArray();

		for (int i = 0;i < 3;i++) {
			if (str[i] == str[i+1]) {
				ans = "Bad";
				break;
			}
		}

		System.out.println(ans);
	}
}