import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int num = 0;

		for (int i = 0; i < 4; i++) {
			if (String.valueOf(S.charAt(i)).equals("+")) {
				num++;
			} else {
				num--;
			}

		}

		System.out.println(num);

	}

}