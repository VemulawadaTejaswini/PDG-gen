import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StringBuilder buf = new StringBuilder();

		String S = scan.next();

		Pattern p = Pattern.compile("hi");
		Matcher m = p.matcher(S);

		while(m.find()) {
			buf.append(m.group());
		}

		if(S.equals(buf.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();
	}
}