import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		
		char tmp = s.charAt(k - 1);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == tmp) {
				sb.append(tmp);
			} else {
				sb.append('*');
			}
		}
		
		System.out.printf(sb.toString());
	}
}
