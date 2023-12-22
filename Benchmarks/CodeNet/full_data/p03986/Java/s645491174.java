import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtCoder {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String in = br.readLine();
		long num = (long) Math.pow(10, 10000);
		Matcher m = Pattern.compile("ST").matcher(in);
		long i = 0;
		while (m.find() && i < num) {
			in = m.replaceFirst("");
			i++;
		}
		System.out.println(in.length());
	}
}
