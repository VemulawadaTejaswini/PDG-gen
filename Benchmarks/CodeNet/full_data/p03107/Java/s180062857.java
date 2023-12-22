import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int answer = 0;
		boolean possible = true;
		int nowLen = 0;

		while (possible) {
			nowLen = S.length();
			S = S.replace("01", "");
			S = S.replace("10", "");
			answer += nowLen - S.length();

			if (S.indexOf("01") == -1 && S.indexOf("10") == -1) possible = false;
		}

		System.out.println(answer);
	}
}