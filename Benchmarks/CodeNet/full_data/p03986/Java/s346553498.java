import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int len = 0;
		do {
			len = S.length();
			S = S.replaceAll("ST", "");
		} while (len!=S.length());
		System.out.println(len);
		sc.close();
	}

}
