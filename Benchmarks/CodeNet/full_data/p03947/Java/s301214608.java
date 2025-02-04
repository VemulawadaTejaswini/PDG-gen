import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int cnt = 0;
		char last = 'x';
		for (char c : S.toCharArray()) {
			if (c != last) {
				cnt++;
			}
			last = c;
		}

		System.out.println(cnt - 1);
	}
}
