import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int n = scan.nextInt();
		String s = "";
		for (int i = 0; i < n; i++) s+="0";
		StringBuilder sb = new StringBuilder(s);
		int m = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			int pos = scan.nextInt()-1;
			int num = scan.nextInt();
			if (sb.charAt(pos) != '0' && sb.charAt(pos) != Character.forDigit(num, 10)) {
				System.out.println(-1);
				return;
			}
			sb.setCharAt(pos, Character.forDigit(num, 10));;
		}
		
		String temp = sb.toString();
		if (Integer.parseInt(temp) == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sb.toString());
		
	}

}