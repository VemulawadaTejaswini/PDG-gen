import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		char[] array =s.toCharArray();

		int countB = 0;
		int ans = 0;

		for (char c : array) {

			if(c == 'B') {
				countB++;
			} else {
				ans += countB;
			}

		}

		System.out.println(ans);

	}

}
