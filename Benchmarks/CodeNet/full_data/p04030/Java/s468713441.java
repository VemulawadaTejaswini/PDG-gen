import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");

		String n = s.nextLine();
		int na = n.length();
		int i = 0;

		for (i = 0; i < na; i++) {
			String a = n.charAt(i) + "";
			if (a.equals("0")) {
				sb.append("0");
			} else if (a.equals("1")) {
				sb.append("1");
			} else if (a.equals("B")) {
				if (sb.length()==0) {
					sb.append("");
				} else {
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}

		System.out.println(sb);

	}

}