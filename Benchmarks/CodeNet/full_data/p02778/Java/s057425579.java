import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		StringBuilder sb  = new StringBuilder();
		
		for(int i = 0; i < S.length(); i++) {
			sb.append('x');
		}

		System.out.println(sb.toString());
	}
}