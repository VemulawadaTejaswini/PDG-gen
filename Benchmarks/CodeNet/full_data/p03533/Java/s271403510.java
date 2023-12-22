import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		if(builder.charAt(0) != 'A') {
			builder.insert(0, "A");
		}
		if(builder.length() >= 4 && builder.charAt(4) != 'A') {
			builder.insert(4, "A");
		}
		if(builder.length() >= 6 && builder.charAt(6) != 'A') {
			builder.insert(6, "A");
		}
		if(builder.length() >= 8 && builder.charAt(8) != 'A') {
			builder.insert(8, "A");
		}
		if(builder.toString().equals("AKIHABARA")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
