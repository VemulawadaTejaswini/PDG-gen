import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < S.length(); i += 2) {
			sb.append(S.charAt(i));
		}
		System.out.println(sb.toString());
	}

}