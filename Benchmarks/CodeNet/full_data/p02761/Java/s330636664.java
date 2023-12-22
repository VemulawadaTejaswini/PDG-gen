import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int n = scan.nextInt();
		if (n == 0) {
			System.out.println(0);
			return;
		}
		String s = "";
		
		int m = scan.nextInt();
		for (int i = 0; i < m; i++) s+="0";
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < m; i++) {
			int pos = scan.nextInt()-1;
			int num = scan.nextInt();
			if (sb.charAt(pos) != '0' && sb.charAt(pos) != Character.forDigit(num, 10)) {
				System.out.println(-1);
				return;
			}
			sb.setCharAt(pos, Character.forDigit(num, 10));;
		}
		
	
		if (sb.charAt(0) == '0' && sb.length() != 1) {
			sb.setCharAt(0, '1');
		}
		
		System.out.println(sb.toString());
		
	}

}