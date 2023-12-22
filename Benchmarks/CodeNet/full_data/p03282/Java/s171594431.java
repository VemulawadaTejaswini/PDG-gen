import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		double K = sc.nextDouble();
		int oneIndex = -1;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '1') {
				oneIndex = i - 1;
				break;
			}
		}

		if (K <= oneIndex && oneIndex != -1) {
			System.out.println("1");
		} else {
			System.out.println(S.charAt(oneIndex + 1));
		}
	}

}
