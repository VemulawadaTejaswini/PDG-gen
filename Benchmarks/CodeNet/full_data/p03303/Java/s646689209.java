import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int w = scan.nextInt();
		scan.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S.length(); i +=w) {
			sb.append(S.substring(i, i + 1));
		}
		System.out.println(sb.toString());
	}
}