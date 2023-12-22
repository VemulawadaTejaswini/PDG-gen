import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int start = -1;
		int end = -1;
		for (int i = 0; i < line.length() - 1; i++) {
			String s = String.valueOf(line.charAt(i));
			Pattern p = Pattern.compile(s + s);
			Matcher m = p.matcher(line);
			if (m.find()) {
				start = m.start() + 1;
				end = start + 1;
				break;
			}
			p = Pattern.compile(s + "." + s);
			m = p.matcher(line);
			if (m.find()) {
				start = m.start() + 1;
				end = start + 2;
				break;
			}
		}
		System.out.println(start + " " + end);
	}
}
