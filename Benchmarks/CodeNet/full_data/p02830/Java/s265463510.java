import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		String N = scanner.next();
		String S = scanner.next();
		String T = scanner.next();

		//
		char[] a = S.toCharArray();
		char[] b = T.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < Integer.parseInt(N); i++) {
			
			sb.append(a[i]);
			sb.append(b[i]);

		}
		
		String d = new String(sb);
		System.out.println(d);

		scanner.close();
	}
}