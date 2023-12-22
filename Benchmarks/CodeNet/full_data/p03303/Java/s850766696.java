import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			String n = sc.next();
			String l = sc.next();

			List<String> list = new ArrayList<>();
			Matcher m = Pattern.compile("[\\s\\S]{1," + l + "}").matcher(n);
			while (m.find()) {
				list.add(m.group());
			}

			StringBuilder sb = new StringBuilder();
			for (String st : list) {
				sb.append(String.valueOf(st.charAt(0)));
			}

			System.out.println(sb.toString());
		}
	}
}
