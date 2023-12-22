
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < B.length(); i++) {
			sb.append(A.charAt(i));
			sb.append(B.charAt(i));
		}

		if (A.length() > B.length()) {
			sb.append(A.charAt(B.length()));
		}

		System.out.println(sb.toString());


	}

}
